package no.hal.pg.http.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

import no.hal.pg.http.IReferenceResolver;
import no.hal.pg.http.IRequestPathResolver;
import no.hal.pg.http.IRequestQueryExecutor;
import no.hal.pg.http.util.CompositeReferenceResolver;

@Component
public class RequestHandler extends CompositeReferenceResolver implements IRequestPathResolver, IRequestQueryExecutor {

	@Override
	@Reference(
			cardinality=ReferenceCardinality.MULTIPLE,			
			policy=ReferencePolicy.DYNAMIC,
			unbind="removeReferenceResolver"
			)
	public void addReferenceResolver(IReferenceResolver referenceResolver) {
		super.addReferenceResolver(referenceResolver);
	}
	@Override
	public void removeReferenceResolver(IReferenceResolver referenceResolver) {
		super.removeReferenceResolver(referenceResolver);
	}
	
	private no.hal.pg.http.auth.ISubjectProvider<?> subjectProvider;
	
	@Override
	public void setSubjectProvider(no.hal.pg.http.auth.ISubjectProvider<?> subjectProvider) {
		this.subjectProvider = subjectProvider;
	}

	@Override
	public Object getObjectForPath(Collection<? extends Object> rootObjects, String... segments) {
		RequestSupport requestSupport = new RequestSupport(rootObjects);
		requestSupport.setReferenceResolver(this);
		requestSupport.setSubjectProvider(subjectProvider);
		for (int i = 0; i < segments.length; i++) {
			String segment = segments[i];
			requestSupport.nextStep(segment, null);
		}
		return requestSupport.getObjects();
	}

	@Override
	public Object getRequestQueryResult(Collection<?> target, String op, Map<String, ?> parameters) {
		RequestSupport requestSupport = new RequestSupport(new BasicEList<Object>(target));
		requestSupport.setReferenceResolver(this);
		requestSupport.setSubjectProvider(subjectProvider);
		return requestSupport.nextStep(op, parameters);
	}
}

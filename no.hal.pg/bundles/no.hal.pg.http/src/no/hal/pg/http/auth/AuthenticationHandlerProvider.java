package no.hal.pg.http.auth;

import org.eclipse.emf.ecore.EObject;

public interface AuthenticationHandlerProvider {
	public AuthenticationHandler<?> getAuthenticationHandler(EObject context);
}

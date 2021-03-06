/**
 */
package no.hal.pg.runtime.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.pg.runtime.Condition;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.Team;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.impl.TaskImpl#getGame <em>Game</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.TaskImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.TaskImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.TaskImpl#getResult <em>Result</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.TaskImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.TaskImpl#getFinishTime <em>Finish Time</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.TaskImpl#getStartConditions <em>Start Conditions</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.TaskImpl#getFinishConditions <em>Finish Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl<R> extends MinimalEObjectImpl.Container implements Task<R> {
	/**
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected Team team;
	/**
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> players;
	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected R result;
	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long START_TIME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Long startTime = START_TIME_EDEFAULT;
	/**
	 * The default value of the '{@link #getFinishTime() <em>Finish Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long FINISH_TIME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFinishTime() <em>Finish Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishTime()
	 * @generated
	 * @ordered
	 */
	protected Long finishTime = FINISH_TIME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getStartConditions() <em>Start Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> startConditions;
	/**
	 * The cached value of the '{@link #getFinishConditions() <em>Finish Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> finishConditions;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Game getGame() {
		if (eContainerFeatureID() != RuntimePackage.TASK__GAME) return null;
		return (Game)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGame(Game newGame, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGame, RuntimePackage.TASK__GAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGame(Game newGame) {
		if (newGame != eInternalContainer() || (eContainerFeatureID() != RuntimePackage.TASK__GAME && newGame != null)) {
			if (EcoreUtil.isAncestor(this, newGame))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGame != null)
				msgs = ((InternalEObject)newGame).eInverseAdd(this, RuntimePackage.GAME__TASKS, Game.class, msgs);
			msgs = basicSetGame(newGame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.TASK__GAME, newGame, newGame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Team getTeam() {
		if (team != null && team.eIsProxy()) {
			InternalEObject oldTeam = (InternalEObject)team;
			team = (Team)eResolveProxy(oldTeam);
			if (team != oldTeam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.TASK__TEAM, oldTeam, team));
			}
		}
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetTeam() {
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTeam(Team newTeam) {
		Team oldTeam = team;
		team = newTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.TASK__TEAM, oldTeam, team));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Player> getPlayers() {
		if (players == null) {
			players = new EObjectResolvingEList<Player>(Player.class, this, RuntimePackage.TASK__PLAYERS);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Player> getAllPlayers() {
		List<Player> allPlayers = new ArrayList<Player>(getPlayers());
		if (getTeam() != null) {
			allPlayers.addAll(getTeam().getAllPlayers());
		}
		return ECollections.unmodifiableEList(allPlayers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public R getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResult(R newResult) {
		R oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.TASK__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTime(Long newStartTime) {
		Long oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.TASK__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFinishTime() {
		return finishTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinishTime(Long newFinishTime) {
		Long oldFinishTime = finishTime;
		finishTime = newFinishTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.TASK__FINISH_TIME, oldFinishTime, finishTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Condition> getStartConditions() {
		if (startConditions == null) {
			startConditions = new EObjectContainmentEList<Condition>(Condition.class, this, RuntimePackage.TASK__START_CONDITIONS);
		}
		return startConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Condition> getFinishConditions() {
		if (finishConditions == null) {
			finishConditions = new EObjectContainmentEList<Condition>(Condition.class, this, RuntimePackage.TASK__FINISH_CONDITIONS);
		}
		return finishConditions;
	}

	static boolean test(Iterable<Condition> conditions) {
		for (Condition predicate : conditions) {
			if (! predicate.test()) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean canStart() {
		return TaskImpl.test(getStartConditions());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isStarted() {
		return isValidTime(getStartTime());
	}
	
	public static boolean isValidTime(Long time) {
		return time != null && time >= 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isFinished() {
		return isValidTime(getFinishTime()) && getResult() != null && TaskImpl.test(getFinishConditions());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void start() {
		if (! canStart()) {
			throw new IllegalStateException("Cannot start a task that isn't enabled");
		}
		setStartTime(getCurrentTime());
	}

	static long getCurrentTime() {
		return System.currentTimeMillis();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void finish(R result) {
		if (! isStarted()) {
			throw new IllegalStateException("Cannot start a task that isn't started");
		}
		if (TaskImpl.test(getFinishConditions())) {
			setResult(result);
			setFinishTime(getCurrentTime());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.TASK__GAME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGame((Game)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.TASK__GAME:
				return basicSetGame(null, msgs);
			case RuntimePackage.TASK__START_CONDITIONS:
				return ((InternalEList<?>)getStartConditions()).basicRemove(otherEnd, msgs);
			case RuntimePackage.TASK__FINISH_CONDITIONS:
				return ((InternalEList<?>)getFinishConditions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RuntimePackage.TASK__GAME:
				return eInternalContainer().eInverseRemove(this, RuntimePackage.GAME__TASKS, Game.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.TASK__GAME:
				return getGame();
			case RuntimePackage.TASK__TEAM:
				if (resolve) return getTeam();
				return basicGetTeam();
			case RuntimePackage.TASK__PLAYERS:
				return getPlayers();
			case RuntimePackage.TASK__RESULT:
				return getResult();
			case RuntimePackage.TASK__START_TIME:
				return getStartTime();
			case RuntimePackage.TASK__FINISH_TIME:
				return getFinishTime();
			case RuntimePackage.TASK__START_CONDITIONS:
				return getStartConditions();
			case RuntimePackage.TASK__FINISH_CONDITIONS:
				return getFinishConditions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RuntimePackage.TASK__GAME:
				setGame((Game)newValue);
				return;
			case RuntimePackage.TASK__TEAM:
				setTeam((Team)newValue);
				return;
			case RuntimePackage.TASK__PLAYERS:
				getPlayers().clear();
				getPlayers().addAll((Collection<? extends Player>)newValue);
				return;
			case RuntimePackage.TASK__RESULT:
				setResult((R)newValue);
				return;
			case RuntimePackage.TASK__START_TIME:
				setStartTime((Long)newValue);
				return;
			case RuntimePackage.TASK__FINISH_TIME:
				setFinishTime((Long)newValue);
				return;
			case RuntimePackage.TASK__START_CONDITIONS:
				getStartConditions().clear();
				getStartConditions().addAll((Collection<? extends Condition>)newValue);
				return;
			case RuntimePackage.TASK__FINISH_CONDITIONS:
				getFinishConditions().clear();
				getFinishConditions().addAll((Collection<? extends Condition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RuntimePackage.TASK__GAME:
				setGame((Game)null);
				return;
			case RuntimePackage.TASK__TEAM:
				setTeam((Team)null);
				return;
			case RuntimePackage.TASK__PLAYERS:
				getPlayers().clear();
				return;
			case RuntimePackage.TASK__RESULT:
				setResult((R)null);
				return;
			case RuntimePackage.TASK__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case RuntimePackage.TASK__FINISH_TIME:
				setFinishTime(FINISH_TIME_EDEFAULT);
				return;
			case RuntimePackage.TASK__START_CONDITIONS:
				getStartConditions().clear();
				return;
			case RuntimePackage.TASK__FINISH_CONDITIONS:
				getFinishConditions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RuntimePackage.TASK__GAME:
				return getGame() != null;
			case RuntimePackage.TASK__TEAM:
				return team != null;
			case RuntimePackage.TASK__PLAYERS:
				return players != null && !players.isEmpty();
			case RuntimePackage.TASK__RESULT:
				return result != null;
			case RuntimePackage.TASK__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case RuntimePackage.TASK__FINISH_TIME:
				return FINISH_TIME_EDEFAULT == null ? finishTime != null : !FINISH_TIME_EDEFAULT.equals(finishTime);
			case RuntimePackage.TASK__START_CONDITIONS:
				return startConditions != null && !startConditions.isEmpty();
			case RuntimePackage.TASK__FINISH_CONDITIONS:
				return finishConditions != null && !finishConditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RuntimePackage.TASK___CAN_START:
				return canStart();
			case RuntimePackage.TASK___IS_STARTED:
				return isStarted();
			case RuntimePackage.TASK___IS_FINISHED:
				return isFinished();
			case RuntimePackage.TASK___START:
				start();
				return null;
			case RuntimePackage.TASK___FINISH__OBJECT:
				finish((R)arguments.get(0));
				return null;
			case RuntimePackage.TASK___GET_ALL_PLAYERS:
				return getAllPlayers();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (result: ");
		result.append(result);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", finishTime: ");
		result.append(finishTime);
		result.append(')');
		return result.toString();
	}

} //TaskImpl

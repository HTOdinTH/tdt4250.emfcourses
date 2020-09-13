/**
 */
package eMFCourses.impl;

import eMFCourses.EMFCoursesPackage;
import eMFCourses.Programme;
import eMFCourses.Semester;
import eMFCourses.Slot;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eMFCourses.impl.SemesterImpl#getProgramme <em>Programme</em>}</li>
 *   <li>{@link eMFCourses.impl.SemesterImpl#getSlots <em>Slots</em>}</li>
 *   <li>{@link eMFCourses.impl.SemesterImpl#getNextSemesterOptions <em>Next Semester Options</em>}</li>
 *   <li>{@link eMFCourses.impl.SemesterImpl#getPreviousSemester <em>Previous Semester</em>}</li>
 *   <li>{@link eMFCourses.impl.SemesterImpl#getSpecialization <em>Specialization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The cached value of the '{@link #getSlots() <em>Slots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<Slot> slots;

	/**
	 * The cached value of the '{@link #getNextSemesterOptions() <em>Next Semester Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextSemesterOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> nextSemesterOptions;

	/**
	 * The default value of the '{@link #getSpecialization() <em>Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIALIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecialization() <em>Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected String specialization = SPECIALIZATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFCoursesPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme getProgramme() {
		if (eContainerFeatureID() != EMFCoursesPackage.SEMESTER__PROGRAMME)
			return null;
		return (Programme) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramme(Programme newProgramme, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newProgramme, EMFCoursesPackage.SEMESTER__PROGRAMME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramme(Programme newProgramme) {
		if (newProgramme != eInternalContainer()
				|| (eContainerFeatureID() != EMFCoursesPackage.SEMESTER__PROGRAMME && newProgramme != null)) {
			if (EcoreUtil.isAncestor(this, newProgramme))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgramme != null)
				msgs = ((InternalEObject) newProgramme).eInverseAdd(this, EMFCoursesPackage.PROGRAMME__ROOT_SEMESTERS,
						Programme.class, msgs);
			msgs = basicSetProgramme(newProgramme, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFCoursesPackage.SEMESTER__PROGRAMME, newProgramme,
					newProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Slot> getSlots() {
		if (slots == null) {
			slots = new EObjectContainmentWithInverseEList<Slot>(Slot.class, this, EMFCoursesPackage.SEMESTER__SLOTS,
					EMFCoursesPackage.SLOT__SEMESTER);
		}
		return slots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getNextSemesterOptions() {
		if (nextSemesterOptions == null) {
			nextSemesterOptions = new EObjectContainmentWithInverseEList<Semester>(Semester.class, this,
					EMFCoursesPackage.SEMESTER__NEXT_SEMESTER_OPTIONS, EMFCoursesPackage.SEMESTER__PREVIOUS_SEMESTER);
		}
		return nextSemesterOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester getPreviousSemester() {
		if (eContainerFeatureID() != EMFCoursesPackage.SEMESTER__PREVIOUS_SEMESTER)
			return null;
		return (Semester) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousSemester(Semester newPreviousSemester, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPreviousSemester, EMFCoursesPackage.SEMESTER__PREVIOUS_SEMESTER,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreviousSemester(Semester newPreviousSemester) {
		if (newPreviousSemester != eInternalContainer()
				|| (eContainerFeatureID() != EMFCoursesPackage.SEMESTER__PREVIOUS_SEMESTER
						&& newPreviousSemester != null)) {
			if (EcoreUtil.isAncestor(this, newPreviousSemester))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPreviousSemester != null)
				msgs = ((InternalEObject) newPreviousSemester).eInverseAdd(this,
						EMFCoursesPackage.SEMESTER__NEXT_SEMESTER_OPTIONS, Semester.class, msgs);
			msgs = basicSetPreviousSemester(newPreviousSemester, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFCoursesPackage.SEMESTER__PREVIOUS_SEMESTER,
					newPreviousSemester, newPreviousSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecialization() {
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialization(String newSpecialization) {
		String oldSpecialization = specialization;
		specialization = newSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFCoursesPackage.SEMESTER__SPECIALIZATION,
					oldSpecialization, specialization));
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
		case EMFCoursesPackage.SEMESTER__PROGRAMME:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetProgramme((Programme) otherEnd, msgs);
		case EMFCoursesPackage.SEMESTER__SLOTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSlots()).basicAdd(otherEnd, msgs);
		case EMFCoursesPackage.SEMESTER__NEXT_SEMESTER_OPTIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNextSemesterOptions()).basicAdd(otherEnd,
					msgs);
		case EMFCoursesPackage.SEMESTER__PREVIOUS_SEMESTER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPreviousSemester((Semester) otherEnd, msgs);
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
		case EMFCoursesPackage.SEMESTER__PROGRAMME:
			return basicSetProgramme(null, msgs);
		case EMFCoursesPackage.SEMESTER__SLOTS:
			return ((InternalEList<?>) getSlots()).basicRemove(otherEnd, msgs);
		case EMFCoursesPackage.SEMESTER__NEXT_SEMESTER_OPTIONS:
			return ((InternalEList<?>) getNextSemesterOptions()).basicRemove(otherEnd, msgs);
		case EMFCoursesPackage.SEMESTER__PREVIOUS_SEMESTER:
			return basicSetPreviousSemester(null, msgs);
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
		case EMFCoursesPackage.SEMESTER__PROGRAMME:
			return eInternalContainer().eInverseRemove(this, EMFCoursesPackage.PROGRAMME__ROOT_SEMESTERS,
					Programme.class, msgs);
		case EMFCoursesPackage.SEMESTER__PREVIOUS_SEMESTER:
			return eInternalContainer().eInverseRemove(this, EMFCoursesPackage.SEMESTER__NEXT_SEMESTER_OPTIONS,
					Semester.class, msgs);
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
		case EMFCoursesPackage.SEMESTER__PROGRAMME:
			return getProgramme();
		case EMFCoursesPackage.SEMESTER__SLOTS:
			return getSlots();
		case EMFCoursesPackage.SEMESTER__NEXT_SEMESTER_OPTIONS:
			return getNextSemesterOptions();
		case EMFCoursesPackage.SEMESTER__PREVIOUS_SEMESTER:
			return getPreviousSemester();
		case EMFCoursesPackage.SEMESTER__SPECIALIZATION:
			return getSpecialization();
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
		case EMFCoursesPackage.SEMESTER__PROGRAMME:
			setProgramme((Programme) newValue);
			return;
		case EMFCoursesPackage.SEMESTER__SLOTS:
			getSlots().clear();
			getSlots().addAll((Collection<? extends Slot>) newValue);
			return;
		case EMFCoursesPackage.SEMESTER__NEXT_SEMESTER_OPTIONS:
			getNextSemesterOptions().clear();
			getNextSemesterOptions().addAll((Collection<? extends Semester>) newValue);
			return;
		case EMFCoursesPackage.SEMESTER__PREVIOUS_SEMESTER:
			setPreviousSemester((Semester) newValue);
			return;
		case EMFCoursesPackage.SEMESTER__SPECIALIZATION:
			setSpecialization((String) newValue);
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
		case EMFCoursesPackage.SEMESTER__PROGRAMME:
			setProgramme((Programme) null);
			return;
		case EMFCoursesPackage.SEMESTER__SLOTS:
			getSlots().clear();
			return;
		case EMFCoursesPackage.SEMESTER__NEXT_SEMESTER_OPTIONS:
			getNextSemesterOptions().clear();
			return;
		case EMFCoursesPackage.SEMESTER__PREVIOUS_SEMESTER:
			setPreviousSemester((Semester) null);
			return;
		case EMFCoursesPackage.SEMESTER__SPECIALIZATION:
			setSpecialization(SPECIALIZATION_EDEFAULT);
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
		case EMFCoursesPackage.SEMESTER__PROGRAMME:
			return getProgramme() != null;
		case EMFCoursesPackage.SEMESTER__SLOTS:
			return slots != null && !slots.isEmpty();
		case EMFCoursesPackage.SEMESTER__NEXT_SEMESTER_OPTIONS:
			return nextSemesterOptions != null && !nextSemesterOptions.isEmpty();
		case EMFCoursesPackage.SEMESTER__PREVIOUS_SEMESTER:
			return getPreviousSemester() != null;
		case EMFCoursesPackage.SEMESTER__SPECIALIZATION:
			return SPECIALIZATION_EDEFAULT == null ? specialization != null
					: !SPECIALIZATION_EDEFAULT.equals(specialization);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Specialization: ");
		result.append(specialization);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl

/**
 */
package eMFCourses.impl;

import eMFCourses.EMFCoursesPackage;
import eMFCourses.Programme;
import eMFCourses.Semester;
import eMFCourses.Year;

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
 * An implementation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eMFCourses.impl.YearImpl#getProgramme <em>Programme</em>}</li>
 *   <li>{@link eMFCourses.impl.YearImpl#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link eMFCourses.impl.YearImpl#getTotalCredits <em>Total Credits</em>}</li>
 *   <li>{@link eMFCourses.impl.YearImpl#getPreviousYear <em>Previous Year</em>}</li>
 *   <li>{@link eMFCourses.impl.YearImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link eMFCourses.impl.YearImpl#getNextYearOptions <em>Next Year Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YearImpl extends MinimalEObjectImpl.Container implements Year {
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
	 * The default value of the '{@link #getTotalCredits() <em>Total Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * The cached value of the '{@link #getNextYearOptions() <em>Next Year Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextYearOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Year> nextYearOptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YearImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFCoursesPackage.Literals.YEAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme getProgramme() {
		if (eContainerFeatureID() != EMFCoursesPackage.YEAR__PROGRAMME)
			return null;
		return (Programme) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramme(Programme newProgramme, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newProgramme, EMFCoursesPackage.YEAR__PROGRAMME, msgs);
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
				|| (eContainerFeatureID() != EMFCoursesPackage.YEAR__PROGRAMME && newProgramme != null)) {
			if (EcoreUtil.isAncestor(this, newProgramme))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgramme != null)
				msgs = ((InternalEObject) newProgramme).eInverseAdd(this, EMFCoursesPackage.PROGRAMME__ROOT_YEARS,
						Programme.class, msgs);
			msgs = basicSetProgramme(newProgramme, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFCoursesPackage.YEAR__PROGRAMME, newProgramme,
					newProgramme));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFCoursesPackage.YEAR__SPECIALIZATION,
					oldSpecialization, specialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentWithInverseEList<Semester>(Semester.class, this,
					EMFCoursesPackage.YEAR__SEMESTERS, EMFCoursesPackage.SEMESTER__YEAR);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Year> getNextYearOptions() {
		if (nextYearOptions == null) {
			nextYearOptions = new EObjectContainmentWithInverseEList<Year>(Year.class, this,
					EMFCoursesPackage.YEAR__NEXT_YEAR_OPTIONS, EMFCoursesPackage.YEAR__PREVIOUS_YEAR);
		}
		return nextYearOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Year getPreviousYear() {
		if (eContainerFeatureID() != EMFCoursesPackage.YEAR__PREVIOUS_YEAR)
			return null;
		return (Year) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousYear(Year newPreviousYear, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPreviousYear, EMFCoursesPackage.YEAR__PREVIOUS_YEAR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreviousYear(Year newPreviousYear) {
		if (newPreviousYear != eInternalContainer()
				|| (eContainerFeatureID() != EMFCoursesPackage.YEAR__PREVIOUS_YEAR && newPreviousYear != null)) {
			if (EcoreUtil.isAncestor(this, newPreviousYear))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPreviousYear != null)
				msgs = ((InternalEObject) newPreviousYear).eInverseAdd(this, EMFCoursesPackage.YEAR__NEXT_YEAR_OPTIONS,
						Year.class, msgs);
			msgs = basicSetPreviousYear(newPreviousYear, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFCoursesPackage.YEAR__PREVIOUS_YEAR,
					newPreviousYear, newPreviousYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public float getTotalCredits() {
		return this.getSemesters().get(0).getMaxCredits() + this.getSemesters().get(1).getMaxCredits();
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
		case EMFCoursesPackage.YEAR__PROGRAMME:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetProgramme((Programme) otherEnd, msgs);
		case EMFCoursesPackage.YEAR__PREVIOUS_YEAR:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPreviousYear((Year) otherEnd, msgs);
		case EMFCoursesPackage.YEAR__SEMESTERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSemesters()).basicAdd(otherEnd, msgs);
		case EMFCoursesPackage.YEAR__NEXT_YEAR_OPTIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNextYearOptions()).basicAdd(otherEnd, msgs);
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
		case EMFCoursesPackage.YEAR__PROGRAMME:
			return basicSetProgramme(null, msgs);
		case EMFCoursesPackage.YEAR__PREVIOUS_YEAR:
			return basicSetPreviousYear(null, msgs);
		case EMFCoursesPackage.YEAR__SEMESTERS:
			return ((InternalEList<?>) getSemesters()).basicRemove(otherEnd, msgs);
		case EMFCoursesPackage.YEAR__NEXT_YEAR_OPTIONS:
			return ((InternalEList<?>) getNextYearOptions()).basicRemove(otherEnd, msgs);
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
		case EMFCoursesPackage.YEAR__PROGRAMME:
			return eInternalContainer().eInverseRemove(this, EMFCoursesPackage.PROGRAMME__ROOT_YEARS, Programme.class,
					msgs);
		case EMFCoursesPackage.YEAR__PREVIOUS_YEAR:
			return eInternalContainer().eInverseRemove(this, EMFCoursesPackage.YEAR__NEXT_YEAR_OPTIONS, Year.class,
					msgs);
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
		case EMFCoursesPackage.YEAR__PROGRAMME:
			return getProgramme();
		case EMFCoursesPackage.YEAR__SPECIALIZATION:
			return getSpecialization();
		case EMFCoursesPackage.YEAR__TOTAL_CREDITS:
			return getTotalCredits();
		case EMFCoursesPackage.YEAR__PREVIOUS_YEAR:
			return getPreviousYear();
		case EMFCoursesPackage.YEAR__SEMESTERS:
			return getSemesters();
		case EMFCoursesPackage.YEAR__NEXT_YEAR_OPTIONS:
			return getNextYearOptions();
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
		case EMFCoursesPackage.YEAR__PROGRAMME:
			setProgramme((Programme) newValue);
			return;
		case EMFCoursesPackage.YEAR__SPECIALIZATION:
			setSpecialization((String) newValue);
			return;
		case EMFCoursesPackage.YEAR__PREVIOUS_YEAR:
			setPreviousYear((Year) newValue);
			return;
		case EMFCoursesPackage.YEAR__SEMESTERS:
			getSemesters().clear();
			getSemesters().addAll((Collection<? extends Semester>) newValue);
			return;
		case EMFCoursesPackage.YEAR__NEXT_YEAR_OPTIONS:
			getNextYearOptions().clear();
			getNextYearOptions().addAll((Collection<? extends Year>) newValue);
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
		case EMFCoursesPackage.YEAR__PROGRAMME:
			setProgramme((Programme) null);
			return;
		case EMFCoursesPackage.YEAR__SPECIALIZATION:
			setSpecialization(SPECIALIZATION_EDEFAULT);
			return;
		case EMFCoursesPackage.YEAR__PREVIOUS_YEAR:
			setPreviousYear((Year) null);
			return;
		case EMFCoursesPackage.YEAR__SEMESTERS:
			getSemesters().clear();
			return;
		case EMFCoursesPackage.YEAR__NEXT_YEAR_OPTIONS:
			getNextYearOptions().clear();
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
		case EMFCoursesPackage.YEAR__PROGRAMME:
			return getProgramme() != null;
		case EMFCoursesPackage.YEAR__SPECIALIZATION:
			return SPECIALIZATION_EDEFAULT == null ? specialization != null
					: !SPECIALIZATION_EDEFAULT.equals(specialization);
		case EMFCoursesPackage.YEAR__TOTAL_CREDITS:
			return getTotalCredits() != TOTAL_CREDITS_EDEFAULT;
		case EMFCoursesPackage.YEAR__PREVIOUS_YEAR:
			return getPreviousYear() != null;
		case EMFCoursesPackage.YEAR__SEMESTERS:
			return semesters != null && !semesters.isEmpty();
		case EMFCoursesPackage.YEAR__NEXT_YEAR_OPTIONS:
			return nextYearOptions != null && !nextYearOptions.isEmpty();
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

} //YearImpl

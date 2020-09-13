/**
 */
package eMFCourses.impl;

import eMFCourses.EMFCoursesPackage;
import eMFCourses.Semester;
import eMFCourses.Slot;

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
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eMFCourses.impl.SemesterImpl#getYear <em>Year</em>}</li>
 *   <li>{@link eMFCourses.impl.SemesterImpl#getSlots <em>Slots</em>}</li>
 *   <li>{@link eMFCourses.impl.SemesterImpl#getMaxCredits <em>Max Credits</em>}</li>
 *   <li>{@link eMFCourses.impl.SemesterImpl#getSeason <em>Season</em>}</li>
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
	 * The default value of the '{@link #getMaxCredits() <em>Max Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_CREDITS_EDEFAULT = 0.0F;

	/**
	 * The default value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected static final String SEASON_EDEFAULT = null;

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
	 * @generated NOT
	 */
	@Override
	public float getMaxCredits() {
		float a = 0.0f;
		for (Slot s : this.getSlots()) {
			a += s.getMaxCredits();
		}
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Year getYear() {
		if (eContainerFeatureID() != EMFCoursesPackage.SEMESTER__YEAR)
			return null;
		return (Year) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYear(Year newYear, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newYear, EMFCoursesPackage.SEMESTER__YEAR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(Year newYear) {
		if (newYear != eInternalContainer()
				|| (eContainerFeatureID() != EMFCoursesPackage.SEMESTER__YEAR && newYear != null)) {
			if (EcoreUtil.isAncestor(this, newYear))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newYear != null)
				msgs = ((InternalEObject) newYear).eInverseAdd(this, EMFCoursesPackage.YEAR__SEMESTERS, Year.class,
						msgs);
			msgs = basicSetYear(newYear, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFCoursesPackage.SEMESTER__YEAR, newYear, newYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getSeason() {
		return this.getYear().getSemesters().indexOf(this) == 0 ? "Fall" : "Spring";
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
		case EMFCoursesPackage.SEMESTER__YEAR:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetYear((Year) otherEnd, msgs);
		case EMFCoursesPackage.SEMESTER__SLOTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSlots()).basicAdd(otherEnd, msgs);
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
		case EMFCoursesPackage.SEMESTER__YEAR:
			return basicSetYear(null, msgs);
		case EMFCoursesPackage.SEMESTER__SLOTS:
			return ((InternalEList<?>) getSlots()).basicRemove(otherEnd, msgs);
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
		case EMFCoursesPackage.SEMESTER__YEAR:
			return eInternalContainer().eInverseRemove(this, EMFCoursesPackage.YEAR__SEMESTERS, Year.class, msgs);
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
		case EMFCoursesPackage.SEMESTER__YEAR:
			return getYear();
		case EMFCoursesPackage.SEMESTER__SLOTS:
			return getSlots();
		case EMFCoursesPackage.SEMESTER__MAX_CREDITS:
			return getMaxCredits();
		case EMFCoursesPackage.SEMESTER__SEASON:
			return getSeason();
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
		case EMFCoursesPackage.SEMESTER__YEAR:
			setYear((Year) newValue);
			return;
		case EMFCoursesPackage.SEMESTER__SLOTS:
			getSlots().clear();
			getSlots().addAll((Collection<? extends Slot>) newValue);
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
		case EMFCoursesPackage.SEMESTER__YEAR:
			setYear((Year) null);
			return;
		case EMFCoursesPackage.SEMESTER__SLOTS:
			getSlots().clear();
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
		case EMFCoursesPackage.SEMESTER__YEAR:
			return getYear() != null;
		case EMFCoursesPackage.SEMESTER__SLOTS:
			return slots != null && !slots.isEmpty();
		case EMFCoursesPackage.SEMESTER__MAX_CREDITS:
			return getMaxCredits() != MAX_CREDITS_EDEFAULT;
		case EMFCoursesPackage.SEMESTER__SEASON:
			return SEASON_EDEFAULT == null ? getSeason() != null : !SEASON_EDEFAULT.equals(getSeason());
		}
		return super.eIsSet(featureID);
	}

} //SemesterImpl

/**
 */
package eMFCourses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMFCourses.Slot#getSemester <em>Semester</em>}</li>
 *   <li>{@link eMFCourses.Slot#getStatus <em>Status</em>}</li>
 *   <li>{@link eMFCourses.Slot#getMaxCredits <em>Max Credits</em>}</li>
 * </ul>
 *
 * @see eMFCourses.EMFCoursesPackage#getSlot()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Slot extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Credits</b></em>' attribute.
	 * The default value is <code>"7.5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Credits</em>' attribute.
	 * @see #setMaxCredits(float)
	 * @see eMFCourses.EMFCoursesPackage#getSlot_MaxCredits()
	 * @model default="7.5" required="true"
	 * @generated
	 */
	float getMaxCredits();

	/**
	 * Sets the value of the '{@link eMFCourses.Slot#getMaxCredits <em>Max Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Credits</em>' attribute.
	 * @see #getMaxCredits()
	 * @generated
	 */
	void setMaxCredits(float value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eMFCourses.Semester#getSlots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' container reference.
	 * @see #setSemester(Semester)
	 * @see eMFCourses.EMFCoursesPackage#getSlot_Semester()
	 * @see eMFCourses.Semester#getSlots
	 * @model opposite="slots" transient="false"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link eMFCourses.Slot#getSemester <em>Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' container reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link eMFCourses.StatusCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see eMFCourses.StatusCode
	 * @see #setStatus(StatusCode)
	 * @see eMFCourses.EMFCoursesPackage#getSlot_Status()
	 * @model dataType="eMFCourses.StatusCode" required="true"
	 * @generated
	 */
	StatusCode getStatus();

	/**
	 * Sets the value of the '{@link eMFCourses.Slot#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see eMFCourses.StatusCode
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusCode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" courseRequired="true"
	 * @generated
	 */
	boolean validChoice(Course course);

} // Slot

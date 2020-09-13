/**
 */
package eMFCourses;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMFCourses.Semester#getProgramme <em>Programme</em>}</li>
 *   <li>{@link eMFCourses.Semester#getSlots <em>Slots</em>}</li>
 *   <li>{@link eMFCourses.Semester#getNextSemesterOptions <em>Next Semester Options</em>}</li>
 *   <li>{@link eMFCourses.Semester#getPreviousSemester <em>Previous Semester</em>}</li>
 *   <li>{@link eMFCourses.Semester#getSpecialization <em>Specialization</em>}</li>
 * </ul>
 *
 * @see eMFCourses.EMFCoursesPackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eMFCourses.Programme#getRootSemesters <em>Root Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' container reference.
	 * @see #setProgramme(Programme)
	 * @see eMFCourses.EMFCoursesPackage#getSemester_Programme()
	 * @see eMFCourses.Programme#getRootSemesters
	 * @model opposite="rootSemesters" transient="false"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link eMFCourses.Semester#getProgramme <em>Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' container reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Slots</b></em>' containment reference list.
	 * The list contents are of type {@link eMFCourses.Slot}.
	 * It is bidirectional and its opposite is '{@link eMFCourses.Slot#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slots</em>' containment reference list.
	 * @see eMFCourses.EMFCoursesPackage#getSemester_Slots()
	 * @see eMFCourses.Slot#getSemester
	 * @model opposite="semester" containment="true"
	 * @generated
	 */
	EList<Slot> getSlots();

	/**
	 * Returns the value of the '<em><b>Next Semester Options</b></em>' containment reference list.
	 * The list contents are of type {@link eMFCourses.Semester}.
	 * It is bidirectional and its opposite is '{@link eMFCourses.Semester#getPreviousSemester <em>Previous Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Semester Options</em>' containment reference list.
	 * @see eMFCourses.EMFCoursesPackage#getSemester_NextSemesterOptions()
	 * @see eMFCourses.Semester#getPreviousSemester
	 * @model opposite="previousSemester" containment="true"
	 * @generated
	 */
	EList<Semester> getNextSemesterOptions();

	/**
	 * Returns the value of the '<em><b>Previous Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eMFCourses.Semester#getNextSemesterOptions <em>Next Semester Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Semester</em>' container reference.
	 * @see #setPreviousSemester(Semester)
	 * @see eMFCourses.EMFCoursesPackage#getSemester_PreviousSemester()
	 * @see eMFCourses.Semester#getNextSemesterOptions
	 * @model opposite="nextSemesterOptions" transient="false"
	 * @generated
	 */
	Semester getPreviousSemester();

	/**
	 * Sets the value of the '{@link eMFCourses.Semester#getPreviousSemester <em>Previous Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Semester</em>' container reference.
	 * @see #getPreviousSemester()
	 * @generated
	 */
	void setPreviousSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' attribute.
	 * @see #setSpecialization(String)
	 * @see eMFCourses.EMFCoursesPackage#getSemester_Specialization()
	 * @model
	 * @generated
	 */
	String getSpecialization();

	/**
	 * Sets the value of the '{@link eMFCourses.Semester#getSpecialization <em>Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization</em>' attribute.
	 * @see #getSpecialization()
	 * @generated
	 */
	void setSpecialization(String value);

} // Semester

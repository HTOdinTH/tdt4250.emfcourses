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
 *   <li>{@link eMFCourses.Semester#getSlots <em>Slots</em>}</li>
 *   <li>{@link eMFCourses.Semester#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link eMFCourses.Semester#getMaxCredits <em>Max Credits</em>}</li>
 *   <li>{@link eMFCourses.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link eMFCourses.Semester#getSeason <em>Season</em>}</li>
 * </ul>
 *
 * @see eMFCourses.EMFCoursesPackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
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

	/**
	 * Returns the value of the '<em><b>Max Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Credits</em>' attribute.
	 * @see eMFCourses.EMFCoursesPackage#getSemester_MaxCredits()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	float getMaxCredits();

	/**
	 * Returns the value of the '<em><b>Year</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eMFCourses.Year#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' container reference.
	 * @see #setYear(Year)
	 * @see eMFCourses.EMFCoursesPackage#getSemester_Year()
	 * @see eMFCourses.Year#getSemesters
	 * @model opposite="semesters" required="true" transient="false"
	 * @generated
	 */
	Year getYear();

	/**
	 * Sets the value of the '{@link eMFCourses.Semester#getYear <em>Year</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' container reference.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(Year value);

	/**
	 * Returns the value of the '<em><b>Season</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' attribute.
	 * @see eMFCourses.EMFCoursesPackage#getSemester_Season()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getSeason();

} // Semester

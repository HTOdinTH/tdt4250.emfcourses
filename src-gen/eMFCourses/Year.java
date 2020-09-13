/**
 */
package eMFCourses;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMFCourses.Year#getProgramme <em>Programme</em>}</li>
 *   <li>{@link eMFCourses.Year#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link eMFCourses.Year#getTotalCredits <em>Total Credits</em>}</li>
 *   <li>{@link eMFCourses.Year#getPreviousYear <em>Previous Year</em>}</li>
 *   <li>{@link eMFCourses.Year#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link eMFCourses.Year#getNextYearOptions <em>Next Year Options</em>}</li>
 * </ul>
 *
 * @see eMFCourses.EMFCoursesPackage#getYear()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='fullCredits'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 fullCredits='self.semesters.slots.maxCredits-&gt;sum() &gt;= 60'"
 * @generated
 */
public interface Year extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eMFCourses.Programme#getRootYears <em>Root Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' container reference.
	 * @see #setProgramme(Programme)
	 * @see eMFCourses.EMFCoursesPackage#getYear_Programme()
	 * @see eMFCourses.Programme#getRootYears
	 * @model opposite="rootYears" transient="false"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link eMFCourses.Year#getProgramme <em>Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' container reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' attribute.
	 * @see #setSpecialization(String)
	 * @see eMFCourses.EMFCoursesPackage#getYear_Specialization()
	 * @model
	 * @generated
	 */
	String getSpecialization();

	/**
	 * Sets the value of the '{@link eMFCourses.Year#getSpecialization <em>Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization</em>' attribute.
	 * @see #getSpecialization()
	 * @generated
	 */
	void setSpecialization(String value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link eMFCourses.Semester}.
	 * It is bidirectional and its opposite is '{@link eMFCourses.Semester#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see eMFCourses.EMFCoursesPackage#getYear_Semesters()
	 * @see eMFCourses.Semester#getYear
	 * @model opposite="year" containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Next Year Options</b></em>' containment reference list.
	 * The list contents are of type {@link eMFCourses.Year}.
	 * It is bidirectional and its opposite is '{@link eMFCourses.Year#getPreviousYear <em>Previous Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Year Options</em>' containment reference list.
	 * @see eMFCourses.EMFCoursesPackage#getYear_NextYearOptions()
	 * @see eMFCourses.Year#getPreviousYear
	 * @model opposite="previousYear" containment="true"
	 * @generated
	 */
	EList<Year> getNextYearOptions();

	/**
	 * Returns the value of the '<em><b>Previous Year</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eMFCourses.Year#getNextYearOptions <em>Next Year Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Year</em>' container reference.
	 * @see #setPreviousYear(Year)
	 * @see eMFCourses.EMFCoursesPackage#getYear_PreviousYear()
	 * @see eMFCourses.Year#getNextYearOptions
	 * @model opposite="nextYearOptions" transient="false"
	 * @generated
	 */
	Year getPreviousYear();

	/**
	 * Sets the value of the '{@link eMFCourses.Year#getPreviousYear <em>Previous Year</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Year</em>' container reference.
	 * @see #getPreviousYear()
	 * @generated
	 */
	void setPreviousYear(Year value);

	/**
	 * Returns the value of the '<em><b>Total Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Credits</em>' attribute.
	 * @see eMFCourses.EMFCoursesPackage#getYear_TotalCredits()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	float getTotalCredits();

} // Year

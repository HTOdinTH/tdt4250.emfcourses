/**
 */
package eMFCourses;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMFCourses.Programme#getRootSemesters <em>Root Semesters</em>}</li>
 *   <li>{@link eMFCourses.Programme#getCode <em>Code</em>}</li>
 *   <li>{@link eMFCourses.Programme#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see eMFCourses.EMFCoursesPackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link eMFCourses.Semester}.
	 * It is bidirectional and its opposite is '{@link eMFCourses.Semester#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Semesters</em>' containment reference list.
	 * @see eMFCourses.EMFCoursesPackage#getProgramme_RootSemesters()
	 * @see eMFCourses.Semester#getProgramme
	 * @model opposite="programme" containment="true" required="true"
	 * @generated
	 */
	EList<Semester> getRootSemesters();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see eMFCourses.EMFCoursesPackage#getProgramme_Code()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link eMFCourses.Programme#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eMFCourses.EMFCoursesPackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eMFCourses.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Programme

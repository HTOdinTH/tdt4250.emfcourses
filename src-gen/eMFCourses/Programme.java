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
 *   <li>{@link eMFCourses.Programme#getCode <em>Code</em>}</li>
 *   <li>{@link eMFCourses.Programme#getName <em>Name</em>}</li>
 *   <li>{@link eMFCourses.Programme#getRootYears <em>Root Years</em>}</li>
 *   <li>{@link eMFCourses.Programme#getLength <em>Length</em>}</li>
 *   <li>{@link eMFCourses.Programme#getTotalCredits <em>Total Credits</em>}</li>
 * </ul>
 *
 * @see eMFCourses.EMFCoursesPackage#getProgramme()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='equalLengths'"
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Years</b></em>' containment reference list.
	 * The list contents are of type {@link eMFCourses.Year}.
	 * It is bidirectional and its opposite is '{@link eMFCourses.Year#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Years</em>' containment reference list.
	 * @see eMFCourses.EMFCoursesPackage#getProgramme_RootYears()
	 * @see eMFCourses.Year#getProgramme
	 * @model opposite="programme" containment="true" required="true"
	 * @generated
	 */
	EList<Year> getRootYears();

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

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see eMFCourses.EMFCoursesPackage#getProgramme_Length()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getLength();

	/**
	 * Returns the value of the '<em><b>Total Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Credits</em>' attribute.
	 * @see eMFCourses.EMFCoursesPackage#getProgramme_TotalCredits()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	float getTotalCredits();

} // Programme

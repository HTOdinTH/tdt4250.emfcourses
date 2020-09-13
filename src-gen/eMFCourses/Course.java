/**
 */
package eMFCourses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMFCourses.Course#getCode <em>Code</em>}</li>
 *   <li>{@link eMFCourses.Course#getName <em>Name</em>}</li>
 *   <li>{@link eMFCourses.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link eMFCourses.Course#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see eMFCourses.EMFCoursesPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(Object)
	 * @see eMFCourses.EMFCoursesPackage#getCourse_Code()
	 * @model id="true" dataType="eMFCourses.CourseCode" required="true"
	 * @generated
	 */
	Object getCode();

	/**
	 * Sets the value of the '{@link eMFCourses.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Object value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eMFCourses.EMFCoursesPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eMFCourses.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see eMFCourses.EMFCoursesPackage#getCourse_Credits()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link eMFCourses.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * The literals are from the enumeration {@link eMFCourses.LevelCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see eMFCourses.LevelCode
	 * @see #setLevel(LevelCode)
	 * @see eMFCourses.EMFCoursesPackage#getCourse_Level()
	 * @model default="1" dataType="eMFCourses.LevelCode" required="true"
	 * @generated
	 */
	LevelCode getLevel();

	/**
	 * Sets the value of the '{@link eMFCourses.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see eMFCourses.LevelCode
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(LevelCode value);

} // Course

/**
 */
package eMFCourses;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Listing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMFCourses.Listing#getCourses <em>Courses</em>}</li>
 *   <li>{@link eMFCourses.Listing#getProgrammes <em>Programmes</em>}</li>
 * </ul>
 *
 * @see eMFCourses.EMFCoursesPackage#getListing()
 * @model
 * @generated
 */
public interface Listing extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link eMFCourses.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see eMFCourses.EMFCoursesPackage#getListing_Courses()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Programmes</b></em>' containment reference list.
	 * The list contents are of type {@link eMFCourses.Programme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmes</em>' containment reference list.
	 * @see eMFCourses.EMFCoursesPackage#getListing_Programmes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Programme> getProgrammes();

} // Listing

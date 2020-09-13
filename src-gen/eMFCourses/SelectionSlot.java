/**
 */
package eMFCourses;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMFCourses.SelectionSlot#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see eMFCourses.EMFCoursesPackage#getSelectionSlot()
 * @model
 * @generated
 */
public interface SelectionSlot extends Slot {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' reference list.
	 * The list contents are of type {@link eMFCourses.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' reference list.
	 * @see eMFCourses.EMFCoursesPackage#getSelectionSlot_Options()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Course> getOptions();

} // SelectionSlot

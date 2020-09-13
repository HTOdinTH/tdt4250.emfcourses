/**
 */
package eMFCourses;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eMFCourses.EMFCoursesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface EMFCoursesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eMFCourses";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/EMFCourses/model/eMFCourses.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "programmes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EMFCoursesPackage eINSTANCE = eMFCourses.impl.EMFCoursesPackageImpl.init();

	/**
	 * The meta object id for the '{@link eMFCourses.impl.ListingImpl <em>Listing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMFCourses.impl.ListingImpl
	 * @see eMFCourses.impl.EMFCoursesPackageImpl#getListing()
	 * @generated
	 */
	int LISTING = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTING__COURSES = 0;

	/**
	 * The feature id for the '<em><b>Programmes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTING__PROGRAMMES = 1;

	/**
	 * The number of structural features of the '<em>Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eMFCourses.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMFCourses.impl.CourseImpl
	 * @see eMFCourses.impl.EMFCoursesPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 3;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eMFCourses.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMFCourses.impl.ProgrammeImpl
	 * @see eMFCourses.impl.EMFCoursesPackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 2;

	/**
	 * The feature id for the '<em><b>Root Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__ROOT_SEMESTERS = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__CODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NAME = 2;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eMFCourses.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMFCourses.impl.SemesterImpl
	 * @see eMFCourses.impl.EMFCoursesPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 3;

	/**
	 * The feature id for the '<em><b>Programme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__PROGRAMME = 0;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SLOTS = 1;

	/**
	 * The feature id for the '<em><b>Next Semester Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__NEXT_SEMESTER_OPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Previous Semester</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__PREVIOUS_SEMESTER = 3;

	/**
	 * The feature id for the '<em><b>Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SPECIALIZATION = 4;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eMFCourses.Slot <em>Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMFCourses.Slot
	 * @see eMFCourses.impl.EMFCoursesPackageImpl#getSlot()
	 * @generated
	 */
	int SLOT = 4;

	/**
	 * The feature id for the '<em><b>Max Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__MAX_CREDITS = 0;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__SEMESTER = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__STATUS = 2;

	/**
	 * The number of structural features of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Valid Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT___VALID_CHOICE__COURSE = 0;

	/**
	 * The number of operations of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link eMFCourses.impl.SelectionSlotImpl <em>Selection Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMFCourses.impl.SelectionSlotImpl
	 * @see eMFCourses.impl.EMFCoursesPackageImpl#getSelectionSlot()
	 * @generated
	 */
	int SELECTION_SLOT = 5;

	/**
	 * The feature id for the '<em><b>Max Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_SLOT__MAX_CREDITS = SLOT__MAX_CREDITS;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_SLOT__SEMESTER = SLOT__SEMESTER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_SLOT__STATUS = SLOT__STATUS;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_SLOT__OPTIONS = SLOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selection Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_SLOT_FEATURE_COUNT = SLOT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Valid Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_SLOT___VALID_CHOICE__COURSE = SLOT___VALID_CHOICE__COURSE;

	/**
	 * The number of operations of the '<em>Selection Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_SLOT_OPERATION_COUNT = SLOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eMFCourses.impl.ConstraintSlotImpl <em>Constraint Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMFCourses.impl.ConstraintSlotImpl
	 * @see eMFCourses.impl.EMFCoursesPackageImpl#getConstraintSlot()
	 * @generated
	 */
	int CONSTRAINT_SLOT = 6;

	/**
	 * The feature id for the '<em><b>Max Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SLOT__MAX_CREDITS = SLOT__MAX_CREDITS;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SLOT__SEMESTER = SLOT__SEMESTER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SLOT__STATUS = SLOT__STATUS;

	/**
	 * The number of structural features of the '<em>Constraint Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SLOT_FEATURE_COUNT = SLOT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Valid Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SLOT___VALID_CHOICE__COURSE = SLOT___VALID_CHOICE__COURSE;

	/**
	 * The number of operations of the '<em>Constraint Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SLOT_OPERATION_COUNT = SLOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eMFCourses.LevelCode <em>Level Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMFCourses.LevelCode
	 * @see eMFCourses.impl.EMFCoursesPackageImpl#getLevelCode()
	 * @generated
	 */
	int LEVEL_CODE = 7;

	/**
	 * The meta object id for the '{@link eMFCourses.StatusCode <em>Status Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMFCourses.StatusCode
	 * @see eMFCourses.impl.EMFCoursesPackageImpl#getStatusCode()
	 * @generated
	 */
	int STATUS_CODE = 8;

	/**
	 * The meta object id for the '<em>Course Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see eMFCourses.impl.EMFCoursesPackageImpl#getCourseCode()
	 * @generated
	 */
	int COURSE_CODE = 9;

	/**
	 * Returns the meta object for class '{@link eMFCourses.Listing <em>Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listing</em>'.
	 * @see eMFCourses.Listing
	 * @generated
	 */
	EClass getListing();

	/**
	 * Returns the meta object for the containment reference list '{@link eMFCourses.Listing#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see eMFCourses.Listing#getCourses()
	 * @see #getListing()
	 * @generated
	 */
	EReference getListing_Courses();

	/**
	 * Returns the meta object for the containment reference list '{@link eMFCourses.Listing#getProgrammes <em>Programmes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programmes</em>'.
	 * @see eMFCourses.Listing#getProgrammes()
	 * @see #getListing()
	 * @generated
	 */
	EReference getListing_Programmes();

	/**
	 * Returns the meta object for class '{@link eMFCourses.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see eMFCourses.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link eMFCourses.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see eMFCourses.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link eMFCourses.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eMFCourses.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link eMFCourses.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see eMFCourses.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the attribute '{@link eMFCourses.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see eMFCourses.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for class '{@link eMFCourses.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see eMFCourses.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for the containment reference list '{@link eMFCourses.Programme#getRootSemesters <em>Root Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Semesters</em>'.
	 * @see eMFCourses.Programme#getRootSemesters()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_RootSemesters();

	/**
	 * Returns the meta object for the attribute '{@link eMFCourses.Programme#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see eMFCourses.Programme#getCode()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Code();

	/**
	 * Returns the meta object for the attribute '{@link eMFCourses.Programme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eMFCourses.Programme#getName()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Name();

	/**
	 * Returns the meta object for class '{@link eMFCourses.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see eMFCourses.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the container reference '{@link eMFCourses.Semester#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Programme</em>'.
	 * @see eMFCourses.Semester#getProgramme()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Programme();

	/**
	 * Returns the meta object for the containment reference list '{@link eMFCourses.Semester#getSlots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slots</em>'.
	 * @see eMFCourses.Semester#getSlots()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Slots();

	/**
	 * Returns the meta object for the containment reference list '{@link eMFCourses.Semester#getNextSemesterOptions <em>Next Semester Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next Semester Options</em>'.
	 * @see eMFCourses.Semester#getNextSemesterOptions()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_NextSemesterOptions();

	/**
	 * Returns the meta object for the container reference '{@link eMFCourses.Semester#getPreviousSemester <em>Previous Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Previous Semester</em>'.
	 * @see eMFCourses.Semester#getPreviousSemester()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_PreviousSemester();

	/**
	 * Returns the meta object for the attribute '{@link eMFCourses.Semester#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specialization</em>'.
	 * @see eMFCourses.Semester#getSpecialization()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Specialization();

	/**
	 * Returns the meta object for class '{@link eMFCourses.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot</em>'.
	 * @see eMFCourses.Slot
	 * @generated
	 */
	EClass getSlot();

	/**
	 * Returns the meta object for the attribute '{@link eMFCourses.Slot#getMaxCredits <em>Max Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Credits</em>'.
	 * @see eMFCourses.Slot#getMaxCredits()
	 * @see #getSlot()
	 * @generated
	 */
	EAttribute getSlot_MaxCredits();

	/**
	 * Returns the meta object for the container reference '{@link eMFCourses.Slot#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Semester</em>'.
	 * @see eMFCourses.Slot#getSemester()
	 * @see #getSlot()
	 * @generated
	 */
	EReference getSlot_Semester();

	/**
	 * Returns the meta object for the attribute '{@link eMFCourses.Slot#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see eMFCourses.Slot#getStatus()
	 * @see #getSlot()
	 * @generated
	 */
	EAttribute getSlot_Status();

	/**
	 * Returns the meta object for the '{@link eMFCourses.Slot#validChoice(eMFCourses.Course) <em>Valid Choice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Choice</em>' operation.
	 * @see eMFCourses.Slot#validChoice(eMFCourses.Course)
	 * @generated
	 */
	EOperation getSlot__ValidChoice__Course();

	/**
	 * Returns the meta object for class '{@link eMFCourses.SelectionSlot <em>Selection Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Slot</em>'.
	 * @see eMFCourses.SelectionSlot
	 * @generated
	 */
	EClass getSelectionSlot();

	/**
	 * Returns the meta object for the reference list '{@link eMFCourses.SelectionSlot#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Options</em>'.
	 * @see eMFCourses.SelectionSlot#getOptions()
	 * @see #getSelectionSlot()
	 * @generated
	 */
	EReference getSelectionSlot_Options();

	/**
	 * Returns the meta object for class '{@link eMFCourses.ConstraintSlot <em>Constraint Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Slot</em>'.
	 * @see eMFCourses.ConstraintSlot
	 * @generated
	 */
	EClass getConstraintSlot();

	/**
	 * Returns the meta object for enum '{@link eMFCourses.LevelCode <em>Level Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Level Code</em>'.
	 * @see eMFCourses.LevelCode
	 * @generated
	 */
	EEnum getLevelCode();

	/**
	 * Returns the meta object for enum '{@link eMFCourses.StatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Code</em>'.
	 * @see eMFCourses.StatusCode
	 * @generated
	 */
	EEnum getStatusCode();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Course Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="pattern='\\p{L}+\\d+'"
	 * @generated
	 */
	EDataType getCourseCode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EMFCoursesFactory getEMFCoursesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eMFCourses.impl.ListingImpl <em>Listing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMFCourses.impl.ListingImpl
		 * @see eMFCourses.impl.EMFCoursesPackageImpl#getListing()
		 * @generated
		 */
		EClass LISTING = eINSTANCE.getListing();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTING__COURSES = eINSTANCE.getListing_Courses();

		/**
		 * The meta object literal for the '<em><b>Programmes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTING__PROGRAMMES = eINSTANCE.getListing_Programmes();

		/**
		 * The meta object literal for the '{@link eMFCourses.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMFCourses.impl.CourseImpl
		 * @see eMFCourses.impl.EMFCoursesPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '{@link eMFCourses.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMFCourses.impl.ProgrammeImpl
		 * @see eMFCourses.impl.EMFCoursesPackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '<em><b>Root Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__ROOT_SEMESTERS = eINSTANCE.getProgramme_RootSemesters();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__CODE = eINSTANCE.getProgramme_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__NAME = eINSTANCE.getProgramme_Name();

		/**
		 * The meta object literal for the '{@link eMFCourses.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMFCourses.impl.SemesterImpl
		 * @see eMFCourses.impl.EMFCoursesPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__PROGRAMME = eINSTANCE.getSemester_Programme();

		/**
		 * The meta object literal for the '<em><b>Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__SLOTS = eINSTANCE.getSemester_Slots();

		/**
		 * The meta object literal for the '<em><b>Next Semester Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__NEXT_SEMESTER_OPTIONS = eINSTANCE.getSemester_NextSemesterOptions();

		/**
		 * The meta object literal for the '<em><b>Previous Semester</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__PREVIOUS_SEMESTER = eINSTANCE.getSemester_PreviousSemester();

		/**
		 * The meta object literal for the '<em><b>Specialization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__SPECIALIZATION = eINSTANCE.getSemester_Specialization();

		/**
		 * The meta object literal for the '{@link eMFCourses.Slot <em>Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMFCourses.Slot
		 * @see eMFCourses.impl.EMFCoursesPackageImpl#getSlot()
		 * @generated
		 */
		EClass SLOT = eINSTANCE.getSlot();

		/**
		 * The meta object literal for the '<em><b>Max Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__MAX_CREDITS = eINSTANCE.getSlot_MaxCredits();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT__SEMESTER = eINSTANCE.getSlot_Semester();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__STATUS = eINSTANCE.getSlot_Status();

		/**
		 * The meta object literal for the '<em><b>Valid Choice</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLOT___VALID_CHOICE__COURSE = eINSTANCE.getSlot__ValidChoice__Course();

		/**
		 * The meta object literal for the '{@link eMFCourses.impl.SelectionSlotImpl <em>Selection Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMFCourses.impl.SelectionSlotImpl
		 * @see eMFCourses.impl.EMFCoursesPackageImpl#getSelectionSlot()
		 * @generated
		 */
		EClass SELECTION_SLOT = eINSTANCE.getSelectionSlot();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_SLOT__OPTIONS = eINSTANCE.getSelectionSlot_Options();

		/**
		 * The meta object literal for the '{@link eMFCourses.impl.ConstraintSlotImpl <em>Constraint Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMFCourses.impl.ConstraintSlotImpl
		 * @see eMFCourses.impl.EMFCoursesPackageImpl#getConstraintSlot()
		 * @generated
		 */
		EClass CONSTRAINT_SLOT = eINSTANCE.getConstraintSlot();

		/**
		 * The meta object literal for the '{@link eMFCourses.LevelCode <em>Level Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMFCourses.LevelCode
		 * @see eMFCourses.impl.EMFCoursesPackageImpl#getLevelCode()
		 * @generated
		 */
		EEnum LEVEL_CODE = eINSTANCE.getLevelCode();

		/**
		 * The meta object literal for the '{@link eMFCourses.StatusCode <em>Status Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMFCourses.StatusCode
		 * @see eMFCourses.impl.EMFCoursesPackageImpl#getStatusCode()
		 * @generated
		 */
		EEnum STATUS_CODE = eINSTANCE.getStatusCode();

		/**
		 * The meta object literal for the '<em>Course Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see eMFCourses.impl.EMFCoursesPackageImpl#getCourseCode()
		 * @generated
		 */
		EDataType COURSE_CODE = eINSTANCE.getCourseCode();

	}

} //EMFCoursesPackage

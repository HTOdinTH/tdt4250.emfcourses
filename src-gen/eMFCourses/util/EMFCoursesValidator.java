/**
 */
package eMFCourses.util;

import eMFCourses.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see eMFCourses.EMFCoursesPackage
 * @generated
 */
public class EMFCoursesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EMFCoursesValidator INSTANCE = new EMFCoursesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eMFCourses";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFCoursesValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return EMFCoursesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case EMFCoursesPackage.LISTING:
			return validateListing((Listing) value, diagnostics, context);
		case EMFCoursesPackage.COURSE:
			return validateCourse((Course) value, diagnostics, context);
		case EMFCoursesPackage.PROGRAMME:
			return validateProgramme((Programme) value, diagnostics, context);
		case EMFCoursesPackage.YEAR:
			return validateYear((Year) value, diagnostics, context);
		case EMFCoursesPackage.SEMESTER:
			return validateSemester((Semester) value, diagnostics, context);
		case EMFCoursesPackage.SLOT:
			return validateSlot((Slot) value, diagnostics, context);
		case EMFCoursesPackage.SELECTION_SLOT:
			return validateSelectionSlot((SelectionSlot) value, diagnostics, context);
		case EMFCoursesPackage.CONSTRAINT_SLOT:
			return validateConstraintSlot((ConstraintSlot) value, diagnostics, context);
		case EMFCoursesPackage.STATUS_CODE:
			return validateStatusCode(value, diagnostics, context);
		case EMFCoursesPackage.LEVEL_CODE:
			return validateLevelCode(value, diagnostics, context);
		case EMFCoursesPackage.COURSE_CODE:
			return validateCourseCode((String) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListing(Listing listing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(programme, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProgramme_equalLengths(programme, diagnostics, context);
		return result;
	}

	/**
	 * Validates the equalLengths constraint of '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private ArrayList<Integer> lengthBranch(Year year, int depth) {
		if (year.getNextYearOptions().size() > 0) {
			ArrayList<Integer> r = new ArrayList<>();
			for (Year y : year.getNextYearOptions()) {
				r.addAll(lengthBranch(y, depth + 1));
			}
			return r;
		} else
			return new ArrayList<Integer>(Arrays.asList(depth));
	}

	public boolean validateProgramme_equalLengths(Programme programme, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		ArrayList<Integer> r = new ArrayList<>();
		for (Year y : programme.getRootYears()) {
			r.addAll(lengthBranch(y, 1));
		}
		int v = r.get(0);
		for (int i : r) {
			if (v != i) {
				if (diagnostics != null) {
					diagnostics.add(
							createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
									new Object[] { "equalLengths", getObjectLabel(programme, context) },
									new Object[] { programme }, context));
				}
				return false;
			}
		}

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYear(Year year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(year, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(year, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(year, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(year, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(year, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(year, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(year, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(year, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(year, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateYear_fullCredits(year, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the fullCredits constraint of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String YEAR__FULL_CREDITS__EEXPRESSION = "self.semesters.slots.maxCredits->sum() >= 60.0";

	/**
	 * Validates the fullCredits constraint of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYear_fullCredits(Year year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(EMFCoursesPackage.Literals.YEAR, year, diagnostics, context,
				"http://www.eclipse.org/acceleo/query/1.0", "fullCredits", YEAR__FULL_CREDITS__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlot(Slot slot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionSlot(SelectionSlot selectionSlot, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectionSlot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintSlot(ConstraintSlot constraintSlot, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintSlot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelCode(LevelCode levelCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCode(String courseCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCourseCode_Pattern(courseCode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusCode(StatusCode statusCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCourseCode_Pattern
	 */
	public static final PatternMatcher[][] COURSE_CODE__PATTERN__VALUES = new PatternMatcher[][] {
			new PatternMatcher[] { XMLTypeUtil.createPatternMatcher("\\p{L}+\\d+") } };

	/**
	 * Validates the Pattern constraint of '<em>Course Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCode_Pattern(String courseCode, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validatePattern(EMFCoursesPackage.Literals.COURSE_CODE, courseCode, COURSE_CODE__PATTERN__VALUES,
				diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EMFCoursesValidator

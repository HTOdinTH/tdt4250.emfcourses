/**
 */
package eMFCourses;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eMFCourses.EMFCoursesPackage#getStatusCode()
 * @model instanceClass="eMFCourses.StatusCode"
 * @generated
 */
public enum StatusCode implements Enumerator {
	/**
	 * The '<em><b>OBLIGATORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBLIGATORY_VALUE
	 * @generated
	 * @ordered
	 */
	OBLIGATORY(0, "OBLIGATORY", "O"),

	/**
	 * The '<em><b>SELECTABLE A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTABLE_A_VALUE
	 * @generated
	 * @ordered
	 */
	SELECTABLE_A(1, "SELECTABLE_A", "VA"),

	/**
	 * The '<em><b>SELECTABLE B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTABLE_B_VALUE
	 * @generated
	 * @ordered
	 */
	SELECTABLE_B(2, "SELECTABLE_B", "VB"),

	/**
	 * The '<em><b>OPTIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIONAL(3, "OPTIONAL", "V");

	/**
	 * The '<em><b>OBLIGATORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBLIGATORY
	 * @model literal="O"
	 * @generated
	 * @ordered
	 */
	public static final int OBLIGATORY_VALUE = 0;

	/**
	 * The '<em><b>SELECTABLE A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTABLE_A
	 * @model literal="VA"
	 * @generated
	 * @ordered
	 */
	public static final int SELECTABLE_A_VALUE = 1;

	/**
	 * The '<em><b>SELECTABLE B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTABLE_B
	 * @model literal="VB"
	 * @generated
	 * @ordered
	 */
	public static final int SELECTABLE_B_VALUE = 2;

	/**
	 * The '<em><b>OPTIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIONAL
	 * @model literal="V"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIONAL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Status Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StatusCode[] VALUES_ARRAY = new StatusCode[] { OBLIGATORY, SELECTABLE_A, SELECTABLE_B,
			OPTIONAL, };

	/**
	 * A public read-only list of all the '<em><b>Status Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StatusCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Status Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatusCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatusCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatusCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatusCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatusCode get(int value) {
		switch (value) {
		case OBLIGATORY_VALUE:
			return OBLIGATORY;
		case SELECTABLE_A_VALUE:
			return SELECTABLE_A;
		case SELECTABLE_B_VALUE:
			return SELECTABLE_B;
		case OPTIONAL_VALUE:
			return OPTIONAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StatusCode(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //StatusCode

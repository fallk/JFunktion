// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.jfunktion;

/**
 * Represents an operation upon two {@code short}-valued operands and producing an
 * {@code short}-valued result.   This is the primitive type specialization of
 * {@link BinaryOperator} for {@code int}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #applyAsInt(short, short)}.
 *
 * @see BinaryOperator
 * @see IntUnaryOperator
 * @since 1.8
 */
@FunctionalInterface
public interface ShortBinaryOperator {

    /**
     * Applies this operator to the given operands.
     *
     * @param left the first operand
     * @param right the second operand
     * @return the operator result
     */
    short applyAsShort(short left, short right);
}

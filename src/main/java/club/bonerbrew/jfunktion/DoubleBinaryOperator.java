// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package club.bonerbrew.jfunktion;

/**
 * Represents an operation upon two {@code double}-valued operands and producing an
 * {@code double}-valued result.   This is the primitive type specialization of
 * {@link BinaryOperator} for {@code int}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #applyAsInt(double, double)}.
 *
 * @see BinaryOperator
 * @see IntUnaryOperator
 * @since 1.8
 */
@FunctionalInterface
public interface DoubleBinaryOperator {

    /**
     * Applies this operator to the given operands.
     *
     * @param left the first operand
     * @param right the second operand
     * @return the operator result
     */
    double applyAsDouble(double left, double right);
}

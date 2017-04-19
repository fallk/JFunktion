// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package club.bonerbrew.jfunktion;

/**
 * Represents an operation upon two {@code long}-valued operands and producing an
 * {@code long}-valued result.   This is the primitive type specialization of
 * {@link BinaryOperator} for {@code int}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #applyAsInt(long, long)}.
 *
 * @see BinaryOperator
 * @see IntUnaryOperator
 * @since 1.8
 */
@FunctionalInterface
public interface LongBinaryOperator {

    /**
     * Applies this operator to the given operands.
     *
     * @param left the first operand
     * @param right the second operand
     * @return the operator result
     */
    long applyAsLong(long left, long right);
}

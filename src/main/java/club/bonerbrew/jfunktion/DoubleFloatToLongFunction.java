// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package club.bonerbrew.jfunktion;

/**
 * Represents a function that accepts two arguments, a double and a generic, and produces a
 * float result.  This is the {@code double} and {@code float}-consuming-to-{@code long} primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface DoubleFloatToLongFunction {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code double} argument
     * @param v2 the {@code float} argument
     * @return the function result
     */
    long apply(double v1, float v2);
}

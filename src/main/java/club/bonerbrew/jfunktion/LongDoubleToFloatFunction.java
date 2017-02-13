// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package club.bonerbrew.jfunktion;

/**
 * Represents a function that accepts two arguments, a long and a generic, and produces a
 * double result.  This is the {@code long} and {@code double}-consuming-to-{@code float} primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface LongDoubleToFloatFunction {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code long} argument
     * @param v2 the {@code double} argument
     * @return the function result
     */
    float apply(long v1, double v2);
}

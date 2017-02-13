/**
 * Represents a function that accepts two arguments, a double and a generic, and produces a
 * long result.  This is the {@code double}-consuming-to-{@code long} primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @param <T> the type of the generic function argument
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface DoubleObjectToLongFunction<T> {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code double} argument
     * @param v2 the generic argument
     * @return the function result
     */
    long apply(double v1, T v2);
}

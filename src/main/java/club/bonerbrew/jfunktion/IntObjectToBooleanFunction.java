/**
 * Represents a function that accepts two arguments, a int and a generic, and produces a
 * boolean result.  This is the {@code int}-consuming-to-{@code boolean} primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @param <T> the type of the generic function argument
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface IntObjectToBooleanFunction<T> {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code int} argument
     * @param v2 the generic argument
     * @return the function result
     */
    boolean apply(int v1, T v2);
}

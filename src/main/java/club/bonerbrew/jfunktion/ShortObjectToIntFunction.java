/**
 * Represents a function that accepts two arguments, a short and a generic, and produces a
 * int result.  This is the {@code short}-consuming-to-{@code int} primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @param <T> the type of the generic function argument
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface ShortObjectToIntFunction<T> {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code short} argument
     * @param v2 the generic argument
     * @return the function result
     */
    int apply(short v1, T v2);
}

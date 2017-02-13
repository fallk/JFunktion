/**
 * Represents a function that accepts two arguments, a long and a generic, and produces a
 * char result.  This is the {@code long}-consuming-to-{@code char} primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @param <T> the type of the generic function argument
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface LongObjectToCharFunction<T> {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code long} argument
     * @param v2 the generic argument
     * @return the function result
     */
    char apply(long v1, T v2);
}

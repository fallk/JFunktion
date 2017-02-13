/**
 * Represents a function that accepts two arguments, a char and a generic, and produces a
 * char result.  This is the {@code char}-consuming-to-{@code char} primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @param <T> the type of the generic function argument
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface CharObjectToCharFunction<T> {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code char} argument
     * @param v2 the generic argument
     * @return the function result
     */
    char apply(char v1, T v2);
}

// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package club.bonerbrew.jfunktion;

/**
 * Represents a function that accepts two arguments, a boolean and a generic, and produces a
 * int result.  This is the {@code boolean}-consuming-to-{@code int} primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @param <T> the type of the generic function argument
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface BooleanObjectToIntFunction<T> {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code boolean} argument
     * @param v2 the generic argument
     * @return the function result
     */
    int apply(boolean v1, T v2);
}
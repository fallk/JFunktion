// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package club.bonerbrew.jfunktion;

/**
 * Represents a function that accepts two arguments, a char and a generic, and produces a
 * byte result.  This is the {@code char}-consuming-to-{@code byte} primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @param <T> the type of the generic function argument
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface CharObjectToByteFunction<T> {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code char} argument
     * @param v2 the generic argument
     * @return the function result
     */
    byte apply(char v1, T v2);
}
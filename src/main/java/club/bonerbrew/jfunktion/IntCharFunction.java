// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package club.bonerbrew.jfunktion;

/**
 * Represents a function that accepts two arguments, a int and a char, and produces a
 * result.  This is the {@code int} and {@code char}-consuming primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @param <R> the type of the result of the function
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface IntCharFunction<R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code int} argument
     * @param v2 the {@code char} argument
     * @return the function result
     */
    R apply(int v1, char v2);
}

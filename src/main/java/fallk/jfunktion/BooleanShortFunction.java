// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.jfunktion;

/**
 * Represents a function that accepts two arguments, a boolean and a short, and produces a
 * result.  This is the {@code boolean} and {@code short}-consuming primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @param <R> the type of the result of the function
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface BooleanShortFunction<R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code boolean} argument
     * @param v2 the {@code short} argument
     * @return the function result
     */
    R apply(boolean v1, short v2);
}

/**
 * Represents a function that accepts two arguments, a float and a generic, and produces a
 * float result.  This is the {@code float}-consuming-to-{@code float} primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @param <T> the type of the generic function argument
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface FloatObjectToFloatFunction<T> {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code float} argument
     * @param v2 the generic argument
     * @return the function result
     */
    float apply(float v1, T v2);
}

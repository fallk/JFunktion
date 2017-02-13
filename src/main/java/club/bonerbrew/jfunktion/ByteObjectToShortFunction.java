/**
 * Represents a function that accepts two arguments, a byte and a generic, and produces a
 * short result.  This is the {@code byte}-consuming-to-{@code short} primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @param <T> the type of the generic function argument
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface ByteObjectToShortFunction<T> {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code byte} argument
     * @param v2 the generic argument
     * @return the function result
     */
    short apply(byte v1, T v2);
}

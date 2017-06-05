// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.jfunktion;

/**
 * Represents a function that accepts an char-valued argument and produces a
 * result.  This is the {@code char}-consuming primitive specialization for
 * {@link java.util.function.Function}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #apply(char)}.
 *
 * @param <R> the type of the result of the function
 *
 * @see java.util.function.Function
 * @since 1.8
 */
@FunctionalInterface
public interface CharFunction<R> {

    /**
     * Applies this function to the given argument.
     *
     * @param value the function argument
     * @return the function result
     */
    R apply(char value);
}

// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package club.bonerbrew.jfunktion;

/**
 * Represents a function that accepts an double-valued argument and produces a
 * result.  This is the {@code double}-consuming primitive specialization for
 * {@link java.util.function.Function}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #apply(double)}.
 *
 * @param <R> the type of the result of the function
 *
 * @see java.util.function.Function
 * @since 1.8
 */
@FunctionalInterface
public interface DoubleFunction<R> {

    /**
     * Applies this function to the given argument.
     *
     * @param value the function argument
     * @return the function result
     */
    R apply(double value);
}

// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.jfunktion;

/**
 * Represents a predicate (boolean-valued function) of a {@code int}-valued and a {@code float}-valued argument.
 * This is the primitive type specialization of
 * {@link java.util.function.BiPredicate} for {@code int}/{@code float}.
 *
 * @see java.util.function.BiPredicate
 */
@FunctionalInterface
public interface IntFloatPredicate {

    /**
     * Evaluates this predicate on the given arguments.
     *
     * @param v1 the {@code int} argument
     * @param v2 the {@code float} argument
     * @return {@code true} if the input arguments match the predicate,
     * otherwise {@code false}
     */
    boolean apply(int v1, float v2);
}

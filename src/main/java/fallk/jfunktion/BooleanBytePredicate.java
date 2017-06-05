// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.jfunktion;

/**
 * Represents a predicate (boolean-valued function) of a {@code boolean}-valued and a {@code byte}-valued argument.
 * This is the primitive type specialization of
 * {@link java.util.function.BiPredicate} for {@code boolean}/{@code byte}.
 *
 * @see java.util.function.BiPredicate
 */
@FunctionalInterface
public interface BooleanBytePredicate {

    /**
     * Evaluates this predicate on the given arguments.
     *
     * @param v1 the {@code boolean} argument
     * @param v2 the {@code byte} argument
     * @return {@code true} if the input arguments match the predicate,
     * otherwise {@code false}
     */
    boolean apply(boolean v1, byte v2);
}

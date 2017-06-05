// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.jfunktion;

/**
 * Represents a predicate (boolean-valued function) of a {@code long}-valued and a {@code char}-valued argument.
 * This is the primitive type specialization of
 * {@link java.util.function.BiPredicate} for {@code long}/{@code char}.
 *
 * @see java.util.function.BiPredicate
 */
@FunctionalInterface
public interface LongCharPredicate {

    /**
     * Evaluates this predicate on the given arguments.
     *
     * @param v1 the {@code long} argument
     * @param v2 the {@code char} argument
     * @return {@code true} if the input arguments match the predicate,
     * otherwise {@code false}
     */
    boolean apply(long v1, char v2);
}

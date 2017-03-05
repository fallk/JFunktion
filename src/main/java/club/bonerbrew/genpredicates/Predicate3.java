package club.bonerbrew.genpredicates;

/**
 * A predicate that accepts 3 arguments and produces a boolean result.
 */
@FunctionalInterface
public interface Predicate3 <K1,K2,K3> {

    /**
     * Applies this function to the given arguments.
     * 
     * @return {@code true} if the predicate succeeded, {@code false} otherwise
     */
    boolean accept(K1 arg0,
        K2 arg1,
        K3 arg2);
}
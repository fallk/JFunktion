package club.bonerbrew.genpredicates;

/**
 * A predicate that accepts 2 arguments and produces a boolean result.
 */
@FunctionalInterface
public interface Predicate2 <K1,K2> {

    /**
     * Applies this function to the given arguments.
     * 
     * @return {@code true} if the predicate succeeded, {@code false} otherwise
     */
    boolean accept(K1 arg0,
        K2 arg1);
}
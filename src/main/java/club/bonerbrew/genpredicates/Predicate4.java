package club.bonerbrew.genpredicates;

/**
 * A predicate that accepts 4 arguments and produces a boolean result.
 */
@FunctionalInterface
public interface Predicate4 <K1,K2,K3,K4> {

    /**
     * Applies this function to the given arguments.
     * 
     * @return {@code true} if the predicate succeeded, {@code false} otherwise
     */
    boolean accept(K1 arg0,
        K2 arg1,
        K3 arg2,
        K4 arg3);
}
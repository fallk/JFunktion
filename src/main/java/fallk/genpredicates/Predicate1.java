package fallk.genpredicates;

/**
 * A predicate that accepts 1 arguments and produces a boolean result.
 */
@FunctionalInterface
public interface Predicate1 <K1> {

    /**
     * Applies this function to the given arguments.
     * 
     * @return {@code true} if the predicate succeeded, {@code false} otherwise
     */
    boolean accept(K1 arg0);
}
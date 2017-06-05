package fallk.genpredicates;

/**
 * A predicate that accepts 7 arguments and produces a boolean result.
 */
@FunctionalInterface
public interface Predicate7 <K1,K2,K3,K4,K5,K6,K7> {

    /**
     * Applies this function to the given arguments.
     * 
     * @return {@code true} if the predicate succeeded, {@code false} otherwise
     */
    boolean accept(K1 arg0,
        K2 arg1,
        K3 arg2,
        K4 arg3,
        K5 arg4,
        K6 arg5,
        K7 arg6);
}
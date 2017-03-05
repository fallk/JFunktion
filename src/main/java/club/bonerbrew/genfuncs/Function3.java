package club.bonerbrew.genfuncs;

/**
 * A function that accepts 3 arguments and produces a result.
 */
@FunctionalInterface
public interface Function3 <K1,K2,K3,R> {

    /**
     * Applies this function to the given arguments.
     *
     * @return the function result
     */
    R apply(K1 arg0,
        K2 arg1,
        K3 arg2);
}
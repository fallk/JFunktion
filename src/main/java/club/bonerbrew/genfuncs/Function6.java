package club.bonerbrew.genfuncs;

/**
 * A function that accepts 6 arguments and produces a result.
 */
@FunctionalInterface
public interface Function6 <K1,K2,K3,K4,K5,K6,R> {

    /**
     * Applies this function to the given arguments.
     *
     * @return the function result
     */
    R apply(K1 arg0,
        K2 arg1,
        K3 arg2,
        K4 arg3,
        K5 arg4,
        K6 arg5);
}
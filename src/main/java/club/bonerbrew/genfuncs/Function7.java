package club.bonerbrew.genfuncs;

/**
 * A function that accepts 7 arguments and produces a result.
 */
@FunctionalInterface
public interface Function7 <K1,K2,K3,K4,K5,K6,K7,R> {

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
        K6 arg5,
        K7 arg6);
}
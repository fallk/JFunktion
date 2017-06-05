package fallk.genfuncs;

/**
 * A function that accepts 2 arguments and produces a result.
 */
@FunctionalInterface
public interface Function2 <K1,K2,R> {

    /**
     * Applies this function to the given arguments.
     *
     * @return the function result
     */
    R apply(K1 arg0,
        K2 arg1);
}
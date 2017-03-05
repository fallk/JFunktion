package club.bonerbrew.genfuncs;

/**
 * A function that accepts 1 arguments and produces a result.
 */
@FunctionalInterface
public interface Function1 <K1,R> {

    /**
     * Applies this function to the given arguments.
     *
     * @return the function result
     */
    R apply(K1 arg0);
}
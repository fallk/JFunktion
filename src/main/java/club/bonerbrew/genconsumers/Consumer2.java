package club.bonerbrew.genconsumers;

/**
 * A consumer that accepts 2 arguments.
 */
@FunctionalInterface
public interface Consumer2 <K1,K2> {

    /**
     * Accept the given arguments.
     */
    void accept(K1 arg0,
        K2 arg1);
}
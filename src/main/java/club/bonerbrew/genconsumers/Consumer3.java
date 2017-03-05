package club.bonerbrew.genconsumers;

/**
 * A consumer that accepts 3 arguments.
 */
@FunctionalInterface
public interface Consumer3 <K1,K2,K3> {

    /**
     * Accept the given arguments.
     */
    void accept(K1 arg0,
        K2 arg1,
        K3 arg2);
}
package fallk.genconsumers;

/**
 * A consumer that accepts 4 arguments.
 */
@FunctionalInterface
public interface Consumer4 <K1,K2,K3,K4> {

    /**
     * Accept the given arguments.
     */
    void accept(K1 arg0,
        K2 arg1,
        K3 arg2,
        K4 arg3);
}
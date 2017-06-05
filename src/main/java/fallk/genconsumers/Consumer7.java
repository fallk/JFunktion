package fallk.genconsumers;

/**
 * A consumer that accepts 7 arguments.
 */
@FunctionalInterface
public interface Consumer7 <K1,K2,K3,K4,K5,K6,K7> {

    /**
     * Accept the given arguments.
     */
    void accept(K1 arg0,
        K2 arg1,
        K3 arg2,
        K4 arg3,
        K5 arg4,
        K6 arg5,
        K7 arg6);
}
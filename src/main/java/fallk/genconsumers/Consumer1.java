package fallk.genconsumers;

/**
 * A consumer that accepts 1 arguments.
 */
@FunctionalInterface
public interface Consumer1 <K1> {

    /**
     * Accept the given arguments.
     */
    void accept(K1 arg0);
}
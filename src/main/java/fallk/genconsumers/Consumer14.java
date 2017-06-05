package fallk.genconsumers;

/**
 * A consumer that accepts 14 arguments.
 */
@FunctionalInterface
public interface Consumer14 <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10,K11,K12,K13,K14> {

    /**
     * Accept the given arguments.
     */
    void accept(K1 arg0,
        K2 arg1,
        K3 arg2,
        K4 arg3,
        K5 arg4,
        K6 arg5,
        K7 arg6,
        K8 arg7,
        K9 arg8,
        K10 arg9,
        K11 arg10,
        K12 arg11,
        K13 arg12,
        K14 arg13);
}
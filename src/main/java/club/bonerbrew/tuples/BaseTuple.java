package club.bonerbrew.tuples;

import java.io.Serializable;
import java.util.Arrays;
import java.util.stream.Stream;

public interface BaseTuple extends Serializable {
    /**
     * @return the amount of elements in this tuple
     */
    int getSize();

    /**
     * @return the first / leftmost element in this tuple.
     */
    Object getLeft();

    /**
     * @return the last / rightmost element in this tuple.
     */
    Object getRight();

    /**
     * @return a stream containing each element in this tuple in its current state.
     */
    default Stream <Object> stream() {
        return Arrays.stream(toArray());
    }

    /**
     * @return an array representation of this tuple.
     */
    public Object[] toArray();
}

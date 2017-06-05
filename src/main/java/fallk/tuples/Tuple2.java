package fallk.tuples;

import java.util.Iterator;
import java.util.Arrays;
import java.util.stream.Stream;

import fallk.tuples.values.IValue0;
import fallk.tuples.values.IValue1;

/**
 * A tuple of 2 elements.
 */
public final class Tuple2 <K1,K2>
    implements BaseTuple,
    IValue0 <K1> ,
    IValue1 <K2> {

        private static final long serialVersionUID = -1607420937567707033L;

        private final K1 val0;
        private final K2 val1;

        /**
         * Creates a tuple with 2 elements. Pretty straightforward, isn't it?
         */
        public static <K1,K2> Tuple2 <K1,K2> with(final K1 value0,
            final K2 value1) {
            return new Tuple2 <K1,K2> (value0,
                value1);
        }

        /**
         * Creates a tuple with 2 elements. Pretty straightforward, isn't it?
         */
        public static <K1,K2> Tuple2 <K1,K2> of (final K1 value0,
            final K2 value1) {
            return new Tuple2 <K1,K2> (value0,
                value1);
        }

        /**
         * Create a tuple from an array. The array has to have exactly 2 elements.
         * 
         * @param <X> the array element type
         * @param array the array to be converted to a tuple
         * @return the tuple
         */
        public static <X> Tuple2 <X,X> fromArray(final X[] array) {
            if(array == null) {
                throw new IllegalArgumentException("Array cannot be null");
            }
            if(array.length != 2) {
                throw new IllegalArgumentException("Array must have exactly 10 elements in order to create a Tuple2. Size is " + array.length);
            }
            return new Tuple2 <X,X> (
                array[0],
                array[1]
            );
        }

        /**
         * Create tuple from an iterable. It must have exactly 2 elements or less remaining.
         * 
         * @param <X> the iterable component type 
         * @param iterable the iterable to be converted to a tuple
         * @return the tuple
         */
        public static <X> Tuple2 <X,X> fromIterable(final Iterable <X> iterable) {
            return fromIterable(iterable.iterator());
        }

        private static <X> Tuple2 <X,X> fromIterable(final Iterator <X> iter) {

            if(iter == null) {
                throw new NullPointerException("Iterator cannot be null");
            }

            X element0 = null;
            X element1 = null;

            if(iter.hasNext()) {
                element0 = iter.next();
            }

            if(iter.hasNext()) {
                element1 = iter.next();
            }

            return new Tuple2 <X,X> (
                element0,
                element1
            );
        }

        private Tuple2(
            final K1 value0,
            final K2 value1
        ) {
            this.val0 = value0;
            this.val1 = value1;
        }

        /**
         * Gets the value at index 0.
         * @return the value at index 0.
         */
        @Override
        public K1 getValue0() {
            return this.val0;
        }

        /**
         * Gets the value at index 0.
         * @return the value at index 0.
         */
        @Override
        public K1 get0() {
            return this.val0;
        }

        /**
         * Gets the value at index 1.
         * @return the value at index 1.
         */
        @Override
        public K2 getValue1() {
            return this.val1;
        }

        /**
         * Gets the value at index 1.
         * @return the value at index 1.
         */
        @Override
        public K2 get1() {
            return this.val1;
        }

        /**
         * @return the first / leftmost element in this tuple.
         */
        @Override
        public K1 getLeft() {
            return this.val0;
        }

        /**
         * @return the last / rightmost element in this tuple.
         */
        @Override
        public K2 getRight() {
            return this.val1;
        }

        /**
         * @return a stream containing each element in this tuple in its current state.
         */
        public Stream <Object> stream() {
            return Arrays.stream(new Object[] {
                val0,
                val1
            });
        }

        /**
         * @return an array representation of this tuple.
         */
        public Object[] toArray() {
            return new Object[] {
                val0,
                val1
            };
        }

        /**
         * @return an array representation of this tuple.
         */
        public String toString() {
            return "Tuple2 [" + Arrays.toString(new Object[] {
                val0,
                val1
            }) + "]";
        }

        @Override
        public int getSize() {
            return 2;
        }
    }
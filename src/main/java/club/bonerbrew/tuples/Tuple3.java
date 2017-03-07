package club.bonerbrew.tuples;

import java.util.Iterator;
import java.util.Arrays;
import java.util.stream.Stream;

import club.bonerbrew.tuples.values.IValue0;
import club.bonerbrew.tuples.values.IValue1;
import club.bonerbrew.tuples.values.IValue2;

/**
 * A tuple of 3 elements.
 */
public final class Tuple3 <K1,K2,K3>
    implements BaseTuple,
    IValue0 <K1> ,
    IValue1 <K2> ,
    IValue2 <K3> {

        private static final long serialVersionUID = -1607420937567707033L;

        private final K1 val0;
        private final K2 val1;
        private final K3 val2;

        /**
         * Creates a tuple with 3 elements. Pretty straightforward, isn't it?
         */
        public static <K1,K2,K3> Tuple3 <K1,K2,K3> with(final K1 value0,
            final K2 value1,
            final K3 value2) {
            return new Tuple3 <K1,K2,K3> (value0,
                value1,
                value2);
        }

        /**
         * Creates a tuple with 3 elements. Pretty straightforward, isn't it?
         */
        public static <K1,K2,K3> Tuple3 <K1,K2,K3> of (final K1 value0,
            final K2 value1,
            final K3 value2) {
            return new Tuple3 <K1,K2,K3> (value0,
                value1,
                value2);
        }

        /**
         * Create a tuple from an array. The array has to have exactly 3 elements.
         * 
         * @param <X> the array element type
         * @param array the array to be converted to a tuple
         * @return the tuple
         */
        public static <X> Tuple3 <X,X,X> fromArray(final X[] array) {
            if(array == null) {
                throw new IllegalArgumentException("Array cannot be null");
            }
            if(array.length != 3) {
                throw new IllegalArgumentException("Array must have exactly 10 elements in order to create a Tuple3. Size is " + array.length);
            }
            return new Tuple3 <X,X,X> (
                array[0],
                array[1],
                array[2]
            );
        }

        /**
         * Create tuple from an iterable. It must have exactly 3 elements or less remaining.
         * 
         * @param <X> the iterable component type 
         * @param iterable the iterable to be converted to a tuple
         * @return the tuple
         */
        public static <X> Tuple3 <X,X,X> fromIterable(final Iterable <X> iterable) {
            return fromIterable(iterable.iterator());
        }

        private static <X> Tuple3 <X,X,X> fromIterable(final Iterator <X> iter) {

            if(iter == null) {
                throw new NullPointerException("Iterator cannot be null");
            }

            X element0 = null;
            X element1 = null;
            X element2 = null;

            if(iter.hasNext()) {
                element0 = iter.next();
            }

            if(iter.hasNext()) {
                element1 = iter.next();
            }

            if(iter.hasNext()) {
                element2 = iter.next();
            }

            return new Tuple3 <X,X,X> (
                element0,
                element1,
                element2
            );
        }

        private Tuple3(
            final K1 value0,
            final K2 value1,
            final K3 value2
        ) {
            this.val0 = value0;
            this.val1 = value1;
            this.val2 = value2;
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
         * Gets the value at index 2.
         * @return the value at index 2.
         */
        @Override
        public K3 getValue2() {
            return this.val2;
        }

        /**
         * Gets the value at index 2.
         * @return the value at index 2.
         */
        @Override
        public K3 get2() {
            return this.val2;
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
        public K3 getRight() {
            return this.val2;
        }

        /**
         * @return a stream containing each element in this tuple in its current state.
         */
        public Stream <Object> stream() {
            return Arrays.stream(new Object[] {
                val0,
                val1,
                val2
            });
        }

        /**
         * @return an array representation of this tuple.
         */
        public Object[] toArray() {
            return new Object[] {
                val0,
                val1,
                val2
            };
        }

        /**
         * @return an array representation of this tuple.
         */
        public String toString() {
            return "Tuple3 [" + Arrays.toString(new Object[] {
                val0,
                val1,
                val2
            }) + "]";
        }

        @Override
        public int getSize() {
            return 3;
        }
    }
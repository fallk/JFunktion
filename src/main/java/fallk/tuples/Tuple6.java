package fallk.tuples;

import java.util.Iterator;
import java.util.Arrays;
import java.util.stream.Stream;

import fallk.tuples.values.IValue0;
import fallk.tuples.values.IValue1;
import fallk.tuples.values.IValue2;
import fallk.tuples.values.IValue3;
import fallk.tuples.values.IValue4;
import fallk.tuples.values.IValue5;

/**
 * A tuple of 6 elements.
 */
public final class Tuple6 <K1,K2,K3,K4,K5,K6>
    implements BaseTuple,
    IValue0 <K1> ,
    IValue1 <K2> ,
    IValue2 <K3> ,
    IValue3 <K4> ,
    IValue4 <K5> ,
    IValue5 <K6> {

        private static final long serialVersionUID = -1607420937567707033L;

        private final K1 val0;
        private final K2 val1;
        private final K3 val2;
        private final K4 val3;
        private final K5 val4;
        private final K6 val5;

        /**
         * Creates a tuple with 6 elements. Pretty straightforward, isn't it?
         */
        public static <K1,K2,K3,K4,K5,K6> Tuple6 <K1,K2,K3,K4,K5,K6> with(final K1 value0,
            final K2 value1,
            final K3 value2,
            final K4 value3,
            final K5 value4,
            final K6 value5) {
            return new Tuple6 <K1,K2,K3,K4,K5,K6> (value0,
                value1,
                value2,
                value3,
                value4,
                value5);
        }

        /**
         * Creates a tuple with 6 elements. Pretty straightforward, isn't it?
         */
        public static <K1,K2,K3,K4,K5,K6> Tuple6 <K1,K2,K3,K4,K5,K6> of (final K1 value0,
            final K2 value1,
            final K3 value2,
            final K4 value3,
            final K5 value4,
            final K6 value5) {
            return new Tuple6 <K1,K2,K3,K4,K5,K6> (value0,
                value1,
                value2,
                value3,
                value4,
                value5);
        }

        /**
         * Create a tuple from an array. The array has to have exactly 6 elements.
         * 
         * @param <X> the array element type
         * @param array the array to be converted to a tuple
         * @return the tuple
         */
        public static <X> Tuple6 <X,X,X,X,X,X> fromArray(final X[] array) {
            if(array == null) {
                throw new IllegalArgumentException("Array cannot be null");
            }
            if(array.length != 6) {
                throw new IllegalArgumentException("Array must have exactly 10 elements in order to create a Tuple6. Size is " + array.length);
            }
            return new Tuple6 <X,X,X,X,X,X> (
                array[0],
                array[1],
                array[2],
                array[3],
                array[4],
                array[5]
            );
        }

        /**
         * Create tuple from an iterable. It must have exactly 6 elements or less remaining.
         * 
         * @param <X> the iterable component type 
         * @param iterable the iterable to be converted to a tuple
         * @return the tuple
         */
        public static <X> Tuple6 <X,X,X,X,X,X> fromIterable(final Iterable <X> iterable) {
            return fromIterable(iterable.iterator());
        }

        private static <X> Tuple6 <X,X,X,X,X,X> fromIterable(final Iterator <X> iter) {

            if(iter == null) {
                throw new NullPointerException("Iterator cannot be null");
            }

            X element0 = null;
            X element1 = null;
            X element2 = null;
            X element3 = null;
            X element4 = null;
            X element5 = null;

            if(iter.hasNext()) {
                element0 = iter.next();
            }

            if(iter.hasNext()) {
                element1 = iter.next();
            }

            if(iter.hasNext()) {
                element2 = iter.next();
            }

            if(iter.hasNext()) {
                element3 = iter.next();
            }

            if(iter.hasNext()) {
                element4 = iter.next();
            }

            if(iter.hasNext()) {
                element5 = iter.next();
            }

            return new Tuple6 <X,X,X,X,X,X> (
                element0,
                element1,
                element2,
                element3,
                element4,
                element5
            );
        }

        private Tuple6(
            final K1 value0,
            final K2 value1,
            final K3 value2,
            final K4 value3,
            final K5 value4,
            final K6 value5
        ) {
            this.val0 = value0;
            this.val1 = value1;
            this.val2 = value2;
            this.val3 = value3;
            this.val4 = value4;
            this.val5 = value5;
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
         * Gets the value at index 3.
         * @return the value at index 3.
         */
        @Override
        public K4 getValue3() {
            return this.val3;
        }

        /**
         * Gets the value at index 3.
         * @return the value at index 3.
         */
        @Override
        public K4 get3() {
            return this.val3;
        }

        /**
         * Gets the value at index 4.
         * @return the value at index 4.
         */
        @Override
        public K5 getValue4() {
            return this.val4;
        }

        /**
         * Gets the value at index 4.
         * @return the value at index 4.
         */
        @Override
        public K5 get4() {
            return this.val4;
        }

        /**
         * Gets the value at index 5.
         * @return the value at index 5.
         */
        @Override
        public K6 getValue5() {
            return this.val5;
        }

        /**
         * Gets the value at index 5.
         * @return the value at index 5.
         */
        @Override
        public K6 get5() {
            return this.val5;
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
        public K6 getRight() {
            return this.val5;
        }

        /**
         * @return a stream containing each element in this tuple in its current state.
         */
        public Stream <Object> stream() {
            return Arrays.stream(new Object[] {
                val0,
                val1,
                val2,
                val3,
                val4,
                val5
            });
        }

        /**
         * @return an array representation of this tuple.
         */
        public Object[] toArray() {
            return new Object[] {
                val0,
                val1,
                val2,
                val3,
                val4,
                val5
            };
        }

        /**
         * @return an array representation of this tuple.
         */
        public String toString() {
            return "Tuple6 [" + Arrays.toString(new Object[] {
                val0,
                val1,
                val2,
                val3,
                val4,
                val5
            }) + "]";
        }

        @Override
        public int getSize() {
            return 6;
        }
    }
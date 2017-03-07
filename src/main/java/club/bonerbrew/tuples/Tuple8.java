package club.bonerbrew.tuples;

import java.util.Iterator;
import java.util.Arrays;
import java.util.stream.Stream;

import club.bonerbrew.tuples.values.IValue0;
import club.bonerbrew.tuples.values.IValue1;
import club.bonerbrew.tuples.values.IValue2;
import club.bonerbrew.tuples.values.IValue3;
import club.bonerbrew.tuples.values.IValue4;
import club.bonerbrew.tuples.values.IValue5;
import club.bonerbrew.tuples.values.IValue6;
import club.bonerbrew.tuples.values.IValue7;

/**
 * A tuple of 8 elements.
 */
public final class Tuple8 <K1,K2,K3,K4,K5,K6,K7,K8>
    implements BaseTuple,
    IValue0 <K1> ,
    IValue1 <K2> ,
    IValue2 <K3> ,
    IValue3 <K4> ,
    IValue4 <K5> ,
    IValue5 <K6> ,
    IValue6 <K7> ,
    IValue7 <K8> {

        private static final long serialVersionUID = -1607420937567707033L;

        private final K1 val0;
        private final K2 val1;
        private final K3 val2;
        private final K4 val3;
        private final K5 val4;
        private final K6 val5;
        private final K7 val6;
        private final K8 val7;

        /**
         * Creates a tuple with 8 elements. Pretty straightforward, isn't it?
         */
        public static <K1,K2,K3,K4,K5,K6,K7,K8> Tuple8 <K1,K2,K3,K4,K5,K6,K7,K8> with(final K1 value0,
            final K2 value1,
            final K3 value2,
            final K4 value3,
            final K5 value4,
            final K6 value5,
            final K7 value6,
            final K8 value7) {
            return new Tuple8 <K1,K2,K3,K4,K5,K6,K7,K8> (value0,
                value1,
                value2,
                value3,
                value4,
                value5,
                value6,
                value7);
        }

        /**
         * Creates a tuple with 8 elements. Pretty straightforward, isn't it?
         */
        public static <K1,K2,K3,K4,K5,K6,K7,K8> Tuple8 <K1,K2,K3,K4,K5,K6,K7,K8> of (final K1 value0,
            final K2 value1,
            final K3 value2,
            final K4 value3,
            final K5 value4,
            final K6 value5,
            final K7 value6,
            final K8 value7) {
            return new Tuple8 <K1,K2,K3,K4,K5,K6,K7,K8> (value0,
                value1,
                value2,
                value3,
                value4,
                value5,
                value6,
                value7);
        }

        /**
         * Create a tuple from an array. The array has to have exactly 8 elements.
         * 
         * @param <X> the array element type
         * @param array the array to be converted to a tuple
         * @return the tuple
         */
        public static <X> Tuple8 <X,X,X,X,X,X,X,X> fromArray(final X[] array) {
            if(array == null) {
                throw new IllegalArgumentException("Array cannot be null");
            }
            if(array.length != 8) {
                throw new IllegalArgumentException("Array must have exactly 10 elements in order to create a Tuple8. Size is " + array.length);
            }
            return new Tuple8 <X,X,X,X,X,X,X,X> (
                array[0],
                array[1],
                array[2],
                array[3],
                array[4],
                array[5],
                array[6],
                array[7]
            );
        }

        /**
         * Create tuple from an iterable. It must have exactly 8 elements or less remaining.
         * 
         * @param <X> the iterable component type 
         * @param iterable the iterable to be converted to a tuple
         * @return the tuple
         */
        public static <X> Tuple8 <X,X,X,X,X,X,X,X> fromIterable(final Iterable <X> iterable) {
            return fromIterable(iterable.iterator());
        }

        private static <X> Tuple8 <X,X,X,X,X,X,X,X> fromIterable(final Iterator <X> iter) {

            if(iter == null) {
                throw new NullPointerException("Iterator cannot be null");
            }

            X element0 = null;
            X element1 = null;
            X element2 = null;
            X element3 = null;
            X element4 = null;
            X element5 = null;
            X element6 = null;
            X element7 = null;

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

            if(iter.hasNext()) {
                element6 = iter.next();
            }

            if(iter.hasNext()) {
                element7 = iter.next();
            }

            return new Tuple8 <X,X,X,X,X,X,X,X> (
                element0,
                element1,
                element2,
                element3,
                element4,
                element5,
                element6,
                element7
            );
        }

        private Tuple8(
            final K1 value0,
            final K2 value1,
            final K3 value2,
            final K4 value3,
            final K5 value4,
            final K6 value5,
            final K7 value6,
            final K8 value7
        ) {
            this.val0 = value0;
            this.val1 = value1;
            this.val2 = value2;
            this.val3 = value3;
            this.val4 = value4;
            this.val5 = value5;
            this.val6 = value6;
            this.val7 = value7;
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
         * Gets the value at index 6.
         * @return the value at index 6.
         */
        @Override
        public K7 getValue6() {
            return this.val6;
        }

        /**
         * Gets the value at index 6.
         * @return the value at index 6.
         */
        @Override
        public K7 get6() {
            return this.val6;
        }

        /**
         * Gets the value at index 7.
         * @return the value at index 7.
         */
        @Override
        public K8 getValue7() {
            return this.val7;
        }

        /**
         * Gets the value at index 7.
         * @return the value at index 7.
         */
        @Override
        public K8 get7() {
            return this.val7;
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
        public K8 getRight() {
            return this.val7;
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
                val5,
                val6,
                val7
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
                val5,
                val6,
                val7
            };
        }

        /**
         * @return an array representation of this tuple.
         */
        public String toString() {
            return "Tuple8 [" + Arrays.toString(new Object[] {
                val0,
                val1,
                val2,
                val3,
                val4,
                val5,
                val6,
                val7
            }) + "]";
        }

        @Override
        public int getSize() {
            return 8;
        }
    }
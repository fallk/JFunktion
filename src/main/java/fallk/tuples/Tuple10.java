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
import fallk.tuples.values.IValue6;
import fallk.tuples.values.IValue7;
import fallk.tuples.values.IValue8;
import fallk.tuples.values.IValue9;

/**
 * A tuple of 10 elements.
 */
public final class Tuple10 <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10>
    implements BaseTuple,
    IValue0 <K1> ,
    IValue1 <K2> ,
    IValue2 <K3> ,
    IValue3 <K4> ,
    IValue4 <K5> ,
    IValue5 <K6> ,
    IValue6 <K7> ,
    IValue7 <K8> ,
    IValue8 <K9> ,
    IValue9 <K10> {

        private static final long serialVersionUID = -1607420937567707033L;

        private final K1 val0;
        private final K2 val1;
        private final K3 val2;
        private final K4 val3;
        private final K5 val4;
        private final K6 val5;
        private final K7 val6;
        private final K8 val7;
        private final K9 val8;
        private final K10 val9;

        /**
         * Creates a tuple with 10 elements. Pretty straightforward, isn't it?
         */
        public static <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10> Tuple10 <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10> with(final K1 value0,
            final K2 value1,
            final K3 value2,
            final K4 value3,
            final K5 value4,
            final K6 value5,
            final K7 value6,
            final K8 value7,
            final K9 value8,
            final K10 value9) {
            return new Tuple10 <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10> (value0,
                value1,
                value2,
                value3,
                value4,
                value5,
                value6,
                value7,
                value8,
                value9);
        }

        /**
         * Creates a tuple with 10 elements. Pretty straightforward, isn't it?
         */
        public static <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10> Tuple10 <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10> of (final K1 value0,
            final K2 value1,
            final K3 value2,
            final K4 value3,
            final K5 value4,
            final K6 value5,
            final K7 value6,
            final K8 value7,
            final K9 value8,
            final K10 value9) {
            return new Tuple10 <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10> (value0,
                value1,
                value2,
                value3,
                value4,
                value5,
                value6,
                value7,
                value8,
                value9);
        }

        /**
         * Create a tuple from an array. The array has to have exactly 10 elements.
         * 
         * @param <X> the array element type
         * @param array the array to be converted to a tuple
         * @return the tuple
         */
        public static <X> Tuple10 <X,X,X,X,X,X,X,X,X,X> fromArray(final X[] array) {
            if(array == null) {
                throw new IllegalArgumentException("Array cannot be null");
            }
            if(array.length != 10) {
                throw new IllegalArgumentException("Array must have exactly 10 elements in order to create a Tuple10. Size is " + array.length);
            }
            return new Tuple10 <X,X,X,X,X,X,X,X,X,X> (
                array[0],
                array[1],
                array[2],
                array[3],
                array[4],
                array[5],
                array[6],
                array[7],
                array[8],
                array[9]
            );
        }

        /**
         * Create tuple from an iterable. It must have exactly 10 elements or less remaining.
         * 
         * @param <X> the iterable component type 
         * @param iterable the iterable to be converted to a tuple
         * @return the tuple
         */
        public static <X> Tuple10 <X,X,X,X,X,X,X,X,X,X> fromIterable(final Iterable <X> iterable) {
            return fromIterable(iterable.iterator());
        }

        private static <X> Tuple10 <X,X,X,X,X,X,X,X,X,X> fromIterable(final Iterator <X> iter) {

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
            X element8 = null;
            X element9 = null;

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

            if(iter.hasNext()) {
                element8 = iter.next();
            }

            if(iter.hasNext()) {
                element9 = iter.next();
            }

            return new Tuple10 <X,X,X,X,X,X,X,X,X,X> (
                element0,
                element1,
                element2,
                element3,
                element4,
                element5,
                element6,
                element7,
                element8,
                element9
            );
        }

        private Tuple10(
            final K1 value0,
            final K2 value1,
            final K3 value2,
            final K4 value3,
            final K5 value4,
            final K6 value5,
            final K7 value6,
            final K8 value7,
            final K9 value8,
            final K10 value9
        ) {
            this.val0 = value0;
            this.val1 = value1;
            this.val2 = value2;
            this.val3 = value3;
            this.val4 = value4;
            this.val5 = value5;
            this.val6 = value6;
            this.val7 = value7;
            this.val8 = value8;
            this.val9 = value9;
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
         * Gets the value at index 8.
         * @return the value at index 8.
         */
        @Override
        public K9 getValue8() {
            return this.val8;
        }

        /**
         * Gets the value at index 8.
         * @return the value at index 8.
         */
        @Override
        public K9 get8() {
            return this.val8;
        }

        /**
         * Gets the value at index 9.
         * @return the value at index 9.
         */
        @Override
        public K10 getValue9() {
            return this.val9;
        }

        /**
         * Gets the value at index 9.
         * @return the value at index 9.
         */
        @Override
        public K10 get9() {
            return this.val9;
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
        public K10 getRight() {
            return this.val9;
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
                val7,
                val8,
                val9
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
                val7,
                val8,
                val9
            };
        }

        /**
         * @return an array representation of this tuple.
         */
        public String toString() {
            return "Tuple10 [" + Arrays.toString(new Object[] {
                val0,
                val1,
                val2,
                val3,
                val4,
                val5,
                val6,
                val7,
                val8,
                val9
            }) + "]";
        }

        @Override
        public int getSize() {
            return 10;
        }
    }
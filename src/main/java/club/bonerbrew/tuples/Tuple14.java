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
import club.bonerbrew.tuples.values.IValue8;
import club.bonerbrew.tuples.values.IValue9;
import club.bonerbrew.tuples.values.IValue10;
import club.bonerbrew.tuples.values.IValue11;
import club.bonerbrew.tuples.values.IValue12;
import club.bonerbrew.tuples.values.IValue13;

/**
 * A tuple of 14 elements.
 */
public final class Tuple14 <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10,K11,K12,K13,K14>
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
    IValue9 <K10> ,
    IValue10 <K11> ,
    IValue11 <K12> ,
    IValue12 <K13> ,
    IValue13 <K14> {

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
        private final K11 val10;
        private final K12 val11;
        private final K13 val12;
        private final K14 val13;

        /**
         * Creates a tuple with 14 elements. Pretty straightforward, isn't it?
         */
        public static <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10,K11,K12,K13,K14> Tuple14 <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10,K11,K12,K13,K14> with(final K1 value0,
            final K2 value1,
            final K3 value2,
            final K4 value3,
            final K5 value4,
            final K6 value5,
            final K7 value6,
            final K8 value7,
            final K9 value8,
            final K10 value9,
            final K11 value10,
            final K12 value11,
            final K13 value12,
            final K14 value13) {
            return new Tuple14 <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10,K11,K12,K13,K14> (value0,
                value1,
                value2,
                value3,
                value4,
                value5,
                value6,
                value7,
                value8,
                value9,
                value10,
                value11,
                value12,
                value13);
        }

        /**
         * Creates a tuple with 14 elements. Pretty straightforward, isn't it?
         */
        public static <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10,K11,K12,K13,K14> Tuple14 <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10,K11,K12,K13,K14> of (final K1 value0,
            final K2 value1,
            final K3 value2,
            final K4 value3,
            final K5 value4,
            final K6 value5,
            final K7 value6,
            final K8 value7,
            final K9 value8,
            final K10 value9,
            final K11 value10,
            final K12 value11,
            final K13 value12,
            final K14 value13) {
            return new Tuple14 <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10,K11,K12,K13,K14> (value0,
                value1,
                value2,
                value3,
                value4,
                value5,
                value6,
                value7,
                value8,
                value9,
                value10,
                value11,
                value12,
                value13);
        }

        /**
         * Create a tuple from an array. The array has to have exactly 14 elements.
         * 
         * @param <X> the array element type
         * @param array the array to be converted to a tuple
         * @return the tuple
         */
        public static <X> Tuple14 <X,X,X,X,X,X,X,X,X,X,X,X,X,X> fromArray(final X[] array) {
            if(array == null) {
                throw new IllegalArgumentException("Array cannot be null");
            }
            if(array.length != 14) {
                throw new IllegalArgumentException("Array must have exactly 10 elements in order to create a Tuple14. Size is " + array.length);
            }
            return new Tuple14 <X,X,X,X,X,X,X,X,X,X,X,X,X,X> (
                array[0],
                array[1],
                array[2],
                array[3],
                array[4],
                array[5],
                array[6],
                array[7],
                array[8],
                array[9],
                array[10],
                array[11],
                array[12],
                array[13]
            );
        }

        /**
         * Create tuple from an iterable. It must have exactly 14 elements or less remaining.
         * 
         * @param <X> the iterable component type 
         * @param iterable the iterable to be converted to a tuple
         * @return the tuple
         */
        public static <X> Tuple14 <X,X,X,X,X,X,X,X,X,X,X,X,X,X> fromIterable(final Iterable <X> iterable) {
            return fromIterable(iterable.iterator());
        }

        private static <X> Tuple14 <X,X,X,X,X,X,X,X,X,X,X,X,X,X> fromIterable(final Iterator <X> iter) {

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
            X element10 = null;
            X element11 = null;
            X element12 = null;
            X element13 = null;

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

            if(iter.hasNext()) {
                element10 = iter.next();
            }

            if(iter.hasNext()) {
                element11 = iter.next();
            }

            if(iter.hasNext()) {
                element12 = iter.next();
            }

            if(iter.hasNext()) {
                element13 = iter.next();
            }

            return new Tuple14 <X,X,X,X,X,X,X,X,X,X,X,X,X,X> (
                element0,
                element1,
                element2,
                element3,
                element4,
                element5,
                element6,
                element7,
                element8,
                element9,
                element10,
                element11,
                element12,
                element13
            );
        }

        private Tuple14(
            final K1 value0,
            final K2 value1,
            final K3 value2,
            final K4 value3,
            final K5 value4,
            final K6 value5,
            final K7 value6,
            final K8 value7,
            final K9 value8,
            final K10 value9,
            final K11 value10,
            final K12 value11,
            final K13 value12,
            final K14 value13
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
            this.val10 = value10;
            this.val11 = value11;
            this.val12 = value12;
            this.val13 = value13;
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
         * Gets the value at index 10.
         * @return the value at index 10.
         */
        @Override
        public K11 getValue10() {
            return this.val10;
        }

        /**
         * Gets the value at index 10.
         * @return the value at index 10.
         */
        @Override
        public K11 get10() {
            return this.val10;
        }

        /**
         * Gets the value at index 11.
         * @return the value at index 11.
         */
        @Override
        public K12 getValue11() {
            return this.val11;
        }

        /**
         * Gets the value at index 11.
         * @return the value at index 11.
         */
        @Override
        public K12 get11() {
            return this.val11;
        }

        /**
         * Gets the value at index 12.
         * @return the value at index 12.
         */
        @Override
        public K13 getValue12() {
            return this.val12;
        }

        /**
         * Gets the value at index 12.
         * @return the value at index 12.
         */
        @Override
        public K13 get12() {
            return this.val12;
        }

        /**
         * Gets the value at index 13.
         * @return the value at index 13.
         */
        @Override
        public K14 getValue13() {
            return this.val13;
        }

        /**
         * Gets the value at index 13.
         * @return the value at index 13.
         */
        @Override
        public K14 get13() {
            return this.val13;
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
        public K14 getRight() {
            return this.val13;
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
                val9,
                val10,
                val11,
                val12,
                val13
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
                val9,
                val10,
                val11,
                val12,
                val13
            };
        }

        /**
         * @return an array representation of this tuple.
         */
        public String toString() {
            return "Tuple14 [" + Arrays.toString(new Object[] {
                val0,
                val1,
                val2,
                val3,
                val4,
                val5,
                val6,
                val7,
                val8,
                val9,
                val10,
                val11,
                val12,
                val13
            }) + "]";
        }

        @Override
        public int getSize() {
            return 14;
        }
    }
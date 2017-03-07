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
import club.bonerbrew.tuples.values.IValue14;
import club.bonerbrew.tuples.values.IValue15;
import club.bonerbrew.tuples.values.IValue16;
import club.bonerbrew.tuples.values.IValue17;
import club.bonerbrew.tuples.values.IValue18;
import club.bonerbrew.tuples.values.IValue19;
import club.bonerbrew.tuples.values.IValue20;
import club.bonerbrew.tuples.values.IValue21;
import club.bonerbrew.tuples.values.IValue22;
import club.bonerbrew.tuples.values.IValue23;
import club.bonerbrew.tuples.values.IValue24;
import club.bonerbrew.tuples.values.IValue25;

/**
 * A tuple of 26 elements.
 */
public final class Tuple26 <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10,K11,K12,K13,K14,K15,K16,K17,K18,K19,K20,K21,K22,K23,K24,K25,K26>
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
    IValue13 <K14> ,
    IValue14 <K15> ,
    IValue15 <K16> ,
    IValue16 <K17> ,
    IValue17 <K18> ,
    IValue18 <K19> ,
    IValue19 <K20> ,
    IValue20 <K21> ,
    IValue21 <K22> ,
    IValue22 <K23> ,
    IValue23 <K24> ,
    IValue24 <K25> ,
    IValue25 <K26> {

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
        private final K15 val14;
        private final K16 val15;
        private final K17 val16;
        private final K18 val17;
        private final K19 val18;
        private final K20 val19;
        private final K21 val20;
        private final K22 val21;
        private final K23 val22;
        private final K24 val23;
        private final K25 val24;
        private final K26 val25;

        /**
         * Creates a tuple with 26 elements. Pretty straightforward, isn't it?
         */
        public static <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10,K11,K12,K13,K14,K15,K16,K17,K18,K19,K20,K21,K22,K23,K24,K25,K26> Tuple26 <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10,K11,K12,K13,K14,K15,K16,K17,K18,K19,K20,K21,K22,K23,K24,K25,K26> with(final K1 value0,
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
            final K14 value13,
            final K15 value14,
            final K16 value15,
            final K17 value16,
            final K18 value17,
            final K19 value18,
            final K20 value19,
            final K21 value20,
            final K22 value21,
            final K23 value22,
            final K24 value23,
            final K25 value24,
            final K26 value25) {
            return new Tuple26 <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10,K11,K12,K13,K14,K15,K16,K17,K18,K19,K20,K21,K22,K23,K24,K25,K26> (value0,
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
                    value13,
                    value14,
                    value15,
                    value16,
                    value17,
                    value18,
                    value19,
                    value20,
                    value21,
                    value22,
                    value23,
                    value24,
                    value25);
        }

        /**
         * Creates a tuple with 26 elements. Pretty straightforward, isn't it?
         */
        public static <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10,K11,K12,K13,K14,K15,K16,K17,K18,K19,K20,K21,K22,K23,K24,K25,K26> Tuple26 <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10,K11,K12,K13,K14,K15,K16,K17,K18,K19,K20,K21,K22,K23,K24,K25,K26> of (final K1 value0,
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
            final K14 value13,
            final K15 value14,
            final K16 value15,
            final K17 value16,
            final K18 value17,
            final K19 value18,
            final K20 value19,
            final K21 value20,
            final K22 value21,
            final K23 value22,
            final K24 value23,
            final K25 value24,
            final K26 value25) {
            return new Tuple26 <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10,K11,K12,K13,K14,K15,K16,K17,K18,K19,K20,K21,K22,K23,K24,K25,K26> (value0,
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
                    value13,
                    value14,
                    value15,
                    value16,
                    value17,
                    value18,
                    value19,
                    value20,
                    value21,
                    value22,
                    value23,
                    value24,
                    value25);
        }

        /**
         * Create a tuple from an array. The array has to have exactly 26 elements.
         * 
         * @param <X> the array element type
         * @param array the array to be converted to a tuple
         * @return the tuple
         */
        public static <X> Tuple26 <X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X> fromArray(final X[] array) {
            if(array == null) {
                throw new IllegalArgumentException("Array cannot be null");
            }
            if(array.length != 26) {
                throw new IllegalArgumentException("Array must have exactly 10 elements in order to create a Tuple26. Size is " + array.length);
            }
            return new Tuple26 <X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X> (
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
                array[13],
                array[14],
                array[15],
                array[16],
                array[17],
                array[18],
                array[19],
                array[20],
                array[21],
                array[22],
                array[23],
                array[24],
                array[25]
            );
        }

        /**
         * Create tuple from an iterable. It must have exactly 26 elements or less remaining.
         * 
         * @param <X> the iterable component type 
         * @param iterable the iterable to be converted to a tuple
         * @return the tuple
         */
        public static <X> Tuple26 <X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X> fromIterable(final Iterable <X> iterable) {
            return fromIterable(iterable.iterator());
        }

        private static <X> Tuple26 <X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X> fromIterable(final Iterator <X> iter) {

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
            X element14 = null;
            X element15 = null;
            X element16 = null;
            X element17 = null;
            X element18 = null;
            X element19 = null;
            X element20 = null;
            X element21 = null;
            X element22 = null;
            X element23 = null;
            X element24 = null;
            X element25 = null;

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

            if(iter.hasNext()) {
                element14 = iter.next();
            }

            if(iter.hasNext()) {
                element15 = iter.next();
            }

            if(iter.hasNext()) {
                element16 = iter.next();
            }

            if(iter.hasNext()) {
                element17 = iter.next();
            }

            if(iter.hasNext()) {
                element18 = iter.next();
            }

            if(iter.hasNext()) {
                element19 = iter.next();
            }

            if(iter.hasNext()) {
                element20 = iter.next();
            }

            if(iter.hasNext()) {
                element21 = iter.next();
            }

            if(iter.hasNext()) {
                element22 = iter.next();
            }

            if(iter.hasNext()) {
                element23 = iter.next();
            }

            if(iter.hasNext()) {
                element24 = iter.next();
            }

            if(iter.hasNext()) {
                element25 = iter.next();
            }

            return new Tuple26 <X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X> (
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
                element13,
                element14,
                element15,
                element16,
                element17,
                element18,
                element19,
                element20,
                element21,
                element22,
                element23,
                element24,
                element25
            );
        }

        private Tuple26(
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
            final K14 value13,
            final K15 value14,
            final K16 value15,
            final K17 value16,
            final K18 value17,
            final K19 value18,
            final K20 value19,
            final K21 value20,
            final K22 value21,
            final K23 value22,
            final K24 value23,
            final K25 value24,
            final K26 value25
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
            this.val14 = value14;
            this.val15 = value15;
            this.val16 = value16;
            this.val17 = value17;
            this.val18 = value18;
            this.val19 = value19;
            this.val20 = value20;
            this.val21 = value21;
            this.val22 = value22;
            this.val23 = value23;
            this.val24 = value24;
            this.val25 = value25;
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
         * Gets the value at index 14.
         * @return the value at index 14.
         */
        @Override
        public K15 getValue14() {
            return this.val14;
        }

        /**
         * Gets the value at index 14.
         * @return the value at index 14.
         */
        @Override
        public K15 get14() {
            return this.val14;
        }

        /**
         * Gets the value at index 15.
         * @return the value at index 15.
         */
        @Override
        public K16 getValue15() {
            return this.val15;
        }

        /**
         * Gets the value at index 15.
         * @return the value at index 15.
         */
        @Override
        public K16 get15() {
            return this.val15;
        }

        /**
         * Gets the value at index 16.
         * @return the value at index 16.
         */
        @Override
        public K17 getValue16() {
            return this.val16;
        }

        /**
         * Gets the value at index 16.
         * @return the value at index 16.
         */
        @Override
        public K17 get16() {
            return this.val16;
        }

        /**
         * Gets the value at index 17.
         * @return the value at index 17.
         */
        @Override
        public K18 getValue17() {
            return this.val17;
        }

        /**
         * Gets the value at index 17.
         * @return the value at index 17.
         */
        @Override
        public K18 get17() {
            return this.val17;
        }

        /**
         * Gets the value at index 18.
         * @return the value at index 18.
         */
        @Override
        public K19 getValue18() {
            return this.val18;
        }

        /**
         * Gets the value at index 18.
         * @return the value at index 18.
         */
        @Override
        public K19 get18() {
            return this.val18;
        }

        /**
         * Gets the value at index 19.
         * @return the value at index 19.
         */
        @Override
        public K20 getValue19() {
            return this.val19;
        }

        /**
         * Gets the value at index 19.
         * @return the value at index 19.
         */
        @Override
        public K20 get19() {
            return this.val19;
        }

        /**
         * Gets the value at index 20.
         * @return the value at index 20.
         */
        @Override
        public K21 getValue20() {
            return this.val20;
        }

        /**
         * Gets the value at index 20.
         * @return the value at index 20.
         */
        @Override
        public K21 get20() {
            return this.val20;
        }

        /**
         * Gets the value at index 21.
         * @return the value at index 21.
         */
        @Override
        public K22 getValue21() {
            return this.val21;
        }

        /**
         * Gets the value at index 21.
         * @return the value at index 21.
         */
        @Override
        public K22 get21() {
            return this.val21;
        }

        /**
         * Gets the value at index 22.
         * @return the value at index 22.
         */
        @Override
        public K23 getValue22() {
            return this.val22;
        }

        /**
         * Gets the value at index 22.
         * @return the value at index 22.
         */
        @Override
        public K23 get22() {
            return this.val22;
        }

        /**
         * Gets the value at index 23.
         * @return the value at index 23.
         */
        @Override
        public K24 getValue23() {
            return this.val23;
        }

        /**
         * Gets the value at index 23.
         * @return the value at index 23.
         */
        @Override
        public K24 get23() {
            return this.val23;
        }

        /**
         * Gets the value at index 24.
         * @return the value at index 24.
         */
        @Override
        public K25 getValue24() {
            return this.val24;
        }

        /**
         * Gets the value at index 24.
         * @return the value at index 24.
         */
        @Override
        public K25 get24() {
            return this.val24;
        }

        /**
         * Gets the value at index 25.
         * @return the value at index 25.
         */
        @Override
        public K26 getValue25() {
            return this.val25;
        }

        /**
         * Gets the value at index 25.
         * @return the value at index 25.
         */
        @Override
        public K26 get25() {
            return this.val25;
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
        public K26 getRight() {
            return this.val25;
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
                val13,
                val14,
                val15,
                val16,
                val17,
                val18,
                val19,
                val20,
                val21,
                val22,
                val23,
                val24,
                val25
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
                val13,
                val14,
                val15,
                val16,
                val17,
                val18,
                val19,
                val20,
                val21,
                val22,
                val23,
                val24,
                val25
            };
        }

        /**
         * @return an array representation of this tuple.
         */
        public String toString() {
            return "Tuple26 [" + Arrays.toString(new Object[] {
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
                val13,
                val14,
                val15,
                val16,
                val17,
                val18,
                val19,
                val20,
                val21,
                val22,
                val23,
                val24,
                val25
            }) + "]";
        }

        @Override
        public int getSize() {
            return 26;
        }
    }
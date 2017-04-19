package club.bonerbrew.streams;

import club.bonerbrew.jfunktion.CharBinaryOperator;
import club.bonerbrew.jfunktion.CharConsumer;
import club.bonerbrew.jfunktion.CharFunction;
import club.bonerbrew.jfunktion.CharObjectConsumer;
import club.bonerbrew.jfunktion.CharPredicate;
import club.bonerbrew.jfunktion.CharToBooleanFunction;
import club.bonerbrew.jfunktion.CharToCharFunction;
import club.bonerbrew.jfunktion.CharToDoubleFunction;
import club.bonerbrew.jfunktion.CharToLongFunction;
import club.bonerbrew.jfunktion.OptionalChar;

import java.beans.ConstructorProperties;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

//$blacklist:float$
//$blacklist:double$
//$blacklist:int$
//$blacklist:long$
//$blacklist:boolean$

/**
 * A sequence of primitive char-valued elements supporting sequential and parallel
 * aggregate operations.  This is the {@code char} primitive specialization of
 * {@link Stream}.
 *
 * @author Rafael
 * @since 19/04/2017
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class CharStream implements IntStream {
    private IntStream impl;

    @ConstructorProperties({"impl"})
    private CharStream(IntStream impl) {
        this.impl = impl;
    }

    /**
     * Returns an empty sequential {@code IntStream}.
     *
     * @return an empty sequential stream
     */
    public static CharStream empty() {
        return new CharStream(StreamSupport.intStream(Spliterators.emptyIntSpliterator(), false));
    }

    /**
     * Returns a sequential {@code IntStream} containing a single element.
     *
     * @param t the single element
     * @return a singleton sequential stream
     */
    public static CharStream of(char t) {
        return new CharStream(IntStream.of(t));
    }

    /**
     * Returns a sequential ordered stream whose elements are the specified values.
     *
     * @param values the elements of the new stream
     * @return the new stream
     */
    public static CharStream of(char... values) {
        int l = values.length;
        int[] v = new int[l];
        for (int i = 0; i < l; i++) {
            v[i] = values[i];
        }
        return new CharStream(Arrays.stream(v));
    }

    /**
     * Converts a boxed Stream{@literal <}Character> to an unboxed CharStream.
     *
     * @param values the boxed stream
     * @return the new stream
     */
    public static CharStream of(Stream<Character> values) {
        return new CharStream(values.mapToInt(c -> (int) c));
    }

    /**
     * Converts a boxed Iterable{@literal <}Character> to an unboxed CharStream.
     *
     * @param values the boxed Iterable
     * @return the new stream
     */
    public static CharStream of(Iterable<Character> values) {
        // TODO parallel or nay?
        return new CharStream(StreamSupport.stream(values.spliterator(), true).mapToInt(c -> (int) c));
    }

    /**
     * Returns a stream consisting of the elements of this stream that match
     * the given predicate.
     *
     * <p>This is an <a href="package-summary.html#StreamOps">intermediate
     * operation</a>.
     *
     * @param predicate a <a href="package-summary.html#NonInterference">non-interfering</a>,
     *                  <a href="package-summary.html#Statelessness">stateless</a>
     *                  predicate to apply to each element to determine if it
     *                  should be included
     * @return the new stream
     */
    public CharStream filter(CharToBooleanFunction predicate) {
        return new CharStream(impl.filter(i -> predicate.applyAsBoolean((char) i)));
    }

    /**
     * Returns a stream consisting of the results of applying the given
     * function to the elements of this stream.
     *
     * <p>This is an <a href="package-summary.html#StreamOps">intermediate
     * operation</a>.
     *
     * @param mapper a <a href="package-summary.html#NonInterference">non-interfering</a>,
     *               <a href="package-summary.html#Statelessness">stateless</a>
     *               function to apply to each element
     * @return the new stream
     */
    public CharStream map(CharToCharFunction mapper) {
        return new CharStream(impl.map(i -> mapper.applyAsChar((char) i)));
    }

    /**
     * Returns an object-valued {@code Stream} consisting of the results of
     * applying the given function to the elements of this stream.
     *
     * <p>This is an <a href="package-summary.html#StreamOps">
     *     intermediate operation</a>.
     *
     * @param <U> the element type of the new stream
     * @param mapper a <a href="package-summary.html#NonInterference">non-interfering</a>,
     *               <a href="package-summary.html#Statelessness">stateless</a>
     *               function to apply to each element
     * @return the new stream
     */
    public <U> Stream<U> mapToObj(CharFunction<? extends U> mapper) {
        return impl.mapToObj(i -> mapper.apply((char) i));
    }

    /**
     * Returns a {@code LongStream} consisting of the results of applying the
     * given function to the elements of this stream.
     * <p>
     * <p>This is an <a href="package-summary.html#StreamOps">intermediate
     * operation</a>.
     *
     * @param mapper a <a href="package-summary.html#NonInterference">non-interfering</a>,
     *               <a href="package-summary.html#Statelessness">stateless</a>
     *               function to apply to each element
     * @return the new stream
     */
    public LongStream mapToLong(CharToLongFunction mapper) {
        return impl.mapToLong(i -> mapper.applyAsLong((char) i));
    }

    /**
     * Returns a {@code DoubleStream} consisting of the results of applying the
     * given function to the elements of this stream.
     *
     * <p>This is an <a href="package-summary.html#StreamOps">intermediate
     * operation</a>.
     *
     * @param mapper a <a href="package-summary.html#NonInterference">non-interfering</a>,
     *               <a href="package-summary.html#Statelessness">stateless</a>
     *               function to apply to each element
     * @return the new stream
     */
    public DoubleStream mapToDouble(CharToDoubleFunction mapper) {
        return impl.mapToDouble(i -> mapper.applyAsDouble((char) i));
    }

    /**
     * Returns a stream consisting of the results of replacing each element of
     * this stream with the contents of a mapped stream produced by applying
     * the provided mapping function to each element.  Each mapped stream is
     * {@link java.util.stream.BaseStream#close() closed} after its contents
     * have been placed into this stream.  (If a mapped stream is {@code null}
     * an empty stream is used, instead.)
     *
     * <p>This is an <a href="package-summary.html#StreamOps">intermediate
     * operation</a>.
     *
     * @param mapper a <a href="package-summary.html#NonInterference">non-interfering</a>,
     *               <a href="package-summary.html#Statelessness">stateless</a>
     *               function to apply to each element which produces an
     *               {@code IntStream} of new values
     * @return the new stream
     * @see Stream#flatMap(Function)
     */
    public CharStream flatMap(CharFunction<? extends CharStream> mapper) {
        return new CharStream(impl.flatMap(v -> mapper.apply((char) v)));
    }

    /**
     * Returns a stream consisting of the distinct elements of this stream.
     *
     * <p>This is a <a href="package-summary.html#StreamOps">stateful
     * intermediate operation</a>.
     *
     * @return the new stream
     */
    public CharStream distinct() {
        return new CharStream(impl.distinct());
    }

    /**
     * Returns a stream consisting of the elements of this stream in sorted
     * order.
     *
     * <p>This is a <a href="package-summary.html#StreamOps">stateful
     * intermediate operation</a>.
     *
     * @return the new stream
     */
    public CharStream sorted() {
        return new CharStream(impl.sorted());
    }

    /**
     * Returns a stream consisting of the elements of this stream, additionally
     * performing the provided action on each element as elements are consumed
     * from the resulting stream.
     *
     * <p>This is an <a href="package-summary.html#StreamOps">intermediate
     * operation</a>.
     *
     * <p>For parallel stream pipelines, the action may be called at
     * whatever time and in whatever thread the element is made available by the
     * upstream operation.  If the action modifies shared state,
     * it is responsible for providing the required synchronization.
     *
     * @apiNote This method exists mainly to support debugging, where you want
     * to see the elements as they flow past a certain point in a pipeline:
     * <pre>{@code
     *     IntStream.of(1, 2, 3, 4)
     *         .filter(e -> e > 2)
     *         .peek(e -> System.out.println("Filtered value: " + e))
     *         .map(e -> e * e)
     *         .peek(e -> System.out.println("Mapped value: " + e))
     *         .sum();
     * }</pre>
     *
     * @param action a <a href="package-summary.html#NonInterference">
     *               non-interfering</a> action to perform on the elements as
     *               they are consumed from the stream
     * @return the new stream
     */
    public CharStream peek(CharConsumer action) {
        return new CharStream(impl.peek(i -> action.apply((char) i)));
    }

    /**
     * Returns a stream consisting of the elements of this stream, truncated
     * to be no longer than {@code maxSize} in length.
     * <p>
     * <p>This is a <a href="package-summary.html#StreamOps">short-circuiting
     * stateful intermediate operation</a>.
     *
     * @param maxSize the number of elements the stream should be limited to
     * @return the new stream
     * @throws IllegalArgumentException if {@code maxSize} is negative
     * @apiNote While {@code limit()} is generally a cheap operation on sequential
     * stream pipelines, it can be quite expensive on ordered parallel pipelines,
     * especially for large values of {@code maxSize}, since {@code limit(n)}
     * is constrained to return not just any <em>n</em> elements, but the
     * <em>first n</em> elements in the encounter order.  Using an unordered
     * stream source (such as {@link #generate(IntSupplier)}) or removing the
     * ordering constraint with {@link #unordered()} may result in significant
     * speedups of {@code limit()} in parallel pipelines, if the semantics of
     * your situation permit.  If consistency with encounter order is required,
     * and you are experiencing poor performance or memory utilization with
     * {@code limit()} in parallel pipelines, switching to sequential execution
     * with {@link #sequential()} may improve performance.
     */
    public CharStream limit(long maxSize) {
        return new CharStream(impl.limit(maxSize));
    }

    /**
     * Performs an action for each element of this stream.
     *
     * <p>This is a <a href="package-summary.html#StreamOps">terminal
     * operation</a>.
     *
     * <p>For parallel stream pipelines, this operation does <em>not</em>
     * guarantee to respect the encounter order of the stream, as doing so
     * would sacrifice the benefit of parallelism.  For any given element, the
     * action may be performed at whatever time and in whatever thread the
     * library chooses.  If the action accesses shared state, it is
     * responsible for providing the required synchronization.
     *
     * @param action a <a href="package-summary.html#NonInterference">
     *               non-interfering</a> action to perform on the elements
     */
    public void forEach(CharConsumer action) {
        impl.forEach(i -> action.apply((char) i));
    }

    /**
     * Performs an action for each element of this stream, guaranteeing that
     * each element is processed in encounter order for streams that have a
     * defined encounter order.
     * <p>
     * <p>This is a <a href="package-summary.html#StreamOps">terminal
     * operation</a>.
     *
     * @param action a <a href="package-summary.html#NonInterference">
     *               non-interfering</a> action to perform on the elements
     * @see #forEach(IntConsumer)
     */
    public void forEachOrdered(CharConsumer action) {
        impl.forEachOrdered(i -> action.apply((char) i));
    }

    /**
     * Returns an array containing the elements of this stream.
     * <p>
     * <p>This is a <a href="package-summary.html#StreamOps">terminal
     * operation</a>.
     *
     * @return an array containing the elements of this stream
     */
    public char[] toCharArray() {
        int[] i = toArray();
        int l = i.length;
        char[] c = new char[l];
        for (int j = 0; j < l; j++) {
            c[j] = (char) i[j];
        }
        return c;
    }

    /**
     * Performs a <a href="package-summary.html#Reduction">reduction</a> on the
     * elements of this stream, using the provided identity value and an
     * <a href="package-summary.html#Associativity">associative</a>
     * accumulation function, and returns the reduced value.  This is equivalent
     * to:
     * <pre>{@code
     *     int result = identity;
     *     for (int element : this stream)
     *         result = accumulator.applyAsInt(result, element)
     *     return result;
     * }</pre>
     *
     * but is not constrained to execute sequentially.
     *
     * <p>The {@code identity} value must be an identity for the accumulator
     * function. This means that for all {@code x},
     * {@code accumulator.apply(identity, x)} is equal to {@code x}.
     * The {@code accumulator} function must be an
     * <a href="package-summary.html#Associativity">associative</a> function.
     *
     * <p>This is a <a href="package-summary.html#StreamOps">terminal
     * operation</a>.
     *
     * @apiNote Sum, min, max, and average are all special cases of reduction.
     * Summing a stream of numbers can be expressed as:
     *
     * <pre>{@code
     *     int sum = integers.reduce(0, (a, b) -> a+b);
     * }</pre>
     *
     * or more compactly:
     *
     * <pre>{@code
     *     int sum = integers.reduce(0, Integer::sum);
     * }</pre>
     *
     * <p>While this may seem a more roundabout way to perform an aggregation
     * compared to simply mutating a running total in a loop, reduction
     * operations parallelize more gracefully, without needing additional
     * synchronization and with greatly reduced risk of data races.
     *
     * @param identity the identity value for the accumulating function
     * @param op an <a href="package-summary.html#Associativity">associative</a>,
     *           <a href="package-summary.html#NonInterference">non-interfering</a>,
     *           <a href="package-summary.html#Statelessness">stateless</a>
     *           function for combining two values
     * @return the result of the reduction
     * @see #sum()
     * @see #min()
     * @see #max()
     * @see #average()
     */
    public int reduce(char identity, CharBinaryOperator op) {
        return impl.reduce(identity, (a, b) -> op.applyAsChar((char) a, (char) b));
    }

    /**
     * Performs a <a href="package-summary.html#Reduction">reduction</a> on the
     * elements of this stream, using an
     * <a href="package-summary.html#Associativity">associative</a> accumulation
     * function, and returns an {@code OptionalInt} describing the reduced value,
     * if any. This is equivalent to:
     * <pre>{@code
     *     boolean foundAny = false;
     *     int result = null;
     *     for (int element : this stream) {
     *         if (!foundAny) {
     *             foundAny = true;
     *             result = element;
     *         }
     *         else
     *             result = accumulator.applyAsInt(result, element);
     *     }
     *     return foundAny ? OptionalInt.of(result) : OptionalInt.empty();
     * }</pre>
     *
     * but is not constrained to execute sequentially.
     *
     * <p>The {@code accumulator} function must be an
     * <a href="package-summary.html#Associativity">associative</a> function.
     *
     * <p>This is a <a href="package-summary.html#StreamOps">terminal
     * operation</a>.
     *
     * @param op an <a href="package-summary.html#Associativity">associative</a>,
     *           <a href="package-summary.html#NonInterference">non-interfering</a>,
     *           <a href="package-summary.html#Statelessness">stateless</a>
     *           function for combining two values
     * @return the result of the reduction
     * @see #reduce(char, CharBinaryOperator)
     */
    public OptionalChar reduce(CharBinaryOperator op) {
        OptionalInt i = impl.reduce((a, b) -> op.applyAsChar((char) a, (char) b));
        return i.isPresent() ? OptionalChar.of((char)i.getAsInt()) : OptionalChar.empty();
    }

    /**
     * Performs a <a href="package-summary.html#MutableReduction">mutable
     * reduction</a> operation on the elements of this stream.  A mutable
     * reduction is one in which the reduced value is a mutable result container,
     * such as an {@code ArrayList}, and elements are incorporated by updating
     * the state of the result rather than by replacing the result.  This
     * produces a result equivalent to:
     * <pre>{@code
     *     R result = supplier.get();
     *     for (int element : this stream)
     *         accumulator.accept(result, element);
     *     return result;
     * }</pre>
     *
     * <p>Like {@link #reduce(int, IntBinaryOperator)}, {@code collect} operations
     * can be parallelized without requiring additional synchronization.
     *
     * <p>This is a <a href="package-summary.html#StreamOps">terminal
     * operation</a>.
     *
     * @param <R> type of the result
     * @param supplier a function that creates a new result container. For a
     *                 parallel execution, this function may be called
     *                 multiple times and must return a fresh value each time.
     * @param accumulator an <a href="package-summary.html#Associativity">associative</a>,
     *                    <a href="package-summary.html#NonInterference">non-interfering</a>,
     *                    <a href="package-summary.html#Statelessness">stateless</a>
     *                    function for incorporating an additional element into a result
     * @param combiner an <a href="package-summary.html#Associativity">associative</a>,
     *                    <a href="package-summary.html#NonInterference">non-interfering</a>,
     *                    <a href="package-summary.html#Statelessness">stateless</a>
     *                    function for combining two values, which must be
     *                    compatible with the accumulator function
     * @return the result of the reduction
     * @see Stream#collect(Supplier, BiConsumer, BiConsumer)
     */
    public <R> R collect(Supplier<R> supplier,
                  CharObjectConsumer<R> accumulator,
                  BiConsumer<R, R> combiner) {
        return impl.collect(supplier, (a, b) -> accumulator.apply((char) b, a), combiner);
    }

    /**
     * Returns an {@code OptionalInt} describing the minimum element of this
     * stream, or an empty optional if this stream is empty.  This is a special
     * case of a <a href="package-summary.html#Reduction">reduction</a>
     * and is equivalent to:
     * <pre>{@code
     *     return reduce(Integer::min);
     * }</pre>
     *
     * <p>This is a <a href="package-summary.html#StreamOps">terminal operation</a>.
     *
     * @return an {@code OptionalInt} containing the minimum element of this
     * stream, or an empty {@code OptionalInt} if the stream is empty
     */
    public OptionalChar minChar() {
        OptionalInt i = impl.min();
        return i.isPresent() ? OptionalChar.of((char)i.getAsInt()) : OptionalChar.empty();
    }

    /**
     * Returns an {@code OptionalInt} describing the maximum element of this
     * stream, or an empty optional if this stream is empty.  This is a special
     * case of a <a href="package-summary.html#Reduction">reduction</a>
     * and is equivalent to:
     * <pre>{@code
     *     return reduce(Integer::max);
     * }</pre>
     *
     * <p>This is a <a href="package-summary.html#StreamOps">terminal
     * operation</a>.
     *
     * @return an {@code OptionalInt} containing the maximum element of this
     * stream, or an empty {@code OptionalInt} if the stream is empty
     */
    public OptionalChar maxChar() {
        OptionalInt i = impl.max();
        return i.isPresent() ? OptionalChar.of((char)i.getAsInt()) : OptionalChar.empty();
    }

    /**
     * Returns whether any elements of this stream match the provided
     * predicate.  May not evaluate the predicate on all elements if not
     * necessary for determining the result.  If the stream is empty then
     * {@code false} is returned and the predicate is not evaluated.
     *
     * <p>This is a <a href="package-summary.html#StreamOps">short-circuiting
     * terminal operation</a>.
     *
     * @apiNote
     * This method evaluates the <em>existential quantification</em> of the
     * predicate over the elements of the stream (for some x P(x)).
     *
     * @param predicate a <a href="package-summary.html#NonInterference">non-interfering</a>,
     *                  <a href="package-summary.html#Statelessness">stateless</a>
     *                  predicate to apply to elements of this stream
     * @return {@code true} if any elements of the stream match the provided
     * predicate, otherwise {@code false}
     */
    public boolean anyMatch(CharPredicate predicate) {
        return impl.anyMatch(p -> predicate.test((char) p));
    }

    /**
     * Returns whether all elements of this stream match the provided predicate.
     * May not evaluate the predicate on all elements if not necessary for
     * determining the result.  If the stream is empty then {@code true} is
     * returned and the predicate is not evaluated.
     *
     * <p>This is a <a href="package-summary.html#StreamOps">short-circuiting
     * terminal operation</a>.
     *
     * @apiNote
     * This method evaluates the <em>universal quantification</em> of the
     * predicate over the elements of the stream (for all x P(x)).  If the
     * stream is empty, the quantification is said to be <em>vacuously
     * satisfied</em> and is always {@code true} (regardless of P(x)).
     *
     * @param predicate a <a href="package-summary.html#NonInterference">non-interfering</a>,
     *                  <a href="package-summary.html#Statelessness">stateless</a>
     *                  predicate to apply to elements of this stream
     * @return {@code true} if either all elements of the stream match the
     * provided predicate or the stream is empty, otherwise {@code false}
     */
    public boolean allMatch(CharPredicate predicate) {
        return impl.allMatch(p -> predicate.test((char) p));
    }

    /**
     * Returns whether no elements of this stream match the provided predicate.
     * May not evaluate the predicate on all elements if not necessary for
     * determining the result.  If the stream is empty then {@code true} is
     * returned and the predicate is not evaluated.
     *
     * <p>This is a <a href="package-summary.html#StreamOps">short-circuiting
     * terminal operation</a>.
     *
     * @apiNote
     * This method evaluates the <em>universal quantification</em> of the
     * negated predicate over the elements of the stream (for all x ~P(x)).  If
     * the stream is empty, the quantification is said to be vacuously satisfied
     * and is always {@code true}, regardless of P(x).
     *
     * @param predicate a <a href="package-summary.html#NonInterference">non-interfering</a>,
     *                  <a href="package-summary.html#Statelessness">stateless</a>
     *                  predicate to apply to elements of this stream
     * @return {@code true} if either no elements of the stream match the
     * provided predicate or the stream is empty, otherwise {@code false}
     */
    public boolean noneMatch(CharPredicate predicate) {
        return impl.noneMatch(p -> predicate.test((char) p));
    }

    /**
     * Returns an {@link OptionalInt} describing the first element of this
     * stream, or an empty {@code OptionalInt} if the stream is empty.  If the
     * stream has no encounter order, then any element may be returned.
     *
     * <p>This is a <a href="package-summary.html#StreamOps">short-circuiting
     * terminal operation</a>.
     *
     * @return an {@code OptionalInt} describing the first element of this stream,
     * or an empty {@code OptionalInt} if the stream is empty
     */
    public OptionalChar findFirstChar() {
        OptionalInt i = impl.findFirst();
        return i.isPresent() ? OptionalChar.of((char)i.getAsInt()) : OptionalChar.empty();
    }

    /**
     * Returns an {@link OptionalInt} describing some element of the stream, or
     * an empty {@code OptionalInt} if the stream is empty.
     *
     * <p>This is a <a href="package-summary.html#StreamOps">short-circuiting
     * terminal operation</a>.
     *
     * <p>The behavior of this operation is explicitly nondeterministic; it is
     * free to select any element in the stream.  This is to allow for maximal
     * performance in parallel operations; the cost is that multiple invocations
     * on the same source may not return the same result.  (If a stable result
     * is desired, use {@link #findFirst()} instead.)
     *
     * @return an {@code OptionalInt} describing some element of this stream, or
     * an empty {@code OptionalInt} if the stream is empty
     * @see #findFirst()
     */
    public OptionalChar findAnyChar() {
        OptionalInt i = impl.findAny();
        return i.isPresent() ? OptionalChar.of((char)i.getAsInt()) : OptionalChar.empty();
    }

    /**
     * Returns a {@code Stream} consisting of the elements of this stream,
     * each boxed to an {@code Integer}.
     *
     * <p>This is an <a href="package-summary.html#StreamOps">intermediate
     * operation</a>.
     *
     * @return a {@code Stream} consistent of the elements of this stream,
     * each boxed to an {@code Integer}
     */
    public Stream<Character> boxedChars() {
        return impl.mapToObj(i -> (char) i);
    }

    public CharStream sequential() {
        return new CharStream(impl.sequential());
    }

    public CharStream parallel() {
        return new CharStream(impl.parallel());
    }

//    PrimitiveIterator.OfInt iterator();

//    Spliterator.OfInt spliterator();

    // delegate

    public LongStream mapToLong(IntToLongFunction mapper) {
        return this.impl.mapToLong(mapper);
    }

    public DoubleStream mapToDouble(IntToDoubleFunction mapper) {
        return this.impl.mapToDouble(mapper);
    }

    public IntStream flatMap(IntFunction<? extends IntStream> mapper) {
        return this.impl.flatMap(mapper);
    }

    public <R> R collect(Supplier<R> supplier, ObjIntConsumer<R> accumulator, BiConsumer<R, R> combiner) {
        return this.impl.collect(supplier, accumulator, combiner);
    }

    public <U> Stream<U> mapToObj(IntFunction<? extends U> mapper) {
        return this.impl.mapToObj(mapper);
    }

    public int sum() {
        return this.impl.sum();
    }

    public OptionalInt reduce(IntBinaryOperator op) {
        return this.impl.reduce(op);
    }

    public IntStream map(IntUnaryOperator mapper) {
        return this.impl.map(mapper);
    }

    public OptionalDouble average() {
        return this.impl.average();
    }

    public boolean anyMatch(IntPredicate predicate) {
        return this.impl.anyMatch(predicate);
    }

    public PrimitiveIterator.OfInt iterator() {
        return this.impl.iterator();
    }

    public OptionalInt findAny() {
        return this.impl.findAny();
    }

    public CharStream onClose(Runnable closeHandler) {
        return new CharStream(this.impl.onClose(closeHandler));
    }

    public IntStream peek(IntConsumer action) {
        return this.impl.peek(action);
    }

    public OptionalInt min() {
        return this.impl.min();
    }

    public long count() {
        return this.impl.count();
    }

    public DoubleStream asDoubleStream() {
        return this.impl.asDoubleStream();
    }

    public boolean isParallel() {
        return this.impl.isParallel();
    }

    public OptionalInt max() {
        return this.impl.max();
    }

    public OptionalInt findFirst() {
        return this.impl.findFirst();
    }

    public Stream<Integer> boxed() {
        return this.impl.boxed();
    }

//    public IntStream distinct() {
//        return this.impl.distinct();
//    }

    public Spliterator.OfInt spliterator() {
        return this.impl.spliterator();
    }

    public void close() {
        this.impl.close();
    }

    public IntStream filter(IntPredicate predicate) {
        return this.impl.filter(predicate);
    }

//    public IntStream sorted() {
//        return this.impl.sorted();
//    }

    public boolean noneMatch(IntPredicate predicate) {
        return this.impl.noneMatch(predicate);
    }

    public LongStream asLongStream() {
        return this.impl.asLongStream();
    }

    public CharStream skip(long n) {
        return new CharStream(this.impl.skip(n));
    }

    public void forEachOrdered(IntConsumer action) {
        this.impl.forEachOrdered(action);
    }

    public void forEach(IntConsumer action) {
        this.impl.forEach(action);
    }

    public int[] toArray() {
        return this.impl.toArray();
    }

//    public CharStream parallel() {
//        return new CharStream(this.impl.parallel());
//    }

    public IntSummaryStatistics summaryStatistics() {
        return this.impl.summaryStatistics();
    }

    public CharStream unordered() {
        return new CharStream(this.impl.unordered());
    }

    public boolean allMatch(IntPredicate predicate) {
        return this.impl.allMatch(predicate);
    }

//    public CharStream sequential() {
//        return new CharStream(this.impl.sequential());
//    }

    public int reduce(int identity, IntBinaryOperator op) {
        return this.impl.reduce(identity, op);
    }
}

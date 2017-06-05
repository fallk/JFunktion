// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.jfunktion;

import java.util.stream.Collector;

/**
 * A state object for collecting statistics such as count, min, max, sum, and
 * average.
 *
 * <p>This class is designed to work with (though does not require)
 * {@linkplain java.util.stream streams}. For example, you can compute
 * summary statistics on a stream of ints with:
 * <pre> {@code
 * $primitiveFmt$SummaryStatistics stats = intStream.collect($primitiveFmt$SummaryStatistics::new,
 *                                                $primitiveFmt$SummaryStatistics::accept,
 *                                                $primitiveFmt$SummaryStatistics::combine);
 * }</pre>
 *
 * <p>{@code $primitiveFmt$SummaryStatistics} can be used as a
 * {@linkplain java.util.stream.Stream#collect(Collector) reduction}
 * target for a {@linkplain java.util.stream.Stream stream}. For example:
 *
 * <pre> {@code
 * $primitiveFmt$SummaryStatistics stats = people.stream()
 *                                    .collect(Collectors.summarizingInt(Person::getDependents));
 *}</pre>
 *
 * This computes, in a single pass, the count of people, as well as the minimum,
 * maximum, sum, and average of their number of dependents.
 *
 * @implNote This implementation is not thread safe. However, it is safe to use
 * {@link java.util.stream.Collectors#summarizingInt(java.util.function.ToIntFunction)
 * Collectors.toIntStatistics()} on a parallel stream, because the parallel
 * implementation of {@link java.util.stream.Stream#collect Stream.collect()}
 * provides the necessary partitioning, isolation, and merging of results for
 * safe and efficient parallel execution.
 *
 * <p>This implementation does not check for overflow of the sum.
 * @since 1.8
 */
public class $primitiveFmt$SummaryStatistics implements $primitiveFmt$Consumer {
    private long count;
    private long sum;
    private $primitive$ min = ($primitive$) Long.MAX_VALUE;
    private $primitive$ max = ($primitive$) Long.MIN_VALUE;

    /**
     * Construct an empty instance with zero count, zero sum,
     * {@code Integer.MAX_VALUE} min, {@code Integer.MIN_VALUE} max and zero
     * average.
     */
    public $primitiveFmt$SummaryStatistics() { }

    /**
     * Records a new value into the summary information
     *
     * @param value the input value
     */
    @Override
    public void accept($primitive$ value) {
        ++count;
        sum += value;
        min = Math.min(min, value);
        max = Math.max(max, value);
    }

    /**
     * Combines the state of another {@code $primitiveFmt$SummaryStatistics} into this one.
     *
     * @param other another {@code $primitiveFmt$SummaryStatistics}
     * @throws NullPointerException if {@code other} is null
     */
    public void combine($primitiveFmt$SummaryStatistics other) {
        count += other.count;
        sum += other.sum;
        min = ($primitive$) Math.min(min, other.min);
        max = ($primitive$) Math.max(max, other.max);
    }

    /**
     * Returns the count of values recorded.
     *
     * @return the count of values
     */
    public final long getCount() {
        return count;
    }

    /**
     * Returns the sum of values recorded, or zero if no values have been
     * recorded.
     *
     * @return the sum of values, or zero if none
     */
    public final long getSum() {
        return sum;
    }

    /**
     * Returns the minimum value recorded, or {@code Integer.MAX_VALUE} if no
     * values have been recorded.
     *
     * @return the minimum value, or {@code Integer.MAX_VALUE} if none
     */
    public final $primitive$ getMin() {
        return min;
    }

    /**
     * Returns the maximum value recorded, or {@code Integer.MIN_VALUE} if no
     * values have been recorded.
     *
     * @return the maximum value, or {@code Integer.MIN_VALUE} if none
     */
    public final $primitive$ getMax() {
        return max;
    }

    /**
     * Returns the arithmetic mean of values recorded, or zero if no values have been
     * recorded.
     *
     * @return the arithmetic mean of values, or zero if none
     */
    public final double getAverage() {
        return getCount() > 0 ? (double) getSum() / getCount() : 0.0d;
    }

    @Override
    /**
     * {@inheritDoc}
     *
     * Returns a non-empty string representation of this object suitable for
     * debugging. The exact presentation format is unspecified and may vary
     * between implementations and versions.
     */
    public String toString() {
        return String.format(
                "%s{count=%d, sum=%d, min=%d, average=%f, max=%d}",
                this.getClass().getSimpleName(),
                getCount(),
                getSum(),
                getMin(),
                getAverage(),
                getMax());
    }
}

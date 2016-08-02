package range;

/**
 * Created by y.bibik on 01.08.2016.
 */
public class Range<T extends Number> {

    private final T range;

    public Range(T range) {
        this.range = range;
    }

    public Range() {
        range = null;
    }

    public T getRange() {
        return range;
    }

    @Override
    public String toString() {
        return "Range{" +
                "range=" + range +
                '}';
    }
}

package range;

import pair.Pair;

/**
 * Created by y.bibik on 01.08.2016.
 */
public class Range<T extends Number> {

    private T range;
   // private Pair<Integer, Long> pair = new Pair<>(right, right);

    public Range(T range) {
        this.range = range;
    }

    public Range() {
    }

    public T getRange() {
        return range;
    }

    @Override
    public String toString() {
        return "Range{" +
                "range=" + range +
                ", pair=" + //pair +
                '}';
    }
}

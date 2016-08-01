package range;

import pair.Pair;

/**
 * Created by y.bibik on 01.08.2016.
 */
public class Range<T extends Number> {

    private T range;
    private Pair<Integer, Long> pair = new Pair<>();

    public Range(T range) {
        RangeChecker(pair);
        this.range = range;
    }

    public Range() {
        RangeChecker(pair);
    }

    public T getRange() {
        return range;
    }

    private static void RangeChecker(Pair pair) {
        if ((Integer)pair.getLeft() < (Long)pair.getRight()) {
            throw new IllegalArgumentException("Не корректное значение диапазона");
        }
    }

    @Override
    public String toString() {
        return "Range{" +
                "range=" + range +
                ", pair=" + pair +
                '}';
    }
}

package range;

import pair.Pair;

/**
 * Created by y.bibik on 01.08.2016.
 */
public class RangeRunner {

    public static void main(String[] args) {

        System.out.println(createRange(new Pair<Integer, Long>(10, (long) 20)));

    }

    static Range createRange(Pair pair) {
        Range range = new Range<>((Long)pair.getRight() - (Integer)pair.getLeft());
        return range;
    }
}

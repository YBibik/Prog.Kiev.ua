package range;

import pair.Pair;

/**
 * Created by y.bibik on 01.08.2016.
 */
public class RangeRunner {

    public static void main(String[] args) {

        Pair<Integer, Long> pair = new Pair<>(10, (long) 20);
        System.out.println(pair);

        //System.out.println(createRange(pair));
        Integer i = 10;
        Integer y = 20;
        System.out.println(i.compareTo(y));

    }

    static Range createRange(Pair pair) {
        Range range = new Range<Number>((Long)pair.getRight() - (Integer)pair.getLeft());
        return range;
    }
}

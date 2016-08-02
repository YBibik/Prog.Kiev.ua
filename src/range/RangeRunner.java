package range;

/**
 * Created by y.bibik on 01.08.2016.
 */
public class RangeRunner {

    public static void main(String[] args) {

        int left = 10;
        long right = 15;

        Pair<Integer, Long> pair = new Pair<>(left, right);
        rangeChecker(pair);
        Range<Integer> intrange = new Range<>(calcRange(pair));
        Range<Long> longrange = new Range<>((long) calcRange(pair));

        System.out.println("left value: " + pair.getLeft());
        System.out.println("right value: " + pair.getRight());
        System.out.println("Range Integer value: " + intrange.getRange());
        System.out.println("Range Long value: " + longrange.getRange());
    }

    private static void rangeChecker(Pair<Integer, Long> pair) {
        if (pair.getRight() - pair.getLeft() < 0) {
            throw new IllegalArgumentException("Incorrect pair value, left value can`t be greater then right");
        }
    }
    private static int calcRange(Pair<Integer, Long> pair) {
        return (int) (pair.getRight() - pair.getLeft());
    }
}

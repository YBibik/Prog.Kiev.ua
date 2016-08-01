package pair;

/**
 * Created by y.bibik on 01.08.2016.
 */
public class PairRunner {

    public static void main(String[] args) {
        int x = 10;
        long y = 20;

        Pair<Integer, Long> pair = new Pair<>(x, y);

        System.out.println("left value: " + pair.getLeft());
        System.out.println("right value: " + pair.getRight());
    }
}

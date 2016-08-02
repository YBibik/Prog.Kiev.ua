package range;

/**
 * Created by y.bibik on 02.08.2016.
 */
public class Pair<L, R> {

    private final L left;
    private final R right;

    public Pair(L left, R right) {

        this.left = left;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}

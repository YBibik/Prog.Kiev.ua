package Immutable;

/**
 * Created by y.bibik on 04.07.2016.
 */
public class Point {

    private final int x;
    private final int y;

    //constructor
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    //getters
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

package Immutable;

/**
 * Created by y.bibik on 04.07.2016.
 */
public class Point {

    private int x;
    private int y;

    //constructor
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    //getters && setters

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }
}

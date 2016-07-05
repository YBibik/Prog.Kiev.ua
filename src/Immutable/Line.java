package Immutable;

/**
 * Created by y.bibik on 04.07.2016.
 */
public class Line {

    private final Point start;
    private final Point end;

    //Constructor
    public Line(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }

    // getters

    public Point getStart() {
        return this.start;
    }

    public Point getEnd() {
        return this.end;
    }
}

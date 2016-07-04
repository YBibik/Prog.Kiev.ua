package Immutable;

/**
 * Created by y.bibik on 04.07.2016.
 */
public class Line {

    private Point start;
    private Point end;

    //Constructor
    public Line(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }

    // getters && setters

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getStart() {
        return this.start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Point getEnd() {
        return this.end;
    }
}

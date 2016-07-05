package Immutable;


import java.util.*;

/**
 * Created by y.bibik on 04.07.2016.
 */
public class LineAction {

    public static List<Line> createLineList()
    {
        List<Line> vlinelist = new ArrayList<Line>();
        vlinelist.add(new Line(new Point(1, 23), new Point(2, 5)));
        vlinelist.add(new Line(new Point(-7, -15), new Point(3, 11)));
        vlinelist.add(new Line(new Point(-1, 10), new Point(2, 15)));

        return vlinelist;
    }

    public static double getLineLength(List<Line> list, int pos)
    {
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        double length = 0;

            x1 = list.get(pos).getStart().getX();
            y1 = list.get(pos).getStart().getY();
            x2 = list.get(pos).getEnd().getX();
            y2 = list.get(pos).getEnd().getY();

            length = Math.hypot((x2 - x1), (y2 - y1));

        return length;
    }

    public static double getLongestLine(List<Line> list)
    {
        List<Double> linelength = new ArrayList<Double>();

        for (int i = 0; i < list.size(); i++)
        {
            linelength.add(getLineLength(list, i));
        }
        return Collections.max(linelength);
    }
}
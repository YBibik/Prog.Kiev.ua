package Immutable;


import java.util.*;

/**
 * Created by y.bibik on 04.07.2016.
 */
public class LineAction {

    public static void main(String[] args)
    {


        System.out.println(GetLineLength(CreateLineList()));

    }

    public static ArrayList<Line> CreateLineList()
    {
        ArrayList<Line> vlinelist = new ArrayList<Line>();
        vlinelist.add(new Line(new Point(1, 10), new Point(2, 15)));
        vlinelist.add(new Line(new Point(7, 15), new Point(3, 11)));
        vlinelist.add(new Line(new Point(-1, 10), new Point(2, 15)));

        return vlinelist;
    }

    public static double GetLineLength(ArrayList<Line> list)
    {
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        double length = 0;

        for (int i = 0; i < list.size(); i++)
        {
            x1 = list.get(i).getStart().getX();
            y1 = list.get(i).getStart().getY();
            x2 = list.get(i).getEnd().getX();
            y2 = list.get(i).getEnd().getY();

            length = Math.hypot((x2 - x1), (y2 - y1));

            System.out.println(x1 +"  "+ y1 +"  "+ x2 +"  "+ y2);
        }

        return length;
    }

    public static double GetLongestLine(ArrayList<Line> list)
    {
        ArrayList<Double> linelength = new ArrayList<Double>();
        for (int i = 0; i < list.size(); i++)
        {
            linelength.add(GetLineLength(list));
        }

        return Collections.
    }
}

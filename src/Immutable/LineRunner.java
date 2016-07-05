package Immutable;

import java.util.List;

/**
 * Created by y.bibik on 05.07.2016.
 */
public class LineRunner {

    public static void main(String[] args) {

        List<Line> list = LineAction.createLineList();
        double longestline = LineAction.getLongestLine(list);
        double linesum = LineAction.getLineSumLength(list);

        System.out.println("Суммарный размер всех линий: " + linesum);
        System.out.println("Размер самой длинной линии: " + longestline);

    }
}
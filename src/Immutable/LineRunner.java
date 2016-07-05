package Immutable;

/**
 * Created by y.bibik on 05.07.2016.
 */
public class LineRunner {

    public static void main(String[] args) {

        double longestline = LineAction.getLongestLine(LineAction.createLineList());

        System.out.println(longestline);

    }
}

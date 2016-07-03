package BlinovB4;

import java.io.*;

/**
 * Created by Y.Bibik on 03.07.2016.
 */
public class BlinovB4 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            int num = Integer.parseInt(reader.readLine());
            System.out.println(GetMonthName(num));
        }
        catch (NumberFormatException w)
        {
            System.out.println("Введенное значение не является числом");
        }

    }

    public static String GetMonthName(int num)
    {
        String result = "";
        String[] months = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };


        try
        {
            result = months[num - 1];
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            result = "Месяца номер " +num+ " не существует";
        }

        return result;
    }

}

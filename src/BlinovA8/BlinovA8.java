package BlinovA8;

import java.io.*;

/**
 * Created by Y.Bibik on 03.07.2016.
 */
public class BlinovA8 {

    public static void main(String[] args) throws Exception
    {
        int result = GetPalindrom(CreateArr());
        //Вывод на экран не указан в задании, если нужно, то раскомментарить строку ниже.
        System.out.println(result);
    }

    public static int[] CreateArr() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numcnt = Integer.parseInt(reader.readLine());
        int[] arr = new int[numcnt];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        return arr;
    }

    public static int GetPalindrom(int[] arr)
    {
        int pos = 0;
        int palindrom = 0;
        for (int r : arr)
        {
            if (String.valueOf(r).toString().equals(new StringBuilder(String.valueOf(r)).reverse().toString()))
            {
                pos++;
                if (pos <= 2)
                {
                    palindrom = r;
                }
            }

        }
        return palindrom;
    }

}

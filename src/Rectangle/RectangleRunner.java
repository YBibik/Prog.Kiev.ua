package Rectangle;

import java.io.*;
import java.util.*;

/**
 * Created by Администратор on 03.07.2016.
 */
public class RectangleRunner {

    public static void main(String[] args) throws IOException
    {
        ArrayList<Rectangle> rec = CreateRectangle();
        int totalarea = 0;

        // Считаем суммарную плащадь
        // Вызов метода GetPerimeter не выполнял т.к. не требуется в условии задания
        for (int i = 0; i < rec.size(); i++)
        {
            totalarea += Rectangle.GetArea(rec.get(i).height, rec.get(i).width);
        }

        System.out.println("Суммарная площадь равна " +totalarea);

    }

    public static ArrayList<Rectangle> CreateRectangle() throws IOException
    {
        ArrayList<Rectangle> list = new ArrayList<Rectangle>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int reccnt = 0;
        int inputheight = 0;
        int inputwidth = 0;

        try
        {
            System.out.print("Введите количество прямоугольников: ");
            reccnt = Integer.parseInt(reader.readLine());
            // Проверяем, чтобы количество и размер сторн были не отриц. и не равны нулю
            if (reccnt > 0)
            {
                for (int i = 0; i < reccnt; i++)
                {
                    System.out.print("Введите высоту прямоугольника " +(i + 1)+ ": ");
                    inputheight = Integer.parseInt(reader.readLine());
                    System.out.print("Введите ширину прямоугольника " +(i + 1)+ ": ");
                    inputwidth = Integer.parseInt(reader.readLine());

                    if (inputheight > 0 && inputwidth > 0)
                    {
                        list.add(new Rectangle(inputheight, inputwidth));
                    } else
                    {
                        System.out.println("Задано не корректное значение сторон");
                    }
                }
            }
            else
            {
                System.out.println("Количество прямоугольников должно быть больше нуля");
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Введенное значение не является числом");
        }
        return list;
    }
}

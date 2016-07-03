package Rectangle;

/**
 * Created by Y.Bibik on 03.07.2016.
 */
public class Rectangle {
    int height;
    int width;
    // constructor
    Rectangle(int height, int width)
    {
        this.height = height;
        this.width = width;
    }

    public static int GetPerimeter(int height, int width)
    {
        return 2 * (height + width);
    }

    public static int GetArea(int height, int width)
    {
        return height * width;
    }

}

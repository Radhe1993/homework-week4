package carpet;

// 1. Write a class with the name Floor. The class needs two fields (instance variables) with name width
//and length of type double.

public class Floor {
    double width, length;

    public Floor(double width, double length)
    {
        this.width = width;
        this.length = length;
        if(width<0)
        {
            width=0;
        }
        if (length<0)
        {
            length=0;
        }
    }
    public double getArea()
    {
       double area;
       area = width*length;
       return area;
    }
}

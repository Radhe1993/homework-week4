package cylinder;

// Write a class with the name Circle. The class needs one field (instance variable) with name radius
//   of type double.
//    The class needs to have one constructor with parameter radius of type double and it needs to initialize

public class Circle
{
    double radius;
    public Circle(double radius)
    {
        this.radius = radius;
        if(radius<0)
        {
            radius=0;
        }
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        double area = 3.14*radius*radius;
        return area;
    }


}

package cylinder;
//2. Write a class with the name Cylinder that extends Circle class. The class needs one field (instance
//variable) with name height of type double.

public class Cylinder extends Circle
{

    double height;
    public Cylinder(double radius,double height)
    {
        super(radius);
        this.height = height;

        if(height<0)
        {
            height=0;
        }

    }
    public double getHeight()
    {
        return height;
    }
    public double getVolume()
    {
      Cylinder cylinder;
      Circle circle;
        double volume = getArea()*getHeight();
        return  volume;
    }
}

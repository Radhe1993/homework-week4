package PoolArea;

// 2. Write a class with the name Cuboid that extends Rectangle class. The class needs one field
//(instance variable) with name height of type double.
//The class needs to have one constructor with three parameters width, length,

public class Cuboid extends Rectangle20
{
    double h;
    public  Cuboid(double w,double l,double h)
    {
        super(w,l);

        this.h = h;
        if(h<0)
        {
            h=0;
        }

    }
    public double getheight()
    {
        return h;
    }
    public double getVolume()
    {
        double area = w*l*h;
        return area;
    }

}

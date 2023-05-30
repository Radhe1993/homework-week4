package PoolArea;
//The Swimming Company has asked you to write an application that calculates the volume of cuboid
//shaped pools.
//1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name
//width and length both of type double.

public class Rectangle20
{
    double w,l;
    public Rectangle20(double w,double l)
    {
        this.w = w;
        this.l = l;
        if(w<0)
        {
            w=0;
        }
        if(l<0)
        {
            l=0;
        }
    }
    public double getWidth()
    {
        return w;
    }
    public double getlength()
    {
        return l;
    }
    public double getArea()
    {
        return w*l;
    }
}

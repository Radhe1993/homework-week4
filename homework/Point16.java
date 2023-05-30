package homework;
// Point
//You have to represent a point in 2D space. Write a class with the name Point. The class needs two
//fields (instance variables) with name x and y of type int.
//The class needs to have two constructors. The first constructor does not have any parameters (no-arg
//constructor). The second constructor has parameters x and y of type int and it needs to initialize the

public class Point16
{
    int x,y;
    double distance;
    public Point16()
    {
        System.out.println("No argument");
    }
    public Point16(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void setX(int x)
    {
        this.x=x;
        System.out.println(x);
    }
    public void setY(int y)
    {
        this.y=y;
        System.out.println(y);
    }
    public double distance()
    {
       return distance(0,0);
    }
    public double distance(int x,int y)
    {
      return Math.sqrt(((x-this.x)*(x-this.x))+((y-this.y)*(y-this.y)));
    }
    public double distance(Point16 point)
    {
       return distance(point.getX(),point.getY());

    }


    public static void main(String[] args)
    {
        Point16 first = new Point16(6,5);
        Point16 second = new Point16(3,1);
        System.out.println("distance(0,0)= "+first.distance());
        System.out.println("distance(Second)= "+first.distance(second));
        System.out.println("distance(2,2)= "+first.distance(2,2));
        Point16 point = new Point16();
        System.out.println("distance()="+point.distance());

    }

}

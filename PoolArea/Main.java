package PoolArea;

//3. Write a class with the name Main that contains the main method.

public class Main
{
    public static void main(String[] args) {
        Rectangle20 rec = new Rectangle20(5,10);
        System.out.println("Rectangle.w = "+rec.getWidth());
        System.out.println("Rectangle.l = "+rec.getlength());
        System.out.println("Rectangle.area = "+rec.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("Cuboid.w = "+cuboid.getWidth());
        System.out.println("Cuboid.l = "+cuboid.getlength());
        System.out.println("Cuboid.h = "+cuboid.getheight());
        System.out.println("Cuboid.volume = "+cuboid.getVolume());
    }
}

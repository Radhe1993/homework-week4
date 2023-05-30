package carpet;
// 3. Write a class with the name Calculator. The class needs two fields (instance variables) with name
//floor of type Floor and carpet of type Carpet.

public class Calculator
{
     Floor floor;
     Carpet carpet;
    public Calculator(Floor floor,Carpet carpet)
    {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost()
    {
       return  floor.getArea()*carpet.getCost();
    }

}

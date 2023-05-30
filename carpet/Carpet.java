package carpet;
//2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of
//type double

public class Carpet
{
    double cost;
    public Carpet(double cost)
    {
        this.cost = cost;
        if(cost<0)
        {
            cost=0;
        }
    }
    public double getCost()
    {

        return cost;
    }
}

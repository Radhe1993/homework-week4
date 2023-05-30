package SumCalculator;
// Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
//names firstNumber and secondNumber both of type double.

public class SimpleCalculator18
{
    double first,second;
    public double getFirstNumber()
    {
        return first;
    }
    public double getSecondNumber()
    {
        return second;
    }
    public void setFirstNumber(double first)
    {
        this.first = first;
    }
    public void setSecondNumber(double second)
    {
        this.second = second;
    }
    public double getAddition()
    {
        return first+second;
    }
    public double getSubtraction()
    {
        return first-second;
    }
    public double getMultiplication()
    {
        return first*second;
    }
    public double getDivision()
    {
        second = 0;
       return 0;

    }

    public static void main(String[] args)
    {
        SimpleCalculator18 calculator = new SimpleCalculator18();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = "+calculator.getAddition());
        System.out.println("sub = "+calculator.getSubtraction());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("mul = "+calculator.getMultiplication());
        System.out.println("div = "+calculator.getDivision());

    }

}

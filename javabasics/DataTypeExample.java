package Basics;

public class DataTypeExample {

    static int count = 0;

    public int intMultiplier(int number1, int number2)
    {
        return number1*number2;
    }
    public float floatMultiplier(float number1, float number2)
    {
        return number1*number2;
    }
    public double doubleMultiplier(double number1, double number2)
    {
        return  number1*number2;
    }

    public  void count()
    {
        count++;
    }
    public static void main(String[] args) {


        DataTypeExample dataTypeExample = new DataTypeExample();

        int intResult = dataTypeExample.intMultiplier(10, 20);

        dataTypeExample.count();

        float floatResult = dataTypeExample.floatMultiplier(10.5f, 20.5f);

        dataTypeExample.count();

        double doubleResult = dataTypeExample.doubleMultiplier(10.50d, 20.50d);

        dataTypeExample.count();

        System.out.println("\nMultiplication of Integer Numbers 10*20 = " + intResult
                + "\nMultiplication of Float Numbers 10.5*20.5 = " + floatResult
                + "\nMultiplication of Double Numbers 10.50*20.50 = " + doubleResult);
        System.out.println("Total Operation Performed = "+count);
    }
}
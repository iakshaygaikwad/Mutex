package inheritancepractice.vehicals;

public class Vehical {

    private String color;
    int tyreCount;

    Vehical()
    {
        System.out.println("Default Constructor of Vehical");
    }
    Vehical(String color){
        this.color=color;
    }
    Vehical(String color, int tyreCount)
    {
        this();
        this.color = color;
    }

}

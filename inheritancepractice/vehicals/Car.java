package inheritancepractice.vehicals;

public class Car extends Vehical{

    Car(String color, int tyreCount){
        super(color,tyreCount);
        System.out.println("Car Constructor...");
    }
}

package nonstaticvariablespractice;

 public class Area  //If we make this class final it stops AreaCircle Class from extending this class....Compile time error
 {
    final double PI = 3.14159265358979323846f;     //tried reinitialise this variable compile time error
    final static double PI2;    //declare final variable PI2 and initialise it in static block

    static {
        PI2 = 3.14159265358979323846;   //initialise the value of final variable using the static block, we can't init it anywhere else except here
    }

    public double area(final double r)   //if we make areaCircle final we can't override this method in AreaCircle Class compile time error
     {
        //if we try to reinitialise 'r' in this block it gives compile time error
         return PI*r*r;
     }


}

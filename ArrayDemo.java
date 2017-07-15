import java.util.Scanner;

/**
 * Created by Akshay on 14-07-2017.
 */
public class ArrayDemo {

    static String evenNumbers = "";
    static String oddNumbers = "";

    public static void acceptData(Scanner scanner, int numbers[]) {

        System.out.println("Enter "+ numbers.length + " Numbers ");
        for(int i=0 ; i< numbers.length ; i++){

            numbers[i] = scanner.nextInt();

            if (numbers[i]%2 == 0){

                int square =  numbers[i]*numbers[i];
                evenNumbers = evenNumbers+"Square of "+ numbers[i] + " is = " + square + " \n" ;
            }
            else {

                int cube = numbers[i] * numbers[i] * numbers[i];
                oddNumbers = oddNumbers + "Cube of " + numbers[i] + " is = " + cube + "\n";
            }

        }
    }

        public static void printData() {
            System.out.println("Square Of Even Numbers : \n" + evenNumbers);
            System.out.println("Cube Of Odd Numbers : \n" + oddNumbers);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Numbers you want to type : ");
        int number = scanner.nextInt();

        int numbers[] = new int[number];

        acceptData(scanner, numbers);
        printData();

        System.out.println("Thank You!");
    }


}

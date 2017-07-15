
import java.util.Scanner;

/**
 * Created by Akshay on 14-07-2017.
 */
public class ArrayDemoEnhanced {

    static String evenNumbers = "";
    static String oddNumbers = "";
    static int numbers[];


    static int getArraySize(Scanner scanner){

        System.out.println("How many Numbers you want to type : ");
        int number = scanner.nextInt();
        return number;
    }

    static void setArraySize(int number){

        ArrayDemo.numbers = new int[number];
    }

    static int[] getData(Scanner scanner) {

        System.out.println("Enter "+ numbers.length + " Numbers ");
        for(int i=0 ; i< numbers.length ; i++){

            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    static void evenSquareOddCube(int numbers[]){

        for(int i=0 ; i< numbers.length ; i++) {
            if (numbers[i] % 2 == 0) {

                int square = numbers[i] * numbers[i];
                evenNumbers = evenNumbers + "Square of " + numbers[i] + " is = " + square + " \n";
            } else {

                int cube = numbers[i] * numbers[i] * numbers[i];
                oddNumbers = oddNumbers + "Cube of " + numbers[i] + " is = " + cube + "\n";
            }
        }

    }

         static void printData() {
            System.out.println("Square Of Even Numbers : \n" + evenNumbers);
            System.out.println("Cube Of Odd Numbers : \n" + oddNumbers);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = getArraySize(scanner);
        setArraySize(number);
        int[] numbers1 = getData(scanner);
        evenSquareOddCube(numbers1);
        printData();

        System.out.println("Thank You!");
    }


}

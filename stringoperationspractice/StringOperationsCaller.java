package stringoperationspractice;

import java.util.Scanner;

public class StringOperationsCaller {
    private static Scanner scanner = new Scanner(System.in);

    private static String stringScanner() {
        System.out.println("Enter String : ");
        return scanner.nextLine();
    }

    private static void optionPrinter() {
        System.out.println(
                "\n---------------------------------------------------------\n" +
                        "0. Exit\n" +
                        "1. Convert a String to Upper and Lower Case\n" +
                        "2. Remove Spaces in String\n" +
                        "3. Reverse String\n" +

                        "---------------------------------------------------------\n" +
                        "\nEnter which operation you want to perform on String/s : "
        );
    }

    public static void makeChoice(int ch) {
        switch (ch) {
            case 0:
                System.out.println("Thanks...!");
                break;
            case 1:
                System.out.println(new StringOperations().getUpperLower(stringScanner()));
                break;
            case 2:
                System.out.println(new StringOperations().removeSpace(stringScanner()));
                break;
            case 3:
                System.out.println(new StringOperations().reverseString(stringScanner()));
                break;
            default:
                System.out.println("WRONG CHOICE.....!!!!");
        }
    }

    public static void main(String[] args) {

        int ch = -1;
        while (ch != 0) {
            StringOperationsCaller.optionPrinter();
            ch = Integer.parseInt(scanner.nextLine());
            makeChoice(ch);
        }
    }
}


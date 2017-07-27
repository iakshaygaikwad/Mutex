//Java End-of-file
//https://www.hackerrank.com/challenges/java-end-of-file

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (scanner.hasNext())
        {   i++;
            System.out.println(i + " "+scanner.nextLine());
        }
        }
    }
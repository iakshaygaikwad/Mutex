//Java Datatypes
//https://www.hackerrank.com/challenges/java-datatypes

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long n=sc.nextLong();
                System.out.println(n+" can be fitted in:");
                if (n <= Byte.MAX_VALUE && n >= Byte.MIN_VALUE) {
               System.out.println("* byte");
           }

           if (n <= Short.MAX_VALUE && n >= Short.MIN_VALUE) {
               System.out.println("* short");
           }

           if (n <= Integer.MAX_VALUE && n >= Integer.MIN_VALUE) {
               System.out.println("* int");
           }

           if (n <= Long.MAX_VALUE && n >= Long.MIN_VALUE) {
               System.out.println("* long");
           }            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
//Java Loops II
//https://www.hackerrank.com/challenges/java-loops

import java.util.*;
import java.io.*;

class JavaLoops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int result = 0;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
           for (int j = 0; j<n ; j++) {
            a = a + ((int)Math.pow(2,j))* b;;

            System.out.print(a + " ");
           }
        System.out.println();
        }    
        }
        
    }
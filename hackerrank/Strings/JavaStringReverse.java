//https://www.hackerrank.com/challenges/java-string-reverse/problem
import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        int flag = 0;
        for (int i = 0; i < A.length()-i; i++)
        {
            if (A.substring(i,i+1).compareTo(A.substring(A.length()-1-i,A.length()-i)) != 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }

    }
}
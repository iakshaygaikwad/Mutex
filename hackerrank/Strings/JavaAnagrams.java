//https://www.hackerrank.com/challenges/java-anagrams

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class JavaAnagram {

    static boolean isAnagram(String A, String B) {

    Boolean retValue = false;
   if(A != null && B != null) {
       char [] arrayA = A.toLowerCase().toCharArray();
       char [] arrayB = B.toLowerCase().toCharArray();
       Arrays.sort(arrayA);
       Arrays.sort(arrayB);
       retValue = Arrays.equals(arrayA, arrayB);
   }
   return retValue;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

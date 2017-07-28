package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringDemo {

    int getVowelCount( char arrayInput[]){

        int vowelCount = 0;
        for (char c : arrayInput)
        {
            if (isVowel(c))
                vowelCount++;
        }
        return vowelCount;
    }

    int getConsonantCount(char arrayInput[]){

        int consonantCount = 0;
        for (char c : arrayInput){

            if (!isVowel(c))
                consonantCount++;
        }
        return consonantCount;
    }

    boolean isVowel(char c)
    {
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            return true;
        return  false;
    }

    char[] stringConversion(String input)
    {
        input = input.toUpperCase();
        char arrayInput[] = input.toCharArray();
        return arrayInput;
    }

    void printResult(int vowelCount,int consonantCount)
    {
        System.out.println("Total Vowels in String : "+vowelCount);
        System.out.println("Total Consonant in String : "+consonantCount);
    }

    public static void main(String[] args) throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringDemo stringDemo = new StringDemo();

        System.out.println("Enter String : ");
        String input = bufferedReader.readLine();

        char arrayInput[] = stringDemo.stringConversion(input);


        int vowelCount = stringDemo.getVowelCount(arrayInput);
        int consonantCount = stringDemo.getConsonantCount(arrayInput);

        stringDemo.printResult(vowelCount, consonantCount);
    }

}

/*
*
        if(!new Basics.StringDemo().isNumber((arrayInput))) {
                }
        else {
            System.out.println("ERROR NUMBER");
        }


*     public boolean isNumber(char[] arrayInput)
    {
        try {
            int x = 0;
            for (int i = 0; i<arrayInput.length ; i++ )
                if (Integer.parseInt(String.valueOf(arrayInput[i])) >= 0)
                    continue;
                    System.out.println(x = Integer.parseInt(String.valueOf(arrayInput[i])));
                return true;
            }
            catch (Exception e)
            {
                return false;
            }*/

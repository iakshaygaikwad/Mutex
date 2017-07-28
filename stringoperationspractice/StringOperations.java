package stringoperationspractice;


public class StringOperations {

//Convert given string to upper and lower case
    String getUpperLower(String s){
        return "String in UPPER CASE :\t"+s.toUpperCase() + "\nString in lower case :\t" +s.toLowerCase();
    }

    // Remove spaces in String
    String removeSpace(String s){

        return s.replace(" ","");
    }

    String reverseString(String s){
        //return new StringBuilder(s).reverse().toString();
        String s1 = "";
        for(int i = s.length()-1; i >= 0; i--){
            s1 = s1 + s.charAt(i);
        }
        return s1;
    }

}

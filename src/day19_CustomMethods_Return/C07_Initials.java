package day19_CustomMethods_Return;

import java.util.Locale;

public class C07_Initials {
    public static void main(String[] args) {
        System.out.println("initials(\"Ahmet\",\"Öztürk\") = " + initials("Ahmet", "Öztürk"));
    }

    //1.Create a method that can display the ınıtıals of the person. initials(String firstName, String lastName)

    public static String initials(String firstName,String lastName){
        String result="";
        result=firstName.charAt(0)+"."+lastName.charAt(0);
        result=result.toUpperCase();
        return result;
    }


}

package day20_CustomMethods_Overloading;


public class C01_NameOfDay {
    public static void main(String[] args) {
        System.out.println("nameOfDay(4) = " + nameOfDay(9));
    }

    public static String nameOfDay(int number) {
        String result = "";
        if (number < 1 || number > 7) {
            result = "invalid";
        } else if (number == 1) {
            result = "Pazartesi";
        } else if (number == 2) {
            result = "Salı";
        } else if (number == 3) {
            result = "Çarşamba";
        } else if (number == 4) {
            result = "Perşembe";
        } else if (number == 5) {
            result = "Cuma";
        } else if (number == 6) {
            result = "Cumartesi";
        } else {
            result = "Pazar";
        }
        return result;


    }


}


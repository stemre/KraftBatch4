package day18_CustomMethods;

public class C03_CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(10);
        System.out.println("---------------------------------------");
        ageOfPerson(2000);
        System.out.println("---------------------------------------");
        printNumbers(10,20);
    }

    /**
     * a function that can check if a number is odd number or even number //bir sayının tek sayı mı yoksa çift sayı mı olduğunu kontrol edebilen bir işlev
     *
     * @param number
     */


    public static void oddOrEven(int number) { //Odd Or Even = tek veya çift
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }

    /**
     * @param birthyear
     */
    public static void ageOfPerson(int birthyear) {
        int age = 2023 - birthyear;
        System.out.println("Your age is: " + age);
    }

    /**
     * @param x
     * @param y
     */
    public static void printNumbers(int x, int y) {
        for (int i = x + 1; i < y; i++) {
            System.out.println(i + " ");
        }
    }
}

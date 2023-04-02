package day19_CustomMethods_Return;

public class C02_PracticeTasks1_Return {
    public static void main(String[] args) {
        System.out.println(oddNumbers());
        System.out.println("------------------");
        System.out.println(evenNumbers());
        System.out.println("------------------");
        System.out.println(eligibleForAlcoholPurchase(23));
        System.out.println("------------------");
        System.out.println(eligibleToVote(20, "TR"));
        System.out.println("------------------");
        System.out.println("grades(50) = " + grades(50));
        System.out.println("grades(90) = " + grades(90));
        System.out.println("------------------");
        System.out.println("areaOfCircle(1) = " + areaOfCircle(1));
        System.out.println("------------------");
        System.out.println("area of square(4) = " + areaaOfSquare(4));
        System.out.println("------------------");
        System.out.println("dollarToTL(1500) = "+ dollarToTl(1500));
    }

    //1.create a method that can print add numbers between 1-100 in a same line saperated by space

    /**
     * a method that can print add numbers between 1-100 in a same line saperated by space
     */
    public static String oddNumbers() {
        String result = "";
        for (int i = 1; i < 100; i += 2) {
            result += i + " ";

        }
        return result;
    }

    //2.create a method that can print even numbers between 1-100 in same line saperated by space

    /**
     * a method that return a string of even numbers between 1-100 in same line saperated by space
     */
    public static String evenNumbers() {
        String result = " ";
        for (int i = 0; i < 100; i += 2) {
            result += i + " ";
        }
        return result;
    }

//3.create a method that can check if a person is eligible to buy alcohol

    /**
     * a method that returns a boolean if a person is eligible to buy alcohol //
     * amd age limit is 21
     *
     * @param age
     */
    public static boolean eligibleForAlcoholPurchase(int age) {
        boolean eligible;
        if (21 <= age) {
            eligible = false;
        } else {
            eligible = true;
        }
        return eligible;
    }

    //4.create a method that can check if a person is eligible to vote

    /**
     * a method that can check if a person is eligible to vote
     *
     * @param age
     * @param citizenship
     */
    public static boolean eligibleToVote(int age, String citizenship) {
        boolean isEligible = age >= 18 && citizenship.equalsIgnoreCase("TR");
        return isEligible;


    }

//5.create a method that can calculate the grade of the student based on the score
//score >= 90 grade 'A'
//score >= 80grade  'B'
//score >= 70 grade 'C'
//score >= 60 grade 'D'
//score < 60 grade  'F'

    /**
     * a method that can calculate the grade of the student based on the score
     * score >= 90 grade 'A'
     * score >= 80grade  'B'
     * score >= 70 grade 'C'
     * score >= 60 grade 'D'
     * score < 60 grade  'F'
     *
     * @param score
     */

    public static char grades(int score) { //grade = seviye
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;

    }

    /**
     * a method that can calculate the area of a circle
     *
     * @param radius
     */
//6.create a method that can calculate the area of a circle
    public static double areaOfCircle(int radius) { // area of circle = daire alanı
        double area;
        area = Math.round(Math.PI * radius * radius * 100) / 100.0;
        return area;
    }

    /**
     * a method that can calculate the area of a square
     *
     * @param side
     */
//7.create a method that can calculate the area of a square
    public static double areaaOfSquare(int side) { //area Of Square = karenın alanı
        return side * side;
    }

    /**
     * a method that can convert dollar to Tl  rate:19.04
     *
     * @param dollar
     */
//8.create a method that can convert dollar to Tl  rate:19.04
    public static double dollarToTl(double dollar) {
        return dollar * 19.04;
    }
}
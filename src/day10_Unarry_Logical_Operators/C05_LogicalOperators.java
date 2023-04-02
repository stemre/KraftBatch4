package day10_Unarry_Logical_Operators;

public class C05_LogicalOperators {
    public static void main(String[] args) {
        String name = " Ayse ";
        int age = 34;
        String citizen = "Turkey";

        boolean isEligibleVote = age >= 18 && citizen == "Turkey";

        System.out.println(name + "is eligible to vote : " + isEligibleVote);

        System.out.println("-------------------------------------------------");

        String name2 = "Umit";
        int findexscore = 800;
        int age2 = 43;
        int income = 40000;

        boolean isEligibleForLoan = findexscore >= 1500 && 18 <= age2 && income > 30000;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        System.out.println("-------------------------------------------------");

        String name3 = "Hatice";
        int age3 = 21;
        char gender = 'F'; //Female , Male

        boolean isEligible = age3 >= 18 && (gender == 'M' || gender == 'F');
        System.out.println(name3 + "is eligible to be selected as MP : " + isEligible);

        System.out.println("-------------------------------------------------");

        String student = "ali";
        double gpa = 2.5;
        int familyİncome = 15000;

        boolean isEligibleForScholarShip = gpa >= 3.5 || familyİncome <= 20000;

        System.out.println(student + " is eligible for scholarship: " + isEligibleForScholarShip);

        System.out.println("-------------------------------------------------");

        boolean result = true;
        System.out.println("result = " + result);

        boolean result1 =! result;// false
        System.out.println("result1 = " + result1);

        System.out.println("-------------------------------------------------");

        int score = 55;

        boolean passed = score>=60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);



    }
}

package day15_If_Else___Switch_Loops_Summary;

public class C02_If_Else_Example {
    public static void main(String[] args) {

        int not = 96;
        String str = "";
        if (not >= 0 && not < 40) {
            str = "F";
        } else if (not >= 40 && not < 55) {
            str = "D";
        } else if (not >= 55 && not < 70) {
            str = "C";
        } else if (not >= 70 && not < 85) {
            str = "B";
        } else if (not >= 85 && not <= 100) {
            System.out.println("A");
        } else {
            System.out.println("Hatalı giriş");
        }
        if (!str.equals("")) {
            System.out.println(str);
        }


    }
}

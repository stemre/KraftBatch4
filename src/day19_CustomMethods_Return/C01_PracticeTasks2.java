package day19_CustomMethods_Return;

public class C01_PracticeTasks2 {
    public static void main(String[] args) {
        tlToDollar(25000);
        System.out.println("--------------");
        double myBagWeiht = kgToLb(23);
        System.out.println("myBagWeiht = " + myBagWeiht);
        System.out.println("--------------");
        signOfNumber(0);
        System.out.println("--------------");
        eachCharInStrıng("bmw");
        System.out.println("--------------");
        calculator(10, 2,'+');
        calculator(10, 2,'-');
        calculator(10, 2,'*');
        calculator(10, 2,'/');
        calculator(10, 2,'!');
    }
    //1.create a method that can convert lıra to dollar //Tlyı dolara cevır

    /**
     * a method that can convert lıra to dollar
     *
     * @param TL
     */
    public static void tlToDollar(int TL) {
        System.out.println(TL + " TL makes " + Math.round((TL / 19.04) * 100) / 100.0 + " USD");
    }

    //2.create a method that can convert kg to lb

    /**
     * method that can convert kg to lb
     *
     * @param kg
     * @return
     */
    public static double kgToLb(double kg) {
        double result = 0;
        result = (Math.round(kg * 2.204622262) * 100) / 100.0;

        return result;
    }

    //3. create a method that can determine if the given integer is positive,negative or zero

    public static void signOfNumber(int number) {
        if (number < 0) {
            System.out.println(number + " is a negative number");
        } else if (number > 0) {
            System.out.println(number + " is a positive number");
        } else {
            System.out.println(number + " is a zero");
        }
    }

    //4. create a method name printEachChar that can print each characters of a string

    /**
     * a method name printEachChar that can print each characters of a string
     *
     * @param str
     */

    public static void eachCharInStrıng(String str) { //Char = Karakter
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " ");

        }
    }

    //5. create a method name calculator that passes three arguments (num1,num2,mathOperator), prints the calculatıon result

    /**
     * a method name calculator that passes three arguments (num1,num2,mathOperator), prints the calculatıon result
     *
     * @param num1
     * @param num2
     * @param mathOperator
     */
    public static void calculator(double num1, double num2, char mathOperator) {
        boolean valid = mathOperator == '+' || mathOperator == '-' || mathOperator == '*' || mathOperator == '/';
        if (valid) {
            switch (mathOperator) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                    break;

            }

        }else{
            System.err.println("Invalıd Math Operator "+mathOperator);
        }

    }
}

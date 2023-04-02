package day19_CustomMethods_Return;

public class C06_ReturnTheBiggest {
    public static void main(String[] args) {
        System.out.println("max() = " + max(2,3));
    }
    //a method that returns the bıggest number

    public static int max(int a, int b) {
        int result = 0;
        if (a > b) {
            result = a;
        }else{
            result=b;
        }
        return result;
    }
}

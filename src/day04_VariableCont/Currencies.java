package day04_VariableCont;

public class Currencies {
    public static void main(String[] args) {
        //$1000 2023/3/02 exchange rates

        int dollar = 1000;
        double lira = dollar * 18.89;
        double euro = dollar * 0.94;

        double JPY = dollar * 136;
        double pound = dollar * 0.83;

        double cad = dollar * 1.36;
        double yuan = dollar * 6.9;

        System.out.println("lira =" + lira);
        System.out.println("euro =" + euro);
        System.out.println("JPY =" + JPY);
        System.out.println("pound" + pound);

        System.out.println("cad" + cad);

        System.out.println("yuan" + yuan);


    }
}

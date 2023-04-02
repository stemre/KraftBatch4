package day19_CustomMethods_Return;

public class C05_NameOfMonth {
    public static void main(String[] args) {
        System.out.println("nameOfMonth(10) = " + nameOfMonth(10));
    }

    //Create a method that can display the name of the month based on the given number to the method
    public static String nameOfMonth(int number) {
        String name = "";
        switch (number) {
            case 1:
                name += "Ocak";
                break;
            case 2:
                name += "Şubat";
                break;
            case 3:
                name += "Mart";
                break;
            case 4:
                name += "Nisan";
                break;
            case 5:
                name += "Mayıs";
                break;
            case 6:
                name += "Haziran";
                break;
            case 7:
                name += "Temmuz";
                break;
            case 8:
                name += "Ağustos";
                break;
            case 9:
                name += "Eylül";
                break;
            case 10:
                name += "Ekim";
                break;
            case 11:
                name += "Kasım";
                break;
            case 12:
                name += "Aralık";
                break;
            default:
                name += "Geçersiz Karakter";


        }
        return "Ay İsmi : "+name;
    }
}

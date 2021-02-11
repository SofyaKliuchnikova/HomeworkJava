import java.security.spec.RSAOtherPrimeInfo;
public class Exercise1 {

    public static void main(String[] args) {

        System.out.println("Результат задания 1 = " + calc(1, 2, 3, 4));
        System.out.println("Результат задания 2 " + summa10_20(5 , 7));
        System.out.println("Результат задания 3 = " + ((polozhitelnoe(-10)) ? "положительное" : "отрицательное"));
        System.out.println("Результат задания 4 = " + hello("Маша"));
        System.out.println("Результат задания 5 = " + ((visokosny(2021)) ? "високосный" : "не високосный"));
    }

    public static float calc(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    public static boolean summa10_20(int first, int second){
        return (first + second >= 10) && (first + second <= 20);
    }

    public static boolean polozhitelnoe(int chislo){
        return chislo >= 0;
    }

    public static String hello(String yourName){
        return "Привет, " + yourName +"!";
    }

    public static boolean visokosny(int year){
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}

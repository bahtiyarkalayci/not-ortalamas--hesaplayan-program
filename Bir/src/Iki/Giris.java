package Iki;
import java.util.Scanner;

public class Giris {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik;


        Scanner input =new Scanner(System.in);
        System.out.print("matematik notunu giriniz=");
        matematik=input.nextInt();


        System.out.print("fizik notunu giriniz=");
        fizik=input.nextInt();


        System.out.print("kimya notunu giriniz=");
        kimya=input.nextInt();


        System.out.print("turkce notunu giriniz=");
        turkce=input.nextInt();

        System.out.print("tarih notunu giriniz=");
        tarih=input.nextInt();


        System.out.print("muzik notunu giriniz=");
        muzik=input.nextInt();


        int ortalama=(matematik+fizik+kimya+muzik+turkce+tarih)/6;
        System.out.print("ortalama=");
        System.out.println(ortalama);


         String str= (ortalama>=60 )?"sınıfı geçti":"sınıfta kaldı";
        System.out.println(str);




    }
}

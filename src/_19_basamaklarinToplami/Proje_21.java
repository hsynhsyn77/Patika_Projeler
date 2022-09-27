package _19_basamaklarinToplami;

import java.util.Scanner;

public class Proje_21 {
    public static void main(String[] args) {
        int a, b = 10, basamakSayisi = 0, toplam = 0;
        int basvalue;

        Scanner scan = new Scanner(System.in);
        System.out.print("Rakam giriniz: ");
        a = scan.nextInt();
        int temNumber = a;

        while (temNumber != 0) {
            temNumber /= b;
            basamakSayisi++;
        }
        System.out.println( "basamakların sayısı : "+basamakSayisi );
        temNumber = a;
        while (temNumber != 0) {
            basvalue = temNumber % b;
            temNumber /= b;
            toplam += basvalue;
        }
        System.out.println("Basamakların toplamı: " + toplam);
    }
}

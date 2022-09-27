package _21_GirilensayilardanCiftVe4UnKatlariniBulma;

import java.util.Scanner;

public class Proje_17 {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
       do {
            System.out.print("sayı giriniz : ");
            n = scan.nextInt();
            if (n % 2 == 0 && n%4==0)
                total += n;
        } while (n > 0);
        System.out.print("Toplam : " + total);
    }
}

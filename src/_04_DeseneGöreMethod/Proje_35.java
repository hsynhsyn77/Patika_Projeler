package _04_DeseneGöreMethod;

import java.util.Scanner;

public class Proje_35 {
    public static void desen(int sayi, int gecicisayi, int x) {

        if (gecicisayi >= 1 && x == 0) {
            gecicisayi -= 5;
            System.out.println(gecicisayi + " ");

            if (gecicisayi <= 0) {
                desen(sayi, gecicisayi, 1);
            }
            desen(sayi, gecicisayi, 0);
        } else if (gecicisayi <= sayi && x == 1) {
            gecicisayi += 5;
            if (gecicisayi > sayi) {
                return;
            }

            System.out.println(gecicisayi + " ");
            desen(sayi, gecicisayi, 1);
        }
    }

    public static void main(String[] args) {
        int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı gir  :");
        sayi = scanner.nextInt();
        desen(sayi, sayi, 0);

    }
}

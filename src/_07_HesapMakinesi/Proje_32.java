package _07_HesapMakinesi;

import java.util.Scanner;

public class Proje_32 {
    static int alanVeCevre(int a, int b) {
        int dikdörtgenCevresi= 2 * (a + b);
        System.out.println("toplam:" + dikdörtgenCevresi);
        return dikdörtgenCevresi;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Dikdörtgen Alan ve Çevre Hesabı\n"
                    + "0- Çıkış Yap";

        while (true) {
            System.out.println(menu);
            System.out.println("Lütfen Bir İşlem Seçiniz");
            select = scan.nextInt();
            if (select == 0) {
                break;
            }
            System.out.println("ilk sayı:");
            int a = scan.nextInt();
            System.out.println("ikinci sayı:");
            int b = scan.nextInt();
            switch (select) {
                case 1:
                    alanVeCevre(a, b);
                    break;

            }
        }
        System.out.println("Güle Güle");
    }
}

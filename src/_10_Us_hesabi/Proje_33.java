package _10_Us_hesabi;

import java.util.Scanner;

public class Proje_33 {
    Scanner scan = new Scanner(System.in);

    static int us(int alt, int us) {
        int sonuc = 1;
        if (us == 0) {
            return 1;
        }
        if (alt == 0) {
            return 0;
        }
        while (us != 0) {
            sonuc *= alt;
          us--;
        }
        return sonuc;

    }
    public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            System.out.print("alt sayı: ");
            int alt = scan.nextInt();
            System.out.print("us sayısı: ");
            int us = scan.nextInt();

            System.out.println("Sonuc: " + us(alt, us));
        }
    }
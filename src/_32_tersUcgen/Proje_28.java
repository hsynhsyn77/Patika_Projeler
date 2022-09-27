package _32_tersUcgen;

import java.util.Scanner;

public class Proje_28 {
    public static void main(String[] args) {
        int n,a,b,c;
        Scanner inp = new Scanner(System.in);
        System.out.print(" Bir Sayı gırınız : ");
        n = inp.nextInt();
        for ( a = 1; a < n; a++) {
            for ( b = 1; b <= a; b++) {
                System.out.print(" ");

            }
            for ( c = 1; c <= ( 2 * n - (2 * a + 1) ); c++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }
    }
}

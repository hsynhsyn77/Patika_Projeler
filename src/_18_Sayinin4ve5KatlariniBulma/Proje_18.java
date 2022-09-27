package _18_Sayinin4ve5KatlariniBulma;

import java.util.Scanner;

public class Proje_18 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int number=scan.nextInt();
        for (int i = 1; i <=number ; i*=4) {
            System.out.println(i);
        }
        for (int i = 1; i <=number ; i*=5) {
            System.out.println(i);
        }
    }
}

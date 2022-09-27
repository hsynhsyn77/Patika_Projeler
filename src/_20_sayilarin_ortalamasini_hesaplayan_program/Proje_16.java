package _20_sayilarin_ortalamasini_hesaplayan_program;

import java.util.Scanner;

public class Proje_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int llong =0;
        double total=0;
        System.out.print("Sayıyı giriniz:");
        int sayi = input.nextInt();
        byte i =1;
        while(i<=sayi) {
            if(i%3==0 && i%4==0) {
                total += i;
            }
            llong++;
            i++;
        }
        System.out.print("Ortalama:"+(total/llong));
    }
}

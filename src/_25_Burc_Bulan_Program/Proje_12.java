package _25_Burc_Bulan_Program;

import java.util.Scanner;

public class Proje_12 {
    public static void main(String[] args) {
        int gun, ay;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz Ayı  : ");
        ay = input.nextInt();
        System.out.print("Doğduğunuz Günü : ");
        gun = input.nextInt();

        if ((ay == 1 && 22 <= gun && gun <= 31) || (ay == 2 && 1 <= gun && gun <= 19)) {
            System.out.println("Kova  Burcu");
        }else if (gun > 32) {
            System.out.println("Geçersiz Bir Gün Girdiniz");
        } else if ((ay == 2 && 20 <= gun && gun <= 28) || (ay == 3 && 1 <= gun && gun <= 20)) {
            System.out.println("Balık burcu");
        }else if (gun > 29) {
            System.out.println("Geçersiz Bir Gün Girdiniz");
        } else if ((ay == 3 && 21 <= gun && gun <= 31) || (ay == 4 && 1 <= gun && gun <= 20)) {
            System.out.println("Koç burcu");
        }else if (gun > 32) {
            System.out.println("Geçersiz Bir Gün Girdiniz");
        } else if ((ay == 4 && 21 <= gun && gun <= 30) || (ay == 5 && 1 <= gun && gun <= 21)) {
            System.out.println("Boğa Burcu");
        }else if (gun > 31) {
            System.out.println("Geçersiz Bir Gün Girdiniz");
        } else if ((ay == 5 && 22 <= gun && gun <= 31) || (ay == 6 && 1 <= gun && gun <= 22)) {
            System.out.println("İkizler Burcu");
        }else if (gun > 32) {
            System.out.println("Geçersiz Bir Gün Girdiniz");
        } else if ((ay == 6 && 23 <= gun && gun <= 30) || (ay == 7 && 1 <= gun && gun <= 22)) {
            System.out.println("Yengeç burcu");
        }else if (gun > 31) {
            System.out.println("Geçersiz Bir Gün Girdiniz");
        } else if ((ay == 7 && 23 <= gun && gun <= 31) || (ay == 8 && 1 <= gun && gun <= 22)) {
            System.out.println("aslan Burcu");
        }else if (gun > 32) {
            System.out.println("Geçersiz Bir Gün Girdiniz");
        } else if ((ay == 8 && 23 <= gun && gun <= 31) || (ay == 9 && 1 <= gun && gun <= 22)) {
            System.out.println("Başak Burcu");
        }else if (gun > 32) {
            System.out.println("Geçersiz Bir Gün Girdiniz");
        } else if ((ay == 9 && 23 <= gun && gun <= 30) || (ay == 10 && 1 <= gun && gun <= 22)) {
            System.out.println("Terazi Burcu");
        }else if (gun > 31) {
            System.out.println("Geçersiz Bir Gün Girdiniz");
        } else if ((ay == 10 && 23 <= gun && gun <= 31) || (ay == 11 && 1 <= gun && gun <= 21)) {
            System.out.println("Akrep Burcu");
        }else if (gun > 32) {
            System.out.println("Geçersiz Bir Gün Girdiniz");
        } else if ((ay == 11 && 22 <= gun && gun <= 30) || (ay == 12 && 1 <= gun && gun <= 21)) {
            System.out.println("Yay Burcu");
        }else if (gun > 31) {
            System.out.println("Geçersiz Bir Gün Girdiniz");
        } else if ((ay == 12 && 22 <= gun && gun <= 31) || (ay == 1 && 1 <= gun && gun <= 21)) {
            System.out.println("Oğlak burcu");
        }else if (gun > 32) {
            System.out.println("Geçersiz Bir Gün Girdiniz");

        }
    }
}

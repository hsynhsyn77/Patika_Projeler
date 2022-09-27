package _13_minVeMax;

import java.util.Scanner;

public class Proje_26 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int KacSayi, number, min = 1, max = 1;

        System.out.print("Kac tane sayi gireceksiniz: ");
        KacSayi = input.nextInt();

        for (int i = 1; i <= KacSayi; i++){
            System.out.print(i + ".sayiyi giriniz: ");
            number = input.nextInt();

            if (i == 1){
                max = number;
                min = number;
            }

            if (number > max){
                max = number;
            }

            if (number < min){
                min = number;
            }
        }

        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);
    }
}

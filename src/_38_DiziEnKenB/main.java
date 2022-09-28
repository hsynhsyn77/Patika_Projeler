package _38_DiziEnKenB;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] list = {15, 12, 5, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list);
        System.out.println("Bir deger giriniz");
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int min = list[0], max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] >= x) {
                System.out.println("Girilen sayıdan küçük en yakın sayı: " + list[i - 1]);
                break;
            }
        }

        for (int j = 0; j < list.length; j++) {
            if (list[j] > x) {
                System.out.println("Girilen sayıdan büyük en yakın sayı: " + list[j]);
                break;
            }
        }
    }
}

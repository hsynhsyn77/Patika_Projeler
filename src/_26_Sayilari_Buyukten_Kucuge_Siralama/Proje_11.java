package _26_Sayilari_Buyukten_Kucuge_Siralama;

import java.util.Scanner;

public class Proje_11 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.print("a Sayısını Gir : ");
        a = input.nextInt();
        System.out.print("b Sayısını Gir : ");
        b = input.nextInt();
        System.out.print("c Sayısını Gir : ");
        c = input.nextInt();

        if ((a<b)&&(a<c)){
            if (b<c){
                System.out.println("a<b<c");
            }
            else {
                System.out.println("a<c<b");
            }
        } else if ((b<a)&&(b<c)) {
            if (a<c){
                System.out.println("b<a<c");
            }
            else {
                System.out.println("b<c<a");
            }

        } else if ((c<a)&&(c<b)) {
            if (a<b){
                System.out.println("c<a<b");
            }
            else {
                System.out.println("c<b<a");
            }

        }

    }

}
package _29_ManavKasaPrg;

import java.util.Scanner;

public class Proje_6 {
    public static void main(String[] args) {
        double tutar;
        double armut = 2.14 , elma=3.67 , domates = 1.11 , muz = 0.95 , patlıcan = 5.00;
        int armutKilo , elmaKilo , domatesKilo , muzKilo , patlıcanKilo;

        Scanner inp = new Scanner(System.in);
        System.out.print("armut kilo (tam sayım olarak) :");
        armutKilo = inp.nextInt();
        System.out.print("elma kilo (tam sayım olarak) :");
        elmaKilo = inp.nextInt();
        System.out.print("domates kilo (tam sayım olarak) :");
        domatesKilo = inp.nextInt();
        System.out.print("muz kilo (tam sayım olarak) :");
        muzKilo = inp.nextInt();
        System.out.print("patlıcankilo (tam sayım olarak) :");
        patlıcanKilo = inp.nextInt();
        tutar = (armut * armutKilo) +
                (elmaKilo * elma) +
                (domatesKilo * domates) +
                (muzKilo * muz)+
                (patlıcanKilo * patlıcan);
        System.out.println("Tutar :" + tutar);
    }
}




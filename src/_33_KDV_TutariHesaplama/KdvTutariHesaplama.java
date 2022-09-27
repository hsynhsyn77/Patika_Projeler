package _33_KDV_TutariHesaplama;

import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {
        double tutar,toplam1,toplam2;

        Scanner inp = new Scanner(System.in);

        System.out.print("Fiyat nedir :");
        tutar = inp.nextDouble();

        //iki seçenekte hesaplandı
        toplam1 = tutar + (tutar*0.18);
        toplam2 = tutar+(tutar*0.08);

        System.out.println("Kdv olmadan fiyat : " + tutar);

        System.out.println((tutar > 0 && tutar <= 1000) ? "Kdv fiyat :" +  tutar * 0.18 : "Kdv Fiyat :" + tutar * 0.08);
        System.out.println((tutar > 0 && tutar <= 1000) ? "Toplam fiyat :" +  toplam1 : "Toplam Fiyat :" +  toplam2);
    }
}

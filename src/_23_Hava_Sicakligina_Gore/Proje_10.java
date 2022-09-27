package _23_Hava_Sicakligina_Gore;

import java.util.Scanner;

public class Proje_10 {
    public static void main(String[] args) {
        int heat;

        Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz :");
        heat=input.nextInt();

        if (heat < 5)
            System.out.print("Kayak yapabilirsin.");
        else if (heat >= 5 && heat < 10){
            System.out.print("Sinemaya gidebilirsin.");
        } else if (heat >=10 && heat < 15){
            System.out.print("Sinemaya yada Piknige gidebilirsiniz.");
        } else if (heat >= 15 && heat <25){
            System.out.print("Piknik için güzel bir hava.");
        } else{
            System.out.print("Yüzmek için güzel bir hava.");
        }

    }
}

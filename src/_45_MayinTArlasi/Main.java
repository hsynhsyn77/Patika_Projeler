package _45_MayinTArlasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int row, col;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen satır sayısını giriniz : " );
        row = input.nextInt();
        System.out.print("Lütfen sütun sayısını giriniz : ");
        col = input.nextInt();


        MineSweeper mine = new MineSweeper(row, col);
        mine.run();

    }
}


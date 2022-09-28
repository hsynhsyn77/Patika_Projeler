package _45_MayinTArlasi;

import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    int mineCount;
    int choice = 1;

    double mineChance;

    int[][] matris;
    Scanner input = new Scanner(System.in);

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.mineCount = this.rowNumber * this.colNumber / 4;
    }

    void matrix() {
        int[][] matris = new int[this.rowNumber][this.colNumber];
        for (int[] row : matris)
            Arrays.fill(row, 10);
        while (mineCount != 0) {
            double rowRandom = Math.random() * this.rowNumber;
            double colRandom = Math.random() * this.rowNumber;
            if (matris[(int) rowRandom][(int) colRandom] != 9) {
                matris[(int) rowRandom][(int) colRandom] = 9;
                mineCount--;
            }
        }
        this.mineCount = this.rowNumber * this.colNumber / 4;
        this.matris = matris;
        printMatrixMine();
    }

    void printMatrixMine() {
        for (int i = 0; i < this.matris.length; i++) {
            for (int j = 0; j < this.matris[i].length; j++) {
                if (this.matris[i][j] == 9) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();

        }
    }

    void printMatrix() {
        int count = 0;
        for (int i = 0; i < this.matris.length; i++) {
            for (int j = 0; j < this.matris[i].length; j++) {
                if (0 <= matris[i][j] && matris[i][j] < 9) {
                    System.out.print(matris[i][j] + " ");
                } else {
                    System.out.print("- ");
                }

            }
            System.out.println();

        }
    }


    boolean isMine() {
        int n, k, nearMine;
        System.out.print("Satır giriniz : ");
        n = input.nextInt();
        System.out.print("Sütun giriniz : ");
        k = input.nextInt();
        if(0 <= matris[n][k] && matris[n][k] < 9 ){
            System.out.println("Zaten bu konumu açtınız. Lütfen farklı bir konum giriniz.");
            return false;
        }


        if (this.matris[n][k] == 9) {
            System.out.println("Mayına bastınız ve oyunu kaybettiniz!");
            return true;
        } else {
            System.out.println("=======================");
            nearMine = 0;
            if (k + 1 < this.matris[0].length)
                if (matris[n][k + 1] == 9) {
                    nearMine++;
                }
            if (n + 1 < this.matris.length)
                if (matris[n + 1][k] == 9) {
                    nearMine++;
                }
            if (n + 1 < this.matris.length && k + 1 < this.matris[0].length)
                if (matris[n + 1][k + 1] == 9) {
                    nearMine++;
                }
            if (n - 1 >= 0 && k - 1 >= 0)
                if (matris[n - 1][k - 1] == 9) {
                    nearMine++;
                }

            if (n - 1 >= 0)
                if (matris[n - 1][k] == 9) {
                    nearMine++;
                }
            if (k - 1 >= 0)
                if (matris[n][k - 1] == 9) {
                    nearMine++;
                }
            if (n - 1 >= 0 && k + 1 < this.matris[0].length)
                if (matris[n - 1][k + 1] == 9) {
                    nearMine++;
                }
            if (n + 1 < this.matris.length && k - 1 >= 0)
                if (matris[n + 1][k - 1] == 9) {
                    nearMine++;
                }

            this.matris[n][k] = nearMine;
            this.choice++;
            printMatrix();
            return false;
        }
    }

    void run() {
        matrix();

        System.out.println(this.mineCount);
        while (this.choice <= this.rowNumber * this.colNumber - this.mineCount) {

            if (isMine()) {
                break;
            }

        }
        if (this.choice == this.rowNumber * this.colNumber - this.mineCount + 1) {
            System.out.println("=======================");
            System.out.println("Tebrikler, kazandınız!");
        }
    }


}


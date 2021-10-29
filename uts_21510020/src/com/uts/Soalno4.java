package com.uts;

import java.util.Scanner;

public class Soalno4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Masukan Jumlah Baris = ");
        int baris = input.nextInt();
        System.out.println();
        System.out.printf("  ");
        for (int l = 1;l <= baris;l++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 2;i <= baris; i++){
            for ( int k = i;k <= baris;k++){

                System.out.printf("  ");
            }
            for ( int j = i;j >= 1; j--){
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.printf("  ");

    }
}

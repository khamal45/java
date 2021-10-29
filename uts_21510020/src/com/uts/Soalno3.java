package com.uts;

import java.util.Scanner;

public class Soalno3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.printf("Masukan Jumlah Baris = ");
        int baris = input.nextInt();
        System.out.println();
        for (int i = 1;i <= baris - 1; i++){
            for ( int j = i;j >= 1; j--){
                System.out.printf("  ");
            }
            for ( int k = i;k <= baris;k++){
                System.out.print("* ");
                }
            System.out.println();
        }
        System.out.printf("  ");
        for (int l = 1;l <= baris;l++) {
        System.out.print("* ");
    }
    }
}

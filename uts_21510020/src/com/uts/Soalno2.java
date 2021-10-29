package com.uts;

import java.util.Scanner;

public class Soalno2 {
    public static void main(String[] args) {
        String hasil = "";
        Scanner input = new Scanner(System.in);
        System.out.printf("Masukan kata : ");
        String kata = input.nextLine();
        System.out.println();
        for (int i = 0 ; i <= kata.length() - 1 ; i++){
            hasil = hasil + kata.charAt(i);
            hasil = hasil + " ";
            System.out.println(hasil);
        }

    }
}

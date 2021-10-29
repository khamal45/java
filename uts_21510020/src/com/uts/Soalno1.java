package com.uts;

import java.util.Scanner;

public class Soalno1 {

    public static void main(String[] args) {
        String hasil = "";
	Scanner input = new Scanner(System.in);
        System.out.printf("Masukan kata : ");
    String kata = input.nextLine();
        System.out.println();
    for (int i = kata.length() - 1 ;  i>=0 ; i--){
        hasil = hasil + kata.charAt(i);
    }
        System.out.printf("Hasil Balik kata : ");
        System.out.println(hasil);
    }
}

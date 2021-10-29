package com.uts;

import java.util.Scanner;

public class Soalno1 {

    public static void main(String[] args) {
        String hasil = "";
	Scanner input = new Scanner(System.in);
        System.out.printf("Masukan kata : ");
    String kata = input.nextLine();
        System.out.println();
        System.out.printf("Hasil Balik kata : ");

    for (int i = kata.length() - 1 ;  i>=0 ; i--){
        System.out.print(kata.substring(i,i+1));
    }

        System.out.println();
    }
}

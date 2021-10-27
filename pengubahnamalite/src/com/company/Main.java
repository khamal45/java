package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner masukan = new Scanner(System.in);
            System.out.println("Masukan Kata yang akan di balik  ");
            String kalimat = masukan.nextLine();
            String kata_asli = kalimat;
            boolean key = true;
            int jumlah_string = kalimat.length();
            char a, b;
            int angka, jumlah_string_sementara = 0;
            String kalimat_hasil = "", awal = "", cek = "",original="";
            //memecah kalimat menjadi per huruf untuk di cek
            for (angka = jumlah_string - 1; angka >= 0; angka--) {
                a = kalimat.charAt(angka);
                cek = String.valueOf(a);
                //kata balik asli tanpa pembalikan ng dan ny
                original = original + cek;
                //mengecek spasi dan _
                if (cek.equals(" ") || cek.equals("_")) {
                    System.out.println("Maaf Aplikasi ini hanya untuk 1 kata saja");
                    return;
                } else {
                    //merubah NG dan NY
                    if (cek.equalsIgnoreCase("g") || cek.equalsIgnoreCase("y")) {
                        jumlah_string_sementara = angka - 1;
                        b = kalimat.charAt(jumlah_string_sementara);
                        awal = String.valueOf(b);
                        if (awal.equalsIgnoreCase("n")) {
                            original = original + awal;
                            kalimat_hasil = kalimat_hasil + awal;
                            angka = jumlah_string_sementara;
                        }
                    }

                    kalimat_hasil = kalimat_hasil + cek;

                }
            }
            //mencetak hasil
            System.out.printf("Kata Asli : ");
            System.out.println(kata_asli);
            System.out.println();
            System.out.printf("Kata Hasil : ");
            System.out.println(kalimat_hasil);
            System.out.println();
            //mencetak kata palindrom
            if (kata_asli.equalsIgnoreCase(original)) {
                System.out.print(kata_asli);
                System.out.println(" : Termasuk kata palindrom");
            } else {
                System.out.print(kata_asli);
                System.out.println(" : Bukan Termasuk kata palindrom");
            }

    }
}

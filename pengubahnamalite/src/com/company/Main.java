package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

            Scanner masukan = new Scanner(System.in);

            String kalimat = masukan.nextLine();
            String kata_asli = kalimat;


            boolean key = true;
            int jumlah_string = kalimat.length();
            char a, b;
            int angka, jumlah_string_sementara = 0;
            String kalimat_hasil = "", awal = "", z = "";
            //memecah kalimat menjadi per huruf untuk di cek
            for (angka = jumlah_string - 1; angka >= 0; angka--) {
                a = kalimat.charAt(angka);
                z = String.valueOf(a);

                //mengecek spasi dan _
                if (z.equals(" ") || z.equals("_")) {
                    System.out.println("Maaf Aplikasi ini hanya untuk 1 kata saja");
                    return;
                } else {
                    //merubah NG
                    if (z.equalsIgnoreCase("g")) {
                        jumlah_string_sementara = angka - 1;
                        b = kalimat.charAt(jumlah_string_sementara);
                        awal = String.valueOf(b);
                        if (awal.equalsIgnoreCase("n")) {
                            kalimat_hasil = kalimat_hasil + awal;
                            angka = jumlah_string_sementara;
                        }
                    }
                    //merubah NY
                    if (z.equalsIgnoreCase("y")) {
                        jumlah_string_sementara = angka - 1;
                        b = kalimat.charAt(jumlah_string_sementara);
                        awal = String.valueOf(b);
                        if (awal.equalsIgnoreCase("n")) {
                            kalimat_hasil = kalimat_hasil + awal;
                            angka = jumlah_string_sementara;
                        }
                    }
                    kalimat_hasil = kalimat_hasil + z;

                }
            }
            //mencetak hasil
            System.out.printf("Kata Asli : ");
            System.out.println(kata_asli);
            System.out.println();
            System.out.printf("Kata Hasil : ");
            System.out.println(kalimat_hasil);
            System.out.println();

            System.out.println("Kata Pelindrom :");

            //mencetak kata palindrom
            if (kata_asli.equalsIgnoreCase(kalimat_hasil)) {
                System.out.print(kata_asli);
                System.out.println(" = Termasuk kata palindrom");
            } else {
                System.out.print(kata_asli);
                System.out.println(" = Bukan Termasuk kata palindrom");
            }
        }
    }









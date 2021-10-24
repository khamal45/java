package com.company;
//Nama : Mahendra Khamal Akbar
//Nim : 21.51.0020
import java.util.Scanner;

//Keunggulan aplikasi ini adalah
//1. Menerjemahkan perkata contoh :  (input = malang satu) (output = ngalam utas)

//2. Tidak merubah lokasi simbol @ jika berada di depan kata
// contoh : (input = @makanya @ikut) (output = @anyakam @tuki)

//3. Tidak Merubah lokasi simbol !,?,.,$ jika berada di belakang kalimat
//contoh : (input = hai! sudah makan?) (output= iah! hadus nakam?)

//4. Sangat sedikit bug karena sudah saya uji 'khamal:2021'

//update
//24-10-2021
//mengurangi kode yang tidak perlu dan bug dalam beberap simbol
// before : (baris = 352)
// after  : (baris = 251)
public class Main {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        String kalimat = masukan.nextLine();
          String  kata_asli = kalimat;
          //menambah kan spasi dan @ di akhir kalimat supaya
            // tidak error saat user mengakhiri kalimat dengan spasi atau _
          kalimat = kalimat + " @";
        boolean key = true;
        int jumlah_string = kalimat.length();
        char a, b, c;
        int angka, jumlah_string_sementara1 = 0, jumlah_string_sementara = 0;
        String kalimat_hasil = "", simbol = "", awal = "", kata_awal = "", kata_rubah = "", z = "", kata_palindrom = "",kalimat_hasil1="";
                //memecah kalimat menjadi per huruf untuk di cek
            for (angka = 0; angka < jumlah_string; angka++) {
                a = kalimat.charAt(angka);
                z = String.valueOf(a);

                //mengecek spasi dan _
                if (z.equals(" ") || z.equals("_")) {
                    //menganti dengan _ jika bukan spasi untuk hasil kalimat
                    String d = " ";
                    if (z.equals("_")){
                        d = "_";
                    }
                    //mengecek kata awal untuk memastikan palindrom

                    for (int x = jumlah_string_sementara1; x < angka; x++) {
                        a = kalimat.charAt(x);
                        z = String.valueOf(a);
                        //memisahkan kata dari simbol
                        if (z.equals("@") || z.equals("?") || z.equals(".") || z.equals("!") || z.equals("$")) {

                        } else {
                            kata_awal = kata_awal + a;

                        }

                    }

                    //mengecek apakah ada simbol di awal
                    jumlah_string_sementara = angka;
                    int cek = jumlah_string_sementara1;
                    a = kalimat.charAt(cek);
                    z = String.valueOf(a);
                    if (z.equals("@")) {
                        awal = "@";
                        kalimat_hasil = kalimat_hasil + awal;
                        jumlah_string_sementara1 += 1;
                    }
                    //membalik kata
                    for (int i = jumlah_string_sementara - 1; i >= jumlah_string_sementara1; i--) {
                        b = kalimat.charAt(i);
                        z = String.valueOf(b);

                        //pengecekan NG
                        if (z.equalsIgnoreCase("g")) {
                            int a1 = i - 1;
                            char b1 = kalimat.charAt(a1);
                            String z1 = String.valueOf(b1);
                            if (z1.equalsIgnoreCase("n")) {


                                //memasuakn nilai n ke dalam string terlebih dulu
                                kalimat_hasil = kalimat_hasil + z1;
                                i -= 1;
                            }
                        }
                        //pengecekan NY
                        if (z.equalsIgnoreCase("y")) {
                            int a1 = i - 1;
                            char b1 = kalimat.charAt(a1);
                            String z1 = String.valueOf(b1);
                            if (z1.equalsIgnoreCase("n")) {


                                //memasuakn nilai n ke dalam string terlebih dulu
                                kalimat_hasil = kalimat_hasil + z1;
                                i -= 1;
                            }
                        }
                        if (i == jumlah_string_sementara - 1){
                        //mengecek apakah ada simbol di akhir kata
                        switch (z) {
                            case "?":
                                simbol = "?";
                                i -= 1;
                                b = kalimat.charAt(i);
                                break;
                            case ".":
                                simbol = ".";
                                i -= 1;
                                b = kalimat.charAt(i);
                                break;
                            case "!":
                                simbol = "!";
                                i -= 1;
                                b = kalimat.charAt(i);
                                break;
                            case "$":
                                simbol = "$";
                                i -= 1;
                                b = kalimat.charAt(i);
                                break;
                        }
                        }


                        //memasukan karakter ke dalam string
                        kalimat_hasil = kalimat_hasil + b;
                        kata_rubah = kata_rubah + b;


                    }
                    //menyimpan kata palindrom di dalam string
                    kata_palindrom = kata_palindrom + kata_awal;



                    if (kata_awal.equalsIgnoreCase(kata_rubah)) {
                        kata_palindrom = kata_palindrom + "!";
                    } else {
                        kata_palindrom = kata_palindrom + ".";
                    }
                    //menambah kan simbol dan spasi/_
                    kalimat_hasil = kalimat_hasil + simbol + d;

                    awal = "";
                    simbol = "";
                    jumlah_string_sementara1 = jumlah_string_sementara + 1;
                    kata_awal = "";
                    kata_rubah = "";

                }
            }


           //menghilangkan @ di akhir kalimat
            for (int r = 0;r < jumlah_string-2;r++){
                b = kalimat_hasil.charAt(r);
                kalimat_hasil1 = kalimat_hasil1 + b;
            }

            //mencetak hasil
            System.out.printf("Kalimat Asli : ");
            System.out.println(kata_asli);
            System.out.println();
            System.out.printf("Kalimat Hasil : ");
            System.out.println(kalimat_hasil1);
            System.out.println();

            System.out.println("Kata Pelindrom :");

            //mencetak kata palindrom
            kata_awal = "";
            kata_rubah = "";
            angka = kata_palindrom.length();
            for (int v = 0; v < angka; v++) {
                b = kata_palindrom.charAt(v);
                z = String.valueOf(b);
                if (z.equals(".")) {
                    for (int m = v + 1;m < angka-1;m++){
                        b = kata_palindrom.charAt(m);
                        z = String.valueOf(b);
                        //mengecek untuk kata yang sama
                        if (kata_rubah.equalsIgnoreCase(kata_awal)){

                            key=false;
                        }
                        else if (z.equals(".")|| z.equals("!")){
                            kata_rubah = "";
                        }
                        else {
                            kata_rubah = kata_rubah+b;
                        }

                    }
                    if (kata_rubah.equalsIgnoreCase(kata_awal)){

                        key=false;
                    }
                    //mencetak untuk hasil bukan palindrom
                    else if (key == true){
                    System.out.print(kata_awal);
                    System.out.printf(" = Bukan Termasuk Kata Palindrom");
                    System.out.println();

                    }
                    kata_awal="";
                }
                else if (z.equals("!")) {
                    for (int m = v + 1;m < angka-1;m++){
                        b = kata_palindrom.charAt(m);
                        z = String.valueOf(b);
                        //mengecek untuk kata yang sama
                        if (kata_rubah.equalsIgnoreCase(kata_awal)){

                            key=false;
                        }
                        else if (z.equals(".")|| z.equals("!")){
                            kata_rubah = "";
                        }
                        else {
                            kata_rubah = kata_rubah+b;
                        }

                    }
                    if (kata_rubah.equalsIgnoreCase(kata_awal)){

                        key=false;
                    }
                    //mencetak untuk hasil termasuk palindrom
                    else if (key == true){
                    System.out.print(kata_awal);
                    System.out.printf(" = Termasuk Kata Palindrom");
                    System.out.println();
                    }
                    kata_awal="";
                }
                else {
                    kata_awal = kata_awal + b;
                }
                kata_rubah = "";
                key = true;
            }


        }
    }

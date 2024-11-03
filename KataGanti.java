package pert6;

 import java.util.Scanner;

public class KataGanti {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==== Program Mengganti Kata ====");

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        System.out.print("Kata yang ingin diganti: ");
        String kataGanti = input.nextLine();

        System.out.print("Menjadi kata: ");
        String kataBaru = input.nextLine();

        String kalimatBaru = kalimat.replace(kataGanti, kataBaru);

        System.out.println("==== Hasil Formatting ====");
        System.out.println("Kalimat awal: " + kalimat);
        System.out.println("Kalimat baru: " + kalimatBaru);
    }
}



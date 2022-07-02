package dateTimeRegistration;

import dateTimeRegistration.HesapMakinesi;

import java.util.Scanner;

public class MainHesapMakinesi {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("L�tfen 1. say�y� giriniz : ");

        double sayi1 = scan.nextDouble();

        System.out.print("L�tfen 2. say�y� giriniz : ");

        double sayi2 = scan.nextDouble();

        HesapMakinesi hsp = new HesapMakinesi(sayi1, sayi2);

        System.out.println("Say�lar�n toplam� : "+hsp.topla());

        System.out.println("Say�lar�n fark� : "+hsp.cikar());

        System.out.println("Say�lar�n �arpimi : "+hsp.carp());

        System.out.println("Say�lar�n b�l�m� : "+hsp.bol());

    }
}
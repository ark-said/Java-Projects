package bookManagement;

import java.util.List;
import java.util.Scanner;

public class KitapMethod {

    static Scanner scan = new Scanner(System.in);
    static int kitapNo=1000;

    public static void menu(List<Kitap> liste) {
        System.out.println("===================== KITAP PROGRAMI ====================="
                + "\n1 : kitap ekle"
                + "\n2 : Numara ile kitap sil"
                + "\n3 : Tum kitaplari listele"
                + "\n4 : Bitir");
        System.out.println("isleminizi seciniz : ");
        int tercih=scan.nextInt();
        switch (tercih) {
            case 1:
                kitapEkle(liste);
                break;
            case 2:
                noIleSil(liste);
                break;
            case 3:
                listele(liste);
                break;
            case 4:
                bitir();
                break;

            default:
                System.out.println("yanlis giris yapildi tekrar deneyiniz");
                break;
        }
    }
    public static void kitaplarEkle(List<Kitap> liste) {
        Kitap kitap1 = new Kitap(++kitapNo, "sefiller", "victor hugo", 1890, 100 );
        Kitap kitap2 = new Kitap(++kitapNo, "serenad", "falan filan", 1999, 220 );
        Kitap kitap3 = new Kitap(++kitapNo, "insan ne ile yasar", "victor hugo", 2000, 150 );
        Kitap kitap4 = new Kitap(++kitapNo, "korler", "benim kitabim", 2010, 130 );
        Kitap kitap5 = new Kitap(++kitapNo, "ebik gabik", "kudret nari", 2011, 90 );

        liste.add(kitap1);
        liste.add(kitap2);
        liste.add(kitap3);
        liste.add(kitap4);
        liste.add(kitap5);

    }

    public static void listele(List<Kitap> liste) {
        for (Kitap k : liste) {
            System.out.println(k.toString());
        }
        menu(liste);
    }

    public static void noIleSil(List<Kitap> liste) {
        System.out.println("silinecek kitap no giriniz : ");
        int silinecekNo=scan.nextInt();
        for (Kitap k : liste) {
            if (k.getNo() == silinecekNo) {
                liste.remove(k);
                menu(liste);
            }
        }
        System.out.println(silinecekNo + " ait kitap bulunamadi !!!");
        menu(liste);
    }

    public static void kitapEkle(List<Kitap> liste) {
        System.out.println("Kitap ismi giriniz : ");
        scan.nextLine(); // dummy --> kukla bos scan object
        String kitapAdi =scan.nextLine();
        System.out.println("Kitabin yazar ismi giriniz : ");
        String yazarAdi=scan.nextLine();
        System.out.println("yayin yilini giriniz : ");
        int yayinyili= scan.nextInt();
        System.out.println("fiyatini giriniz : ");
        double fiyat=scan.nextDouble();
        Kitap kitap= new Kitap(++kitapNo,kitapAdi,yazarAdi,yayinyili,fiyat);//kitap object create edildi
        liste.add(kitap);
        System.out.println(kitap+ " eklendi ");
        menu(liste);
    }

    public static void bitir() {
        System.out.println("yine bekleriz...");

    }
}
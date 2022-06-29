package bookManagement;

import java.util.ArrayList;
import java.util.List;


public class Kitapci{
    static List<Kitap> kitapListe = new ArrayList<>();


    public static void main(String[] args) {
        KitapMethod.kitaplarEkle(kitapListe);
        KitapMethod.menu(kitapListe);

    }


}



package homeworks.weeks.week1;

import homeworks.weeks.Homework;

public class Arrays implements Homework {
    public void executeHomework() {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Sami";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("--------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Sami";
        //ogrenciler[4] = "Ali";

        for (int i = 0; i < ogrenciler.length; i++) {
            String ogrenci = ogrenciler[i];
            System.out.println(ogrenci);
        }

        System.out.println("--------------------------");
        
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}

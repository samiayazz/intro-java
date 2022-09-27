package homeworks.weeks.week2;

import homeworks.weeks.Homework;

public class Methods2 implements Homework {
    public void executeHomework() {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(15, 7);
        System.out.println(sayi);
    }

    public static void ekle() {
        System.out.println("Eklendi!");
    }

    public static void sil() {
        System.out.println("Silindi!");
    }

    public static void guncelle() {
        System.out.println("Güncellendi!");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static String sehirVer() {
        return "İstanbul";
    }
}

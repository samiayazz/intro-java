package homeworks.weeks.week2;

import homeworks.weeks.Homework;

import java.util.Arrays;

public class RecapDemoClasses implements Homework {
    public void executeHomework() {
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.topla(3, 4);
        System.out.println(sonuc);
    }

    private class DortIslem {
        public int topla(int sayi1, int sayi2) {
            return sayi1 + sayi2;
        }

        public int cikar(int sayi1, int sayi2) {
            return sayi1 - sayi2;
        }

        public int carp(int sayi1, int sayi2) {
            return sayi1 * sayi2;
        }

        public int bol(int sayi1, int sayi2) {
            return sayi1 / sayi2;
        }
    }
}

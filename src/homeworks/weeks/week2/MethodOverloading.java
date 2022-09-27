package homeworks.weeks.week2;

import homeworks.weeks.Homework;

public class MethodOverloading implements Homework {
    public void executeHomework() {
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(2, 3));
        System.out.println(dortIslem.topla(2, 3, 5));
    }

    private class DortIslem {
        public int topla(int sayi1, int sayi2) {
            return sayi1 + sayi2;
        }

        public int topla(int sayi1, int sayi2, int sayi3) {
            return sayi1 + sayi2 + sayi3;
        }
    }
}

package homeworks.weeks.week1;

import homeworks.weeks.Homework;

public class Conditionals implements Homework {
    public void executeHomework() {
        int sayi = 24;

        if (sayi < 20) System.out.println("Sayı 20'den küçüktür");
        else if (sayi == 20) System.out.println("Sayı 20'ye eşittir");
        else System.out.println("Sayı 20'den büyüktür");
    }
}

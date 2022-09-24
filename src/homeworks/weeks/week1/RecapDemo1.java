package homeworks.weeks.week1;

import homeworks.weeks.Homework;

public class RecapDemo1 implements Homework {
    public void executeHomework() {
        int sayi1 = 266;
        int sayi2 = 25;
        int sayi3 = 26;

        int enBuyuk = sayi1;
        if (enBuyuk < sayi2) enBuyuk = sayi2;
        if (enBuyuk < sayi3) enBuyuk = sayi3;

        System.out.println("En büyük = " + enBuyuk);
    }
}

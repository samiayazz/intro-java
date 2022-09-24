package homeworks.weeks.week1;

import homeworks.weeks.Homework;

public class MiniProjeSayiBulma implements Homework {
    public void executeHomework() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) System.out.println("Sayı mevcuttur");
        else System.out.println("Sayı mevcut değildir");
    }
}

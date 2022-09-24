package homeworks.weeks.week1;

import homeworks.weeks.Homework;

public class MiniProjeAsalSayilar implements Homework {
    public void executeHomework() {
        int number = 0;
        int remainder = number % 2;
        //System.out.println(remainder);

        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Sayı asal değildir.");
            return;
        }

        if (number < 1) {
            System.out.println("Geçersiz sayı!");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) System.out.println("Sayı asaldır.");
        else System.out.println("Sayı asal değildir.");
    }
}

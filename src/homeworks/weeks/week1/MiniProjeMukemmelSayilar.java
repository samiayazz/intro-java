package homeworks.weeks.week1;

import homeworks.weeks.Homework;

public class MiniProjeMukemmelSayilar implements Homework {
    public void executeHomework() {
        int number = 28, total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) total += i;
        }

        if (total == number) System.out.println(number + " sayısı mükemmel sayıdır");
        else System.out.println(number + " sayısı mükemmel sayı değildir");
    }
}

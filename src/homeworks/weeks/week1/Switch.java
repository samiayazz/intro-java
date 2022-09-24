package homeworks.weeks.week1;

import homeworks.weeks.Homework;

public class Switch implements Homework {
    public void executeHomework() {
        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel: Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok Güzel: Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi: Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil: Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
        }
    }
}

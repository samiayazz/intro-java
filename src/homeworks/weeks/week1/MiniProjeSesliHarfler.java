package homeworks.weeks.week1;

import homeworks.weeks.Homework;

public class MiniProjeSesliHarfler implements Homework {
    public void executeHomework() {
        char harf = 'U';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }
    }
}

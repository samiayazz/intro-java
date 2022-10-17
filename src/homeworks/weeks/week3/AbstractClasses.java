package homeworks.weeks.week3;

import homeworks.weeks.Homework;

public class AbstractClasses implements Homework {
    public abstract class GameCalculator {
        public abstract void hesapla();

        public final void gameOver() {
            System.out.println("Oyun bitti!");
        }
    }

    public class ManGameCalculator extends GameCalculator {
        public void hesapla() {
            System.out.println("Puanınız: 90");
        }
    }

    public class WomanGameCalculator extends GameCalculator {
        public void hesapla() {
            System.out.println("Puanınız: 95");
        }
    }

    public class KidsGameCalculator extends GameCalculator {
        public void hesapla() {
            System.out.println("Puanınız: 100");
        }
    }

    public class OlderGameCalculator extends GameCalculator {
        public void hesapla() {

        }
    }

    public void executeHomework() {
        GameCalculator gameCalculator = new WomanGameCalculator();
        gameCalculator.hesapla();
        gameCalculator.gameOver();
    }
}

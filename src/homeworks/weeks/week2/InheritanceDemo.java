package homeworks.weeks.week2;

import homeworks.weeks.Homework;

public class InheritanceDemo implements Homework {
    public void executeHomework() {
        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new AskerKrediManager());
    }

    private class KrediUI {
        public void krediHesapla(BaseKrediManager baseKrediManager) {
            baseKrediManager.hesapla();
        }
    }

    private class BaseKrediManager {
        public void hesapla() {
            System.out.println("Kredi hesaplandı!");
        }
    }

    private class OgretmenKrediManager extends BaseKrediManager {
    }

    private class TarimKrediManager extends BaseKrediManager {
    }

    private class AskerKrediManager extends BaseKrediManager {
    }
}

package homeworks.weeks.week3;

import homeworks.weeks.Homework;

public class Overriding implements Homework {
    public class BaseKrediManager {
        public double hesapla(double tutar) {
            return tutar * 1.18;
        }
    }

    public class OgretmenKrediManager extends BaseKrediManager {

    }

    public class TarimKrediManager extends BaseKrediManager {

    }

    public class OgrenciKrediManager extends BaseKrediManager {
        public double hesapla(double tutar) {
            return tutar * 1.10;
        }
    }

    public void executeHomework() {
        BaseKrediManager[] krediManagers = new BaseKrediManager[]{
                new OgretmenKrediManager(),
                new TarimKrediManager(),
                new OgrenciKrediManager()
        };

        for (BaseKrediManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000););
        }
    }
}

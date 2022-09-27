package homeworks.weeks.week2;

import homeworks.weeks.Homework;

public class Classes implements Homework {
    public void executeHomework() {
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.add();
        customerManager.remove();
        customerManager.update();
    }

    private class CustomerManager {
        public void add() {
            System.out.println("Müşteri eklendi!");
        }

        public void remove() {
            System.out.println("Müşteri silindi!");
        }

        public void update() {
            System.out.println("Müşteri güncellendi!");
        }
    }
}

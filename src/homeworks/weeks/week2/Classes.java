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

        //value
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        //reference
        int[] sayilar1 = {1, 2, 3};
        int[] sayilar2 = {4, 5, 6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
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

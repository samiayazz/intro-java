package homeworks.weeks.week3;

import homeworks.weeks.Homework;

public class InterfaceDemo implements Homework {
    public interface Workable {
        void work();
    }

    public interface Eatable {
        void eat();
    }

    public interface Payable {
        void pay();
    }

    public interface Maintainable {
        void maintain();
    }

    public class Worker implements Workable, Eatable, Payable {
        public void work() {

        }

        public void eat() {

        }

        public void pay() {

        }
    }

    public class OutsideWorker implements Workable {
        public void work() {

        }
    }

    public class RobotWorker implements Workable, Maintainable {
        public void work() {

        }

        public void maintain() {
            
        }
    }

    public void executeHomework() {

    }
}

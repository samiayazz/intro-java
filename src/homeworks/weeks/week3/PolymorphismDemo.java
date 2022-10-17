package homeworks.weeks.week3;

import homeworks.weeks.Homework;

public class PolymorphismDemo implements Homework {

    public class BaseLogger {
        public void log(String message) {
            System.out.println("Default Logger: " + message);
        }
    }

    public class DatabaseLogger extends BaseLogger {
        public void log(String message) {
            System.out.println("Logged to database: " + message);
        }
    }

    public class FileLogger extends BaseLogger {
        public void log(String message) {
            System.out.println("Logged to file: " + message);
        }
    }

    public class EmailLogger extends BaseLogger {
        public void log(String message) {
            System.out.println("Logged to email: " + message);
        }
    }

    public class ConsoleLogger extends BaseLogger {
        public void log(String message) {
            System.out.println("Logged to console: " + message);
        }
    }

    public class CustomerManager {
        private BaseLogger logger;

        public CustomerManager(BaseLogger logger) {
            this.logger = logger;
        }

        public void add() {
            System.out.println("Müşteri eklendi");
            this.logger.log("Log mesajı");
        }
    }

    public void executeHomework() {
        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        customerManager.add();
    }
}

package homeworks.weeks.week3;

import homeworks.weeks.Homework;

public class AbstractDemo implements Homework {
    public abstract class BaseDatabaseManager {
        public abstract void getData();
    }

    public class OracleDatabaseManager extends BaseDatabaseManager {
        public void getData() {
            System.out.println("Veri getirildi: Oracle");
        }
    }

    public class CustomerManager {
        BaseDatabaseManager databaseManager;

        public void getCustomers() {
            databaseManager.getData();
        }
    }

    public class MsSqlDatabaseManager extends BaseDatabaseManager {
        public void getData() {
            System.out.println("Veri getirildi: MsSQL Server");
        }
    }

    public class MySqlDatabaseManager extends BaseDatabaseManager {
        public void getData() {
            System.out.println("Veri getirildi: MySQL");
        }
    }

    public void executeHomework() {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();
    }
}

package homeworks.weeks.week3;

import homeworks.weeks.Homework;

public class Interfaces implements Homework {

    public interface CustomerDal {
        void add();
    }

    public interface Repository {

    }

    public class MySqlCustomerDal implements CustomerDal, Repository {
        public void add() {
            System.out.println("MySQL Eklendi");
        }
    }

    public class OracleCustomerDal implements CustomerDal {
        public void add() {
            System.out.println("Oracle Eklendi");
        }
    }

    public void executeHomework() {
        CustomerDal customerDal = new OracleCustomerDal();
        customerDal.add();
    }
}

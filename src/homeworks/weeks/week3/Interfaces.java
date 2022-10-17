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

    public class CustomerManager {
        private CustomerDal customerDal;

        public CustomerManager(CustomerDal customerDal) {
            this.customerDal = customerDal;
        }

        public void add() {
            customerDal.add();
        }
    }

    public void executeHomework() {
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}

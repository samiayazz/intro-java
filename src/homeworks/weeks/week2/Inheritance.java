package homeworks.weeks.week2;

import homeworks.weeks.Homework;

public class Inheritance implements Homework {
    public void executeHomework() {
        Customer customer = new Customer();
        Employee employee = new Employee();

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();
    }

    private class Person {
        int id;
        String firstName;
        String lastName;
        int age;
    }

    private class Customer extends Person {
        String email;
    }

    private class Employee extends Person {
        double salary;
    }

    private class PersonManager {
        public void list() {
            System.out.println("Listelendi!");
        }

        public void add() {
            System.out.println("Eklendi!");
        }
    }

    private class CustomerManager extends PersonManager {
    }

    private class EmployeeManager extends PersonManager {
        public void bestEmployee() {
            System.out.println("Ayın elemanı getirildi!");
        }
    }
}

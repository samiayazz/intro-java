package homeworks.weeks.week2;

import homeworks.weeks.Homework;

public class ClassesWithAttributes implements Homework {
    public void executeHomework() {
        Product product = new Product();
        product.id = 1;
        product.name = "Laptop";
        product.description = "Asus Laptop";
        product.price = 13000;
        product.stockAmount = 3;

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }

    private class Product {
        //attribute | field
        int id;
        String name;
        String description;
        double price;
        int stockAmount;
    }

    private class ProductManager {
        public void add(Product product) {
            //JDBC
            System.out.println("Ürün eklendi: " + product.name);
        }
    }
}

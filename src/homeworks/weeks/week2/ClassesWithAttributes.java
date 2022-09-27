package homeworks.weeks.week2;

import homeworks.weeks.Homework;

public class ClassesWithAttributes implements Homework {
    public void executeHomework() {
        Product product = new Product();
        product.setId(1);
        product.setName("Macbook Pro 16");
        product.setDescription("2022 16\" M1 Macbook Pro");
        product.setPrice(49999);
        product.setStockAmount(10);
        product.setColor("Space Gray");

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }

    private class ProductManager {
        public void add(Product product) {
            //JDBC
            System.out.println("Ürün eklendi: " + product.getCode());
        }
    }

    private class Product {
        //attribute | field
        private int id;
        private String name;
        private String description;
        private double price;
        private int stockAmount;
        private String color;
        private String code;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getStockAmount() {
            return stockAmount;
        }

        public void setStockAmount(int stockAmount) {
            this.stockAmount = stockAmount;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getCode() {
            return name.substring(0, 1) + id;
        }
    }
}

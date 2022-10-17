package homeworks.weeks.week3;

import homeworks.weeks.Homework;

public class StaticDemo implements Homework {
    public class Product {
        public int id;
        public String name;
        public double price;
    }

    public class ProductValidator {
        static {
            System.out.println("Statik yapıcı blok çalıştı!");
        }

        public ProductValidator() {
            System.out.println("Yapıcı blok çalıştı!");
        }

        public static boolean isValid(Product product) {
            return !product.name.isEmpty() && product.price > 0;
        }

        public void bisey() {

        }
    }

    public class ProductManager {
        public void add(Product product) {
            if (ProductValidator.isValid(product)) System.out.println("Eklendi!");
            else System.out.println("Ürün bilgileri geçersizdir!");
        }
    }

    public void executeHomework() {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.id = 1;
        product.name = "Mouse";
        product.price = 100;
        productManager.add(product);
    }
}

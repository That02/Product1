package org.example.Tusk3;

public class Main {
    public static void main(String[] args) {

        Category category1 = new Category("Категория 1");
        Category category2 = new Category("Категория 2");


        Product product1 = new Product("Товар 1", 10.99, 4);
        Product product2 = new Product("Товар 2", 5.99, 3);
        Product product3 = new Product("Товар 3", 12.49, 5);
        Product product4 = new Product("Товар 4", 8.75, 2);


        category1.addProduct(product1);
        category1.addProduct(product2);
        category2.addProduct(product3);
        category2.addProduct(product4);


        System.out.println("Каталог продуктов:");
        System.out.println("Категория 1:");
        for (Product product : category1.getProducts()) {
            System.out.println("Название: " + product.getName());
            System.out.println("Цена: " + product.getPrice());
            System.out.println("Рейтинг: " + product.getRating());
            System.out.println();
        }

        System.out.println("Категория 2:");
        for (Product product : category2.getProducts()) {
            System.out.println("Название: " + product.getName());
            System.out.println("Цена: " + product.getPrice());
            System.out.println("Рейтинг: " + product.getRating());
            System.out.println();
        }


        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");


        user1.getBasket().addProduct(product1);
        user1.getBasket().addProduct(product3);
        user2.getBasket().addProduct(product2);
        user2.getBasket().addProduct(product4);


        category1.removeProduct(product1);
        category2.removeProduct(product2);
        category2.removeProduct(product4);


        System.out.println("Покупки пользователей:");
        System.out.println("Пользователь 1 (" + user1.getUsername() + "):");
        for (Product product : user1.getBasket().getPurchasedProducts()) {
            System.out.println("Название: " + product.getName());
            System.out.println("Цена: " + product.getPrice());
            System.out.println("Рейтинг: " + product.getRating());
            System.out.println();
        }

        System.out.println("Пользователь 2 (" + user2.getUsername() + "):");
        for (Product product : user2.getBasket().getPurchasedProducts()) {
            System.out.println("Название: " + product.getName());
            System.out.println("Цена: " + product.getPrice());
            System.out.println("Рейтинг: " + product.getRating());
            System.out.println();
        }
    }
}
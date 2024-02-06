package org.example.Tusk3;
import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private int rating;

    public Product(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }
}

class Category {
    private String name;
    private ArrayList<Product> products;

    public Category(String name) {
        this.name = name;
        products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
}

class Basket {
    private ArrayList<Product> purchasedProducts;

    public Basket() {
        purchasedProducts = new ArrayList<>();
    }

    public ArrayList<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void addProduct(Product product) {
        purchasedProducts.add(product);
    }

    public void removeProduct(Product product) {
        purchasedProducts.remove(product);
    }
}

class User {
    private String username;
    private String password;
    private Basket basket;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        basket = new Basket();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Basket getBasket() {
        return basket;
    }
}
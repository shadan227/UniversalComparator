package entities;

import static utils.ProductUtils.generateId;

public class Mobile implements Product {

    private final String productId;
    private String brand;
    private String model;
    private String name;
    private String price;

    public Mobile(String brand, String model, String name, String price) {
        this.productId = generateId();
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.name = name;
    }

    @Override
    public String getProductId() {
        return this.productId;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    public Mobile setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    public Mobile setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Mobile setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getPrice() {
        return this.price;
    }

    public Mobile setPrice(String price) {
        this.price = price;
        return this;
    }
}

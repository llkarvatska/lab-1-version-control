package ua.opnu.labwork21.entity;

public class Product {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer stock;

    public Product() {}

    public Product(Long id, String name, String description, Double price, Integer stock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}
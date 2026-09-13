package ua.opnu.labwork21.entity;

public class OrderItem {
    private Long id;
    private Integer quantity;
    private Double price;

    public OrderItem() {}

    public OrderItem(Long id, Integer quantity, Double price) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}
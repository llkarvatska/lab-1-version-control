package ua.opnu.labwork21.entity;

import java.time.LocalDateTime;

public class Order {
    private Long id;
    private LocalDateTime orderDate;
    private String status;
    private Double totalAmount;

    public Order() {}

    public Order(Long id, LocalDateTime orderDate, String status, Double totalAmount) {
        this.id = id;
        this.orderDate = orderDate;
        this.status = status;
        this.totalAmount = totalAmount;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}
package com.example.testback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "orders")
@Entity
@Getter
@Setter
public class Order {

    @Id
    @Column(name = "order_id")
    private Long orderId;

    private String orderName;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> items;



}

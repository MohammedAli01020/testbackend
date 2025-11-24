package com.example.testback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "items")
@Entity
@Getter
@Setter
public class OrderItem {


    @Id
    @Column(name = "item_id")
    private Long itemId;


   private String itemName;

   private Long price;

   @ManyToOne
   @JoinColumn(name = "order_id")
   private Order order;

}

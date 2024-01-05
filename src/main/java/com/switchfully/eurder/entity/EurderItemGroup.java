package com.switchfully.eurder.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="EURDER_ITEM_GROUP")
public class EurderItemGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID")
    private Long id;
    @Column(name = "ID_ITEM")
    private Long idItem;
    @Column(name="ITEM_NAME")
    private String itemName;
    @Column(name="ITEM_PRICE")
    private double itemPrice;
    @Column(name="AMOUNT")
    private Integer amount;
    @Column(name="SHIPPING_DATE")
    private LocalDate shippingDate;

}

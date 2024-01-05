package com.switchfully.eurder.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Eurder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID")
    private Long id;
    @OneToOne
    @JoinColumn(name="ID_CUSTOMER")
    private Customer customer;
    @OneToMany(cascade = {CascadeType.PERSIST}, orphanRemoval = true)
    @JoinColumn(name="ID_EURDER")
    private List<EurderItemGroup> eurderItemGroups;
    @Column(name = "PRICE")
    private double totalPrice;

    public Eurder(Long id, String address, LocalDate eurderDate, List<EurderItemGroup> eurderItemGroups) {
    }
}

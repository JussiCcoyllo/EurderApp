package com.switchfully.eurder.dto;

import com.switchfully.eurder.entity.Customer;
import com.switchfully.eurder.entity.EurderItemGroup;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EurderDto {
    private Long id;
    private Customer customer;
    private  List<EurderItemGroup> eurderItemGroups;
    private double totalPrice;

}

package com.switchfully.eurder.dto;

import lombok.*;

import java.util.Objects;
import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer stockAmount;

}

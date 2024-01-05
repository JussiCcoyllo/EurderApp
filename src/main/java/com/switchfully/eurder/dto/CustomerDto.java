package com.switchfully.eurder.dto;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
}

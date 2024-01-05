package com.switchfully.eurder.dto;

import jakarta.validation.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class CreateEurderDto {
    @Valid
    private final List<CreateEurderItemGroupDto> createEurderItemGroupDtos;
    @NotNull
    private final LocalDate eurderDate;

}

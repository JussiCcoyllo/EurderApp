package com.switchfully.eurder.dto;



import jakarta.validation.constraints.*;
import lombok.*;

import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
public class CreateEurderItemGroupDto {
    @NotNull
    private Long id_item;
    @NotNull
    private Integer amount;

}

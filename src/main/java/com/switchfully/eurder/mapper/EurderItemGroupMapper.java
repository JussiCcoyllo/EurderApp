package com.switchfully.eurder.mapper;

import com.switchfully.eurder.entity.EurderItemGroup;
import com.switchfully.eurder.entity.Item;
import com.switchfully.eurder.dto.CreateEurderItemGroupDto;
import com.switchfully.eurder.dto.EurderItemGroupDto;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class EurderItemGroupMapper {
    public EurderItemGroupDto eurderItemToEurderLineDto(EurderItemGroup eurderItemGroup) {
        return new EurderItemGroupDto(eurderItemGroup.getId(),
                eurderItemGroup.getItemName(),
                eurderItemGroup.getItemPrice(),
                eurderItemGroup.getAmount(),
                eurderItemGroup.getShippingDate());
    }

    public CreateEurderItemGroupDto eurderLineToCreateEurderLineDto(EurderItemGroup eurderItemGroup) {
        return new CreateEurderItemGroupDto(eurderItemGroup.getId(),
                eurderItemGroup.getAmount());
    }

    public EurderItemGroup createEurderLineDtoToEurderLine(Item item, CreateEurderItemGroupDto createEurderItemGroupDto, LocalDate shippingDate) {
        return new EurderItemGroup(item.getId(),
                item.getId(),
                item.getName(),
                item.getPrice(),
                createEurderItemGroupDto.getAmount(),
                shippingDate);
    }
}

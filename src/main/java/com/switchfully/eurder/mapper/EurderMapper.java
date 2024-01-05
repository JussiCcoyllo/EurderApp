package com.switchfully.eurder.mapper;

import com.switchfully.eurder.dto.*;
import com.switchfully.eurder.entity.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.*;

@Component
public class EurderMapper {
    @Autowired
    private EurderItemGroupMapper eurderItemGroupMapper;

//    public CreateOrderDto reOrderDtoToCreateOrderDto(Order order, ReOrderDto reOrderDto) {
//        List<CreateOrderLineDto> createOrderLineDtos = order.getOrderLines().stream().map(orderLineMapper::orderLineToCreateOrderLineDto).toList();
//
//        return new CreateOrderDto(createOrderLineDtos, reOrderDto.getOrderDate());
//    }
//}
//    public CreateEurderDto mapCreateEurderDtoToEurder(Eurder eurder) {
//        List<CreateEurderItemGroupDto> createEurderItemGroupDtos = eurder.getEurderItemGroups().stream().map(eurderItemGroupMapper::eurderItemGroupToCreateEurder).toList();
//        return new Eurder(createEurderDto.getCreateEurderItemGroupDtos(), createEurderDto.getEurderDate());
//    }
//
//    public EurderDto mapOrderToOrderDto(Eurder eurder){
//        List<EurderItemGroupDto> eurderItemGroupDtos = eurder.getEurderItemGroups().stream().map(eurderItemGroupMapper::eurderLineToEurderLineDto).toList();
//        return new EurderDto(eurder.getId(), eurder.getCustomer(), eurder.getEurderItemGroups(), eurder.getTotalPrice());
//    }

}

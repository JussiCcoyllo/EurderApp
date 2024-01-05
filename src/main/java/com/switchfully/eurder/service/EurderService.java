package com.switchfully.eurder.service;

import com.switchfully.eurder.dto.*;
import com.switchfully.eurder.entity.*;
import com.switchfully.eurder.mapper.EurderItemGroupMapper;
import com.switchfully.eurder.mapper.EurderMapper;
import com.switchfully.eurder.repository.EurderRepository;
import com.switchfully.eurder.repository.ItemRepository;
import jakarta.transaction.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
@Transactional
public class EurderService {
    @Autowired
    private EurderMapper eurderMapper;
    @Autowired
    private EurderRepository eurderRepository;
    @Autowired
    private EurderItemGroupMapper eurderItemGroupMapper;
    @Autowired
    private ItemRepository itemRepository;

//    public EurderDto createOrder(Long customerId){
//        Eurder eurder = new Eurder(eurderRepository.fin(customerId));
//        eurderRepository.createEurder(eurder);
//
//        return eurderMapper.mapOrderToOrderDto(eurder);
//    }

    public Eurder createEurder(Customer customer, CreateEurderDto createEurderDto) {
        List<EurderItemGroup> eurderItemGroups = createEurderItemGroups(createEurderDto);

        return eurderRepository.save(new Eurder(customer.getId(), customer.getAddress(),createEurderDto.getEurderDate(), eurderItemGroups));
    }

    private List<EurderItemGroup> createEurderItemGroups(CreateEurderDto createEurderDto) {
        return createEurderDto.getCreateEurderItemGroupDtos()
                .stream()
                .map(createEurderItemGroupDto -> createEurderItemGroup(createEurderDto, createEurderItemGroupDto))
                .toList();
    }

    private EurderItemGroup createEurderItemGroup(CreateEurderDto createEurderDto, CreateEurderItemGroupDto createEurderItemGroupDto) {
        return null;
    }



}

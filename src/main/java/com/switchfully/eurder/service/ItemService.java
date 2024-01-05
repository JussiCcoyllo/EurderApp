package com.switchfully.eurder.service;

import com.switchfully.eurder.dto.*;
import com.switchfully.eurder.entity.*;
import com.switchfully.eurder.exception.*;
import com.switchfully.eurder.mapper.ItemMapper;
import com.switchfully.eurder.repository.ItemRepository;
import jakarta.transaction.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.*;

@Service
@Transactional
public class ItemService {
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private ItemRepository itemRepository;

    public ItemDto createItem(CreateItemDto createItemDto) {
        Item youItem = itemMapper.mapCreateItemDtoToItem(createItemDto);
        Item item = itemRepository.save(youItem);

        return itemMapper.mapItemToItemDto(item);
    }

    public ItemDto finById(Long id) throws ItemIdNotFoundException {
        Item item = itemRepository.findById(id).orElseThrow(ItemIdNotFoundException::new);

        return itemMapper.mapItemToItemDto(item);
    }

    public List<ItemDto> findAllItems() {
        return itemRepository.findAll().stream().map(item -> itemMapper.mapItemToItemDto(item)).collect(Collectors.toList());
    }
}

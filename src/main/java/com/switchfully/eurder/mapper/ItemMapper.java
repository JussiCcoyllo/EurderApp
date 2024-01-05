package com.switchfully.eurder.mapper;

import com.switchfully.eurder.entity.Item;
import com.switchfully.eurder.dto.CreateItemDto;
import com.switchfully.eurder.dto.ItemDto;
import jakarta.validation.constraints.*;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {
    public ItemDto mapItemToItemDto(Item item)  {
        return new ItemDto(item.getId(),
                            item.getName(),
                            item.getDescription(),
                            item.getPrice(),
                            item.getStockAmount());
    }

    public Item mapCreateItemDtoToItem(CreateItemDto createItemDto){
        String name = createItemDto.getName();
        return new Item(createItemDto.getName(), createItemDto.getDescription(), createItemDto.getPrice(),createItemDto.getStockAmount());

    }


}

package com.shoppingapi.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ShopDTO {

    private Long id;
    private String userIdentifier;
    private LocalDateTime dateTime;
    private Double total;
    private List<ItemDTO> items;
}

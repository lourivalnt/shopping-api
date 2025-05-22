package com.shoppingapi.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Shop {
    private Long id;
    private String userIdentifier;
    private LocalDateTime date;
    private Double total;
    private List<Item> items;
}

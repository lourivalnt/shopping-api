package com.shoppingapi.domain;

import lombok.Data;

@Data
public class Item {
    private Long id;
    private Long shopId;
    private String productIdentifier;
    private Double price;
}

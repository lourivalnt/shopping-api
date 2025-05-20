package com.shoppingapi.controller;

import com.shoppingapi.dto.ShopDTO;
import com.shoppingapi.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
@RequiredArgsConstructor
public class ShopController {

    private final ShopService shopService;

    public ResponseEntity<ShopDTO> createShop() {

}

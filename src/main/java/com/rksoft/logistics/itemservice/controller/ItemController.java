package com.rksoft.logistics.itemservice.controller;

import com.rksoft.logistics.itemservice.domain.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ItemController {
    @GetMapping("/items")
    public List<Item> getItems() {
        return Arrays.asList(new Item(101, "iphone"));
    }
}

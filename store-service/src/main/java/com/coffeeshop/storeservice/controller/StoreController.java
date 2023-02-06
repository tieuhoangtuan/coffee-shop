package com.coffeeshop.storeservice.controller;

import com.coffeeshop.storeservice.dto.StoreDto;
import com.coffeeshop.storeservice.entity.Store;
import com.coffeeshop.storeservice.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stores")
public class StoreController {
    @Autowired
    StoreService storeService;

    @PutMapping("/{storeId}")
    public void updateStore(@PathVariable Long storeId, StoreDto storeDto){
        storeService.updateStore(storeId, storeDto);
    }

    @GetMapping
    public List<Store> getAllStores(){
        return storeService.getAllStores();
    }
}

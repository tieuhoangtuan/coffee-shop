package com.coffeeshop.productservice.controller;

import com.coffeeshop.productservice.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/menus")
public class MenuController {
    @Autowired
    MenuService menuService;

    @PostMapping("/{menuId}")
    public void addProductToMenu(@PathVariable Long menuId, Long productId){
        menuService.addProductToMenu(menuId, productId);
    }
}

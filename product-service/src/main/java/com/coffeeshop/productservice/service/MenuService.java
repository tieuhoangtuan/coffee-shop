package com.coffeeshop.productservice.service;

import com.coffeeshop.productservice.entity.Menu;
import com.coffeeshop.productservice.entity.Product;
import com.coffeeshop.productservice.entity.Product_menu;
import com.coffeeshop.productservice.repository.MenuRepository;
import com.coffeeshop.productservice.repository.ProductMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    MenuRepository menuRepository;

    @Autowired
    ProductMenuRepository productMenuRepository;

    public void addProductToMenu(Long menuId, Long productId ){
        Product_menu pm = new Product_menu(productId, menuId);
        productMenuRepository.save(pm);
    }
}

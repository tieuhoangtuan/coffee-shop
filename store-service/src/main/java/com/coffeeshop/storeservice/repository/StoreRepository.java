package com.coffeeshop.storeservice.repository;

import com.coffeeshop.storeservice.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
    Store findOneById(Long id);
}

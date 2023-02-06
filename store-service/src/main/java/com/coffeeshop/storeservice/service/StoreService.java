package com.coffeeshop.storeservice.service;

import com.coffeeshop.storeservice.dto.StoreDto;
import com.coffeeshop.storeservice.entity.Store;
import com.coffeeshop.storeservice.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoreService {
    @Autowired
    StoreRepository storeRepository;

    public void updateStore(Long id, StoreDto storeDto){
       Store existedStore = storeRepository.findOneById(id);
        existedStore.setPhoneNumber(storeDto.getPhoneNumber());
        existedStore.setNumberOfQueue(storeDto.getNumberOfQueue());
        existedStore.setOpeningTime(storeDto.getOpeningTime());
        existedStore.setClosingTime(storeDto.getClosingTime());
    }

    public List<Store> getAllStores(){
        return storeRepository.findAll();
    }
}

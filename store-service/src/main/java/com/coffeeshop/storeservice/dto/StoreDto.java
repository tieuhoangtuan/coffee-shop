package com.coffeeshop.storeservice.dto;

import lombok.Data;

@Data
public class StoreDto {
    private String phoneNumber;
    private String numberOfQueue;
    private String openingTime;
    private String closingTime;
}

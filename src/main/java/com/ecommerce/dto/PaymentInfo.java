package com.ecommerce.dto;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class PaymentInfo {

    private int amount;
    private String currency;
    private String receiptEmail;
}

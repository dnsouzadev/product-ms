package br.com.productms.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private String name;
    private String description;
    private double price;
    private boolean isAvailable;
}

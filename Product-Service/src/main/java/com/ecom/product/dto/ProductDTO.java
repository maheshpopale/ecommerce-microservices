package com.ecom.product.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDTO {

    private long productId;
    private String productName;
    private String description;
    private long stock;
    private double price;
    private String image;
}

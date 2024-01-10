package com.ecom.product.converter;

import com.ecom.product.dto.ProductDTO;
import com.ecom.product.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {

    public Product convertToProduct(ProductDTO dto){
        Product product=new Product();
        product.setProductId(dto.getProductId());
        product.setProductName(dto.getProductName());
        product.setDescription(dto.getDescription());
        product.setStock(dto.getStock());
        product.setPrice(dto.getPrice());
        product.setImage(dto.getImage());
        return product;
    }

    public ProductDTO convertToDTO(Product product){
        ProductDTO dto=new ProductDTO();
        dto.setProductId(product.getProductId());
        dto.setProductName(product.getProductName());
        dto.setDescription(product.getDescription());
        dto.setStock(product.getStock());
        dto.setPrice(product.getPrice());
        dto.setImage(product.getImage());
        return dto;
    }
}

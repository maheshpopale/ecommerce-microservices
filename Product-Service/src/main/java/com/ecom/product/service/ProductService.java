package com.ecom.product.service;


import com.ecom.product.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    ProductDTO saveProduct(ProductDTO product);

    List<ProductDTO> findAll();

    ProductDTO findById(long productId);

    boolean deleteProduct(long productId);
}

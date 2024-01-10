package com.ecom.product.service;

import com.ecom.product.converter.ProductConverter;
import com.ecom.product.dto.ProductDTO;
import com.ecom.product.model.Product;
import com.ecom.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ProductConverter converter;

    @Override
    public ProductDTO saveProduct(ProductDTO product) {
        return converter.convertToDTO(productRepository.save(converter.convertToProduct(product)));

    }

    @Override
    public List<ProductDTO> findAll() {
        List<Product> products = productRepository.findAll();
        List<ProductDTO> productsList = new ArrayList<>();
        products.forEach(product -> {
            productsList.add(converter.convertToDTO(product));
        });
        return productsList;
    }

    @Override
    public ProductDTO findById(long productId) {
        return converter.convertToDTO(productRepository.findById(productId).get());
    }

    @Override
    public boolean deleteProduct(long productId) {
        Product product = productRepository.findById(productId).get();
        if (product != null) {
            productRepository.delete(product);
            return true;
        } else return false;
    }
}

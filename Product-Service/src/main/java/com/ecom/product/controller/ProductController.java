package com.ecom.product.controller;

import com.ecom.product.dto.ProductDTO;
import com.ecom.product.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products",produces = "application/json")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;
    @PostMapping
    ProductDTO saveProduct(@RequestBody ProductDTO product){
        return productService.saveProduct(product);
    }
    @GetMapping
    List<ProductDTO> findAll(){
        return productService.findAll();
    }
    @GetMapping("/{id}")
    ProductDTO findById(@PathVariable long id){
        return productService.findById(id);
    }

    @DeleteMapping("/{id}")
    boolean deleteProduct(@PathVariable long id){
        return productService.deleteProduct(id);
    }
}

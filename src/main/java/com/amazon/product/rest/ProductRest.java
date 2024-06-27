package com.amazon.product.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.product.entity.Product;
import com.amazon.product.productrequest.ProductRequest;
import com.amazon.product.service.ProductService;

@RestController
@RequestMapping("/API/Product")
public class ProductRest {
@Autowired
ProductService productservice;
@PostMapping("/addProduct")
public ResponseEntity<Product> addProduct(@RequestBody Product product) {
	Product saveproduct=productservice.addProduct(product);
	return new ResponseEntity<Product>(saveproduct,HttpStatus.CREATED);
}
}

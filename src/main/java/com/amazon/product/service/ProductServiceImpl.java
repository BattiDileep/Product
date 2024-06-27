package com.amazon.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.amazon.product.entity.Product;
import com.amazon.product.productrequest.ProductRequest;
import com.amazon.product.productresponse.ProductResponse;
import com.amazon.product.repo.ProductRepo;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepo productrepo;

	@Override
	public Product addProduct(Product product) {
		Product saveproduct=productrepo.save(product);
		return product;
	}

	


}
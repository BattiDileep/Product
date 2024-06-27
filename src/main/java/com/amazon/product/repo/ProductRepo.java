package com.amazon.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amazon.product.entity.Product;
import com.amazon.product.productrequest.ProductRequest;
@Repository

public interface ProductRepo extends JpaRepository<Product, Long>{

	Product save(ProductRequest request);

	

}

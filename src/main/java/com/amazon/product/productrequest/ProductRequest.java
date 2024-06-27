package com.amazon.product.productrequest;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductRequest {
	@Id
	@GeneratedValue
	private Long productId;
	private String productName;
	private Long productQty;
	private String productStatus;

}

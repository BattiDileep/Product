package com.amazon.product;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mockitoSession;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.session.MockitoSessionBuilder;
import org.springframework.boot.test.context.SpringBootTest;

import com.amazon.product.entity.Product;
import com.amazon.product.repo.ProductRepo;
import com.amazon.product.service.ProductService;

@SpringBootTest
class Product2ApplicationTests {
@Test
	public void addProductTest_01() {
		ProductRepo mockrepo=Mockito.mock(ProductRepo.class);
		
		Product p=new Product();
		p.setProductId((long) 10);
		p.setProductName("mobile");
		p.setProductQty((long) 10);
		p.setProductStatus("succuss");
		
		
		Mockito.when(mockrepo.save(p)).thenReturn(p);
		assertNotNull(p);
		
		}
			
	
	

}

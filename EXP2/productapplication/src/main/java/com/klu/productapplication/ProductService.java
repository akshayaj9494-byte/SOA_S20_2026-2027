package com.klu.productapplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProductService {
	@Autowired
	ProductRepo pr;
	public void insertproduct(@RequestBody Product p) {
		pr.save(p);
		
	}
	public List<Product> retrieveProduct() {
		 return pr.findAll();
		
	}

}

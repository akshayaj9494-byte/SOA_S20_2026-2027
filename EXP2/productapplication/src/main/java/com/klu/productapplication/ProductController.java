package com.klu.productapplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
@Autowired
ProductService ps;
@PostMapping("/insert")
public void insertproduct(@RequestBody Product p) {
	ps.insertproduct(p);
}
@GetMapping("/retrieve")
public List<Product> retrieveProduct() {
	 return ps.retrieveProduct();
}
}

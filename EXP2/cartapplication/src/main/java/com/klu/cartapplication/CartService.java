package com.klu.cartapplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
	
	@Autowired
	CartRepo cr;
	public void insertCart(Cart c) {
		cr.save(c);
	}
	
public List<Cart> retrieveCart()
{
		return cr.findAll();
	}
	
}
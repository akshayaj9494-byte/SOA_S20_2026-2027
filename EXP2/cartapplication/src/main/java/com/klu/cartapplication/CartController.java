package com.klu.cartapplication;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carts")
public class CartController {

	@Autowired
	CartService cs;
	
	    @PostMapping("/insert")
		public void insertCart(@RequestBody Cart c) {
			cs.insertCart(c);
		}
	    @GetMapping("/retrieve")
	    public List<Cart> retrieveCart(){
	    	return cs.retrieveCart();
	    }

}

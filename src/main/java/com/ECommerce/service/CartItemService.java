package com.ECommerce.service;


import com.ECommerce.Dtos.CartDTO;
import com.ECommerce.Entity.CartItem;

public interface CartItemService {
	
	public CartItem createItemforCart(CartDTO cartdto);
	
}

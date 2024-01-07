package com.ECommerce.repository;

import com.ECommerce.Entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartItemDao extends JpaRepository<CartItem, Integer>{

}

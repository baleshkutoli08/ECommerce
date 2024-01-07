package com.ECommerce.repository;

import java.util.Optional;

import com.ECommerce.Entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;



public interface SellerDao extends JpaRepository<Seller, Integer> {
	
	Optional<Seller> findByMobile(String mobile);
	
}

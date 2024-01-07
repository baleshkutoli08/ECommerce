package com.ECommerce.repository;

import com.ECommerce.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AddressDao extends JpaRepository<Address, Integer>{

}

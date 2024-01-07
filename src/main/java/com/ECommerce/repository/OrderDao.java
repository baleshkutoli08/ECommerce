package com.ECommerce.repository;

import java.time.LocalDate;
import java.util.List;

import com.ECommerce.Entity.Customer;
import com.ECommerce.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface OrderDao extends JpaRepository<Order, Integer> {
	public List<Order> findByDate(LocalDate date);
	
//	@Query("select c.orders from Customer c where c.customerId = customerId")
//	public List<Order> getListOfOrdersByCustomerid(@Param("customerId") Integer customerId);
	
	@Query("select c from Customer c where c.customerId = customerId")
	public Customer getCustomerByOrderid(@Param("customerId") Integer customerId);
	
//	public List<Product> getListOfProductsByOrderId(Integer OrderId);
	


//	@Query("update Order o set o.orderStatus =OrderStatusValues.CANCELLED WHERE o.OrderId=OrderId ")
//	public Order CancelOrderByOrderId(@Param("OrderId") Integer OrderId);

	
}

package com.ECommerce.service;

import com.ECommerce.Dtos.CustomerDTO;
import com.ECommerce.Dtos.CustomerUpdateDTO;
import com.ECommerce.Dtos.SessionDTO;
import com.ECommerce.Entity.Address;
import com.ECommerce.Entity.CreditCard;
import com.ECommerce.Entity.Customer;
import com.ECommerce.Entity.Order;
import com.ECommerce.exception.CustomerException;
import com.ECommerce.exception.CustomerNotFoundException;

import java.util.List;



public interface CustomerService {
	
	public Customer addCustomer(Customer customer) throws CustomerException;
	
	public Customer getLoggedInCustomerDetails(String token) throws CustomerNotFoundException;
	
	public List<Customer> getAllCustomers(String token) throws CustomerNotFoundException;
	
	public Customer updateCustomer(CustomerUpdateDTO customer, String token) throws CustomerNotFoundException;
	
	public Customer updateCustomerMobileNoOrEmailId(CustomerUpdateDTO customerUpdateDTO, String token) throws CustomerNotFoundException;
	
	public Customer updateCreditCardDetails(String token, CreditCard card) throws CustomerException;
	
	public SessionDTO updateCustomerPassword(CustomerDTO customerDTO, String token) throws CustomerNotFoundException;
	
	public SessionDTO deleteCustomer(CustomerDTO customerDTO, String token) throws CustomerNotFoundException;
	
	public Customer updateAddress(Address address, String type, String token) throws CustomerException;
	
	public Customer deleteAddress(String type, String token) throws CustomerException, CustomerNotFoundException;

	public List<Order> getCustomerOrders(String token) throws CustomerException;

}

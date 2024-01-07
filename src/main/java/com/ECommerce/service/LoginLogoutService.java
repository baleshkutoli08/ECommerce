package com.ECommerce.service;


import com.ECommerce.Dtos.CustomerDTO;
import com.ECommerce.Dtos.SellerDTO;
import com.ECommerce.Dtos.SessionDTO;
import com.ECommerce.Entity.UserSession;

public interface LoginLogoutService {
	
	public UserSession loginCustomer(CustomerDTO customer);
	
	public SessionDTO logoutCustomer(SessionDTO session);
	
	public void checkTokenStatus(String token);
	
	public void deleteExpiredTokens();
	
	
	public UserSession loginSeller(SellerDTO seller);
	
	public SessionDTO logoutSeller(SessionDTO session);
	
	
}

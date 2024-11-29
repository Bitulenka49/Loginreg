package com.ecom.services;

import com.ecom.entities.User;

public interface UserService 
{
	public boolean registerUser(User user);
	public User loginUser(String email, String password);

}

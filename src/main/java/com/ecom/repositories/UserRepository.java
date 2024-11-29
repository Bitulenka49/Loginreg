package com.ecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
   User	findByEmail(String email);

}

package net.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.springboot.dto.UserRegistrationDto;
import net.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}

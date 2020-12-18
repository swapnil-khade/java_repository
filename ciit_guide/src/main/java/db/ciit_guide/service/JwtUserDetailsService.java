package db.ciit_guide.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import db.ciit_guide.model.UserModel;
import db.ciit_guide.repository.IUserRepository;
@Service
public class JwtUserDetailsService implements UserDetailsService{
	
	@Autowired
	private IUserRepository userDao;
	
	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserModel user=userDao.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),new ArrayList<>());	
	}
	
	public String save(UserModel user) {
		
		UserModel newUser=new UserModel();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		userDao.save(newUser);
		return "User added successfully";
	}
	

}

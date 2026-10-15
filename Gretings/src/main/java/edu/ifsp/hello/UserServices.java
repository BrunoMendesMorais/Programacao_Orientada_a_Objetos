package edu.ifsp.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServices {
	List<User> lista= new ArrayList();
	
	public List<User> getAllUsers(){
		return lista;
	}
	
	public User getUserById(int id){
		for(User u:lista) {
			if(id == u.getId()) {
				return u;
			}
		}
		return null;
	}
	public User createUser(User user) {
		lista.add(user);
		return user;
	}
	public User updateUser(User user) {
		User u=getUserById(user.getId());
		if(u!=null) {
			u.setName(user.getName());
			return u;
		}
		return null;
	}
	
	public User deleteUser(User user) {
		User u=getUserById(user.getId());
		if(u!=null) {
			lista.remove(u);
			u.setId(-1);
			return u;
		}
		return null;
	}
	
	public User deleteUserById(int id) {
		User u=getUserById(id);
		if(u!=null) {
			lista.remove(u);
			u.setId(-1);
			return u;
		}
		return null;
	}
	
}

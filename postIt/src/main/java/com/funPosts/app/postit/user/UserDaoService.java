package com.funPosts.app.postit.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users= new ArrayList<>();
	
	private static int count=0;
	static {
		users.add(new User(++count,"Vibhuti",LocalDate.now().minusYears(30)));
		users.add(new User(++count,"Ranjan",LocalDate.now().minusYears(28)));
		users.add(new User(++count,"Pooja",LocalDate.now().minusYears(27)));

	}
	
	public List<User> findAll(){
		return users;
		
	}
	
	public User findOne(int id) {
		
		Predicate<? super User> predicate = user -> user.getId().equals(id); 
		
		return users.stream().filter(predicate).findFirst().orElse(null);
	}

	public void deleteById(int id) {
		
	
			Predicate<? super User> predicate = user -> user.getId().equals(id); 
			users.removeIf(predicate);

	}
	
	public User save(User user) {

		user.setId(++count);
		users.add(user);
		
		return user;
		
	}
}

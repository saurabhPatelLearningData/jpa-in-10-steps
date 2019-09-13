package com.javaLearning.jpa.jpain10steps;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.javaLearning.jpa.jpain10steps.entity.User;
import com.javaLearning.jpa.jpain10steps.entity.service.UserDAOService;
import com.javaLearning.jpa.jpain10steps.entity.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	private static final Logger log =LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User user = new User("Patel", "Admin");
		
		userRepository.save(user);
		
		Optional<User> userById = userRepository.findById(1L);
		
		log.info("User retrieved : "+userById);
		
		List<User> users = userRepository.findAll();
		log.info("All User list : "+users);

	}

}

package com.imcs.krishna.feb_springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${helloString}")
	private String valueFrom;
	
	@RequestMapping(method=RequestMethod.GET,value="/hello")
	public String sayHello(@RequestParam(name="name") String name) {
		return "Hello Mr. "+ name;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/users", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAllUsers() {
		  List<User> users=  new ArrayList<>();
		  User user= new User();
		  user.setFirstName("Rama");
		  user.setLastName("Krishna");
		  
		  User user1= new User();
		  user1.setFirstName("Ronish");
		  user1.setLastName("Panjwani");
		  
		  
		  users.add(user);
		  users.add(user1);
		
		return users ;
	}
	
	

}

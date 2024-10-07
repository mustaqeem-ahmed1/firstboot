package org.jsp.firstboot;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{

	//@ResponseBody
	@RequestMapping("/hi")	//to access the parameter.
	public String hi()
	{
		System.out.println("HomeController.hi()");
		return "Hi from HomeController...";
	}

	//@ResponseBody  //if its not there, ur getting a response but its not representable.
	@RequestMapping("/hello")
	public String hello()
	{
		//System.out.println("hello from HomeController class");
		return "hello from HomeController...";
	}

//	//@ResponseBody
//	@RequestMapping("/save")
//	public String saveUser(@RequestParam int id, @RequestParam String name, @RequestParam String email,  @RequestParam long phone, @RequestParam String password)
//	{
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(email);
//		System.out.println(phone);
//		System.out.println(password);
//		
//		User u = new User();
//		return u;
//		
////		return "User saved successfully...";
//	}
	
	@RequestMapping("/save")
	public String saveUser(@RequestBody User user)	//client sends body (object) we have to catch it.
	{
		return user;
		
	}
	

	//no need to give
	@RequestMapping("/findall")
	public String findallUser()
	{
		return "All Users found successfully...";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password)	//accepting 2 parameters name and password.
	{
		System.out.println(username);
		System.out.println(password);
		return "Login Successfull...";
	}

	@RequestMapping("/find")
	public Person findPerson(@RequestBody Person p)	//client sends object so to catch it we use @RequestBody.
	{
		return p;	//catching it by @RequestBody and throw it by return.
	}
}

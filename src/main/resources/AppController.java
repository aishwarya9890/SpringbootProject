package com.example.AjaxExample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


 @Controller
  public class AppController {
 
	 //@CrossOrigin(origins = "http://localhost:8080")
  @RequestMapping(method = RequestMethod.GET, value = "/") 
  public String geMessage() {
  
  return "doc"; 
  
  }
	 
 
	// @CrossOrigin(origins = "http://localhost:8080")
	  @RequestMapping(method = RequestMethod.GET, value = "/aaa") 
	  public String geJson() {
	  
	  return "a"; 
	  
	  }
	  
	 @GetMapping("/employee")
	 public String getButton() {
		// TODO Auto-generated method stub
		 return "Employee";
	}
	 
	 @GetMapping("/details")
	 public String getDetails() {
		// TODO Auto-generated method stub
		 return "aaa";
	}
 
 }
 
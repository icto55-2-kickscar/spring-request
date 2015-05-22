package com.sds.icto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( "/user/*" )
public class UserController3 {
	@RequestMapping
	@ResponseBody
	public String add3() { 
		return "add3()";
	} 

	@RequestMapping
	@ResponseBody
	 public String edit3() {
		return "edit3()";
	}	  
}

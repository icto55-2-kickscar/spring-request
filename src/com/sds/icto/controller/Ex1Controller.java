package com.sds.icto.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex1Controller {
	
	  @RequestMapping( "/hello" )
	  @ResponseBody
	  public String hello() {
		  return "Ex1Controller:hello()";
	  } 
	                
	  @RequestMapping( "/main" )
	  //@ResponseBody
	  public void main( HttpServletResponse response ) {
		  try {
			  PrintWriter out = response.getWriter();
			  out.println( "main()" );
		  } catch(IOException ex ) {
			  ex.printStackTrace();
		  }
	  }
}

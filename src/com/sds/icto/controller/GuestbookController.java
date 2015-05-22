package com.sds.icto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping( "/guestbook" )
public class GuestbookController {

	@RequestMapping( "/list" )
	public String list( ) {
		return "/views/guestbook/index.jsp";
	}
	
	@RequestMapping( "/insert2" )
	public ModelAndView insert2( GuestbookVo vo ) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject( "guestbook", vo );
		mav.setViewName( "/views/guestbook/info.jsp" );
		
		return mav;
	}
	
	@RequestMapping( "/insert" )
	public String insert( 
		//@RequestParam( "n" ) String name, 
		//@RequestParam( "pwd" ) String password,
		//@RequestParam String content
			
		//@ModelAttribute GuestbookVo vo
		
		GuestbookVo vo,
		Model model
		) {
		
		//model.addAttribute( vo );
		//model.addAttribute( "vo", vo );
		model.addAttribute( "guestbook", vo );
		
		return "/views/guestbook/info.jsp";
	}
	
	@RequestMapping( value="/delete/{no}", method=RequestMethod.POST )
	public String delete( @PathVariable Long no ) {
		return "GuestbookController:delete(" + no + ")";
	}
	
	@RequestMapping( value="/delete/{no}", method=RequestMethod.GET  )
	public String deleteForm( @PathVariable Long no ) {
		return "GuestbookController:delete(" + no + ")";
	}
	
}

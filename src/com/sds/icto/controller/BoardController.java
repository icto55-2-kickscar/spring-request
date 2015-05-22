package com.sds.icto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( "/board" )
public class BoardController {
	
	@RequestMapping( "/view" )
	@ResponseBody
	public String view( @RequestParam( value="no", defaultValue="10" ) int no ) {
		return "BoardController:view( "  + no + " )";
	}
	
	@RequestMapping( "/view2" )
	@ResponseBody
	public String view2( @RequestParam( "n" ) int no ) {
		return "BoardController:view( "  + no + " )";
	}
	
	@RequestMapping( "/view3/{no}" )
	@ResponseBody
	public String view3( @PathVariable int no ) {
		return "BoardController:view( "  + no + " )";
	}		
}

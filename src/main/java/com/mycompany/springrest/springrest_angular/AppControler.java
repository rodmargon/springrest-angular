package com.mycompany.springrest.springrest_angular;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppControler {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	String home(){
		return "index";
	}

}

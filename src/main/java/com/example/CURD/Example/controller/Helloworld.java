package com.example.CURD.Example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//@RestController
@Controller
@RequestMapping("/")
public class Helloworld {
	
	//@RequestMapping("hello")
@RequestMapping(value="helloworld",method=RequestMethod.GET)
	public String Helloworld()
	{
		return "Helloworld";
	}

}

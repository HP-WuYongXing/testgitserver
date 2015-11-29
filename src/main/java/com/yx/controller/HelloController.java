package com.yx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/hello", method=RequestMethod.GET)
	@ResponseBody
	public String hello(){
		System.out.println("in hello.....");
		ModelAndView mv = new ModelAndView();
		mv.addObject("spring","spring mvc");
		mv.setViewName("hello");
		return "this is a json test";
	}
}

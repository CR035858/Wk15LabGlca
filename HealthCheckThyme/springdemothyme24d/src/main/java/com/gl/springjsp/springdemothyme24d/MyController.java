package com.gl.springjsp.springdemothyme24d;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class MyController {
	
	@RequestMapping("/hello")
	public String sayHello(Model model)
	{
		model.addAttribute("greeting", "Hi welcome to Thymeleaf ");
		return "welcome";
	}

}

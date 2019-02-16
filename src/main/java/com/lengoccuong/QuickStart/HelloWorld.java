package com.lengoccuong.QuickStart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	
	@RequestMapping("/")
	public String viewIndex(ModelMap map) {
		
		map.addAttribute("msg", "Xin chao hello123");
		
		
		return "hello";
	}

}

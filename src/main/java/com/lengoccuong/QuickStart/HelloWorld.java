package com.lengoccuong.QuickStart;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
	
	@RequestMapping("/")
	public String viewIndex(ModelMap map) {
		
		map.addAttribute("msg", "Xin chao hello123");
		
		
		return "hello";
	}
	
	@RequestMapping("/say-hello")
	public ModelAndView viewHello(HttpServletRequest request,HttpServletResponse response,HttpSession session
			, @RequestParam(name="user",required=true) String username,
				@RequestHeader(name="Accept",required=false) String content_type) {
		
		
		request.setAttribute("msg", username);
		request.setAttribute("content_type", content_type);
		
		return new ModelAndView("say-hello");
	}

}

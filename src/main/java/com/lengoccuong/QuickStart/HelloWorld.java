package com.lengoccuong.QuickStart;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lengoccuong.model.User;

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
	
	 @RequestMapping(value="/hello", method=RequestMethod.GET)
     public String welcomeName(HttpServletRequest request) {
		 User user = new User();
		 user.setName("Spring hahaha");
		 

		request.setAttribute("msg", user.getName());
        return "comtom";

     }
	 @RequestMapping(value="/add-user", method=RequestMethod.GET)
     public String addUser(HttpServletRequest request) {
		 User user = new User();
		 user.setName("String MVC");
		 request.setAttribute("user", user);
        return "add_user";

     }
	 @RequestMapping(value="/them-user", method=RequestMethod.POST)
     public String addUser(HttpServletRequest request,
    		 @ModelAttribute("user") User user
    		 ) {
		 request.setAttribute("user", user);
        return "done_user";

     }

}

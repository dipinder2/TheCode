package com.dipinder.thecode;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	
	@RequestMapping("/code")
	public String code(HttpSession session) {
		if(session.getAttribute("bushido")!=null 
				&& 
	session.getAttribute("bushido").equals("bushido")) {
			return "code.jsp";	
		}
		else {
			return "redirect:/";
		}
	}
	
	@RequestMapping(value = "/postcode", method = RequestMethod.POST)
	public String postCode(
			@RequestParam(value="code") String code,
			RedirectAttributes redirectAttributes,
			HttpSession session
			) {
		if (code.equals("bushido")) {
			session.setAttribute("bushido", "bushido");
			return "redirect:/code";
		}
		redirectAttributes.addFlashAttribute("err","not bushido bro");
		return "redirect:/";
	}
	
}

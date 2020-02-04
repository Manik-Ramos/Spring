package com.legitboss.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloWorldController {
	
	@RequestMapping("displayForm")
	public String displayForm() {
		return "display-form";
	}
	
	@RequestMapping("processForm")
	public String processForm() {
		return "process-form";
	}
		
	@RequestMapping("processFormData") 
	public String changeCase(HttpServletRequest request, Model model) {
		String inputName = request.getParameter("name");
		String result = "Hey "+inputName.toUpperCase();
		model.addAttribute("result", result);
		
		return "process-form";
	}
	
	@RequestMapping("manipulateFormDataUsingRequestParam") 
	public String printNameFiveTimes(@RequestParam("name") String name,	Model model) {
		String inputName = name;
		String result = "";
		for(int i=0;i<5;i++) {
			result = result +"-"+name;
		}
		model.addAttribute("result", result);
		
		return "process-form";
	}
		
}

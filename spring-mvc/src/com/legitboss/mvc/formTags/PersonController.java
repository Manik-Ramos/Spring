package com.legitboss.mvc.formTags;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("person")
public class PersonController {

	@RequestMapping("displayPersonEnrollmentForm")
	public String showEnrollmentForm(Model model){
		model.addAttribute("person", new Person());
		return "person-form";
	}
	
	@RequestMapping("home")
	public String home(@ModelAttribute("person") Person person, Model model){
		return "person-home";
	}
}

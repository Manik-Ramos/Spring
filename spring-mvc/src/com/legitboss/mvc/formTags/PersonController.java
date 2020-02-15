package com.legitboss.mvc.formTags;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("person")
public class PersonController {
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true); //true to trim the string to null if empty string is given as input
		webDataBinder.registerCustomEditor(String.class, editor);
	}
	
	@RequestMapping("displayPersonEnrollmentForm")
	public String showEnrollmentForm(Model model){
		model.addAttribute("person", new Person());
		return "person-form";
	}
	
	@RequestMapping("processForm")
	public String processForm(@Valid @ModelAttribute("person") Person person, BindingResult bindRes,Model model ){
		if(bindRes.hasErrors()) {
			return "person-form";
		} else {
			return "person-home";
		}
	}
	
}

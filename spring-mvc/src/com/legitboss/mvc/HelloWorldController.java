package com.legitboss.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("displayForm")
	public String displayForm() {
		return "display-form";
	}
	
	@RequestMapping("processForm")
	public String processForm() {
		return "process-form";
	}
}

package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class democontroller {

	@RequestMapping("/cicd")
	@ResponseBody
	public String func() {
		return " Spring application CI/CD using Jenkins";
	}
}

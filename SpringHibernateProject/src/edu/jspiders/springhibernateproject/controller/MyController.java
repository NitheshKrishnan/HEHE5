package edu.jspiders.springhibernateproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.jspiders.springhibernateproject.dto.Employee;

@Controller
public class MyController 
{
	@RequestMapping("/")
	public String getIndexPage()
	{
		return "index";
	}
	@RequestMapping("/register")
	public String getRegisterPage(Model myModel)
	{
		Employee emp = new Employee();
		
		myModel.addAttribute("employee", emp);
		
		System.out.println(emp);
		
		return "register";
	}
	
	@RequestMapping("/signup")
	public String SignUpLogic(@ModelAttribute("employee")Employee emp)
	{
		System.out.println(emp);
		
		return "redirect:/";
	}
}
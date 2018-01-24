package com.ojas.mvc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ojas.dao.Daocls;

@Controller
public class Controllercls {
	@Autowired
	private Daocls dao;
	
	/*@RequestMapping("/hai")
	public ModelAndView Hai() {
		String message="Hai .......";
		return new ModelAndView("hello","message",message);
	}*/
	@RequestMapping("/login")
	public ModelAndView logindisplay(HttpServletRequest request,HttpServletResponse response) {
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		String message="hello "+userName;		
		if(password.equals("Radha")) {
			return new ModelAndView("hello","message",message);
		}
		else
			message="sorry :( you are not valid user";
			return new ModelAndView("error","message",message);
	}

}

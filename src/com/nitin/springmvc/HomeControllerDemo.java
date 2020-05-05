package com.nitin.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllerDemo {


	// need a controller method to show the initial HTML form
	@RequestMapping("/displayForm")
	public String displayForm()
	{
	return "demoForm";

		}
	// need a controller method to process the HTML form
	@RequestMapping("/ProccessForm")
	public String proceesFrom() {
		return "HelloWorld";
		
	}
	// new a controller method to read form data and
		// add data to the model
	@RequestMapping("/ProccessFormTwo")
	public String LetAddtoModel(HttpServletRequest request, Model model ){

		// read the request parameter from the HTML form
		String rName=request.getParameter("StudentName");

		// convert the data to all caps
		rName=rName.toUpperCase();
		// create the message
		
		String result="YO"+ rName;
		//Add mesg to model
		model.addAttribute("message", result);
		return "HelloWorld";
	}
}


package com.codingdojo.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/date") 
		public String date(Model model) {
			Date myDate = new Date();
			String str = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, YYYY", Locale.ENGLISH).format(myDate);
			model.addAttribute("date", str);
			System.out.println(str);
			return "dateTemplate.jsp";
	}
	
	@RequestMapping("/time")
		public String time(Model model) {
//		LocalTime localTime = LocalTime.now();
//		LocalDateTime localDateTime = LocalDateTime.now();
//		localTime = localDateTime.toLocalTime();
		Calendar cal = Calendar.getInstance();
		Date localTime = cal.getTime();
		String str = new SimpleDateFormat("hh:mm aa").format(localTime);
		model.addAttribute("time", str);
		System.out.println(localTime);
		return "timeTemplate.jsp";
	}
}

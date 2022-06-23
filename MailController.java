package com.example.demo.layer5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer4.MailService;


@RestController
@RequestMapping("/mail") // http://localhost:8080/mail/send/
public class MailController {
	
	@Autowired
	MailService mailService;
	
	@RequestMapping("/send/{email}")
	public String sendEmailTo(@PathVariable("email") String emailTo) {
		System.out.println("/send to "+emailTo);
		mailService.sendMail("Welcome to our Bank", emailTo);
		return "email sent";
	}
}

package com.example.demo.layer4;

import org.springframework.stereotype.Service;

@Service
public interface MailService {
	public void sendMail(String info, String email);
}

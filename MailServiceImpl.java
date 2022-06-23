package com.example.demo.layer4;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
class Emp { 
	void fun() { }
}
class Executive extends Emp {
	void fun() { 
	
	}
}
/*class Tree {
	Egg e = new Egg();
	class Nest {
		Egg e = new Egg();
		class Egg{ }
	}
}*/

@Service
public class MailServiceImpl implements MailService {
	
	
			
	
	
			
	
	
	@Override			//welcome/thank you for applying
	public void sendMail(String info, String emailTo) { //abhinav@gmail.com
		
		String fromEmail="vishalviniing@gmail.com";
		String password="svvrqlzsezqqwfpf";
		
		String host="smtp.gmail.com";
		Properties props = new Properties(); //key + value
		props.put("mail.smtp.auth","true");
		props.put("mail.smtp.starttls.enable","true");
		props.put("mail.smtp.host",host);
		props.put("mail.smtp.port","587");
		
Session session = 
      Session.getDefaultInstance(
    		  
    		  props,
    		  
				new javax.mail.Authenticator() 
    		    {
					protected PasswordAuthentication getPasswordAuthentication() 
					{
						return new PasswordAuthentication(fromEmail,password);
					}
				}
		);
		//192.168.0.122
		try
		{
			MimeMessage message= new MimeMessage(session);//gmail+myEmail+password token
			message.setFrom(new InternetAddress(fromEmail));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
			message.setSubject("Message From SBI");
			message.setText(info);
			
			try {
				Transport.send(message);
				System.out.println("message sent successfully...");
			}
			catch(Exception e) {
				System.out.println("NETWORK Error");
				System.out.println("Please check your network connection");
			}
		}
		catch(MessagingException e) {
			e.printStackTrace();
		}
	}

}

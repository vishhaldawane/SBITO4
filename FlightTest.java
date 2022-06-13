package com.sbi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class FlightTest {
	public static void main(String[] args) {
	
		Flight theFlight = new Flight();
		
		Class theClass = theFlight.getClass();
		
		Constructor ctors[] = theClass.getConstructors();
		
		for (Constructor constructor : ctors) {
			System.out.println("Constructor : with "+constructor.getParameterCount()+" arguments. ");
		}
		
		System.out.println("---------------------");
		
		Method methods[] = theClass.getMethods();
		for (Method method : methods) {
			System.out.println("method name is : "+method.getName());
		}
		System.out.println("---------------------");
		
		Field fields[] = theClass.getFields();
		for (Field field : fields) {
			System.out.println("Field is : "+field.getName());
		}
		
		System.out.println("-----------------");
		
		Annotation anno [] = theClass.getAnnotations();
		
		for (Annotation annotation : anno) {
			System.out.println("Annotation is : "+annotation);
			if(annotation instanceof DevelopedBy) {
				DevelopedBy db = (DevelopedBy) annotation;
				String developer = db.name();
				double version=db.version();
				
				if(developer.equals("vinay") && version ==1.3) {
					System.out.println("Class Flight is valid..lets run...");
				}
				else {
					System.out.println("Class Flight is invalid...lets stop...");
				}
			}
		}
		
	}
}




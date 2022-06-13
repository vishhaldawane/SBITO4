package com.sbi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import static java.lang.System.err;


public class FlightTest {
	public static void main(String[] args) {
	
		//Class theClass1 = Flight.class;
		
		Flight theFlight = new Flight();
		Object t = theFlight;
		
		Class theClass = theFlight.getClass();
		
		Constructor ctors[] = theClass.getConstructors();
		
		for (Constructor constructor : ctors) {
			System.out.println("Constructor : with "+constructor.getParameterCount()+" arguments. ");
		}
		
		System.out.println("---------------------");
		
		Method methods[] = theClass.getMethods();
		for (Method method : methods) {
			System.out.println("method name is : "+method.getName());
			Parameter paras[] = method.getParameters();
			for (Parameter para : paras) {
				System.out.println("-> parameter : "+para.getName()+" type "+para.getType().getCanonicalName());
				
				if(para.getType().getCanonicalName().equals("com.sbi.Scope")) {
					Scope sc = new Scope();
					try {
						System.out.println(">>Invoking....");
						method.invoke(t, sc);
						System.out.println(">>Invoked....");
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException x) {
						// TODO Auto-generated catch block
						x.printStackTrace();
						 Throwable cause = x.getCause();
						    err.format("invocation of %s failed: %s%n",
							       method.getName(), cause.getMessage());
					}
				}
			}
			
			
			Annotation methodAnno[] = method.getAnnotations();
			for (Annotation methodAnn : methodAnno) {
				System.out.println("Method Annotation : "+methodAnn);
				if(methodAnn instanceof DefinedBy) {
					DefinedBy defBy = (DefinedBy) methodAnn;
				}
			}
			
		}
		System.out.println("---------------------");
		
		Field fields[] = theClass.getFields();
		for (Field field : fields) {
			System.out.println("Field is : "+field.getName());
			Annotation fieldAnno[] = field.getAnnotations();
			for (Annotation fieldAnn : fieldAnno) {
				System.out.println("Field Annotation : "+fieldAnn);
			}
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




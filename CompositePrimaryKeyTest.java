package composite;

import org.junit.jupiter.api.Test;

import bank.dao.BaseDAO;
import bank.dao.BaseDAOImpl;

public class CompositePrimaryKeyTest {
	
	@Test
	public void testCase1() {
		BaseDAO dao = new BaseDAOImpl();
		Student stud1= new Student(
				new Student.StudentID("X", "A", 1),"Jack",15);
		
		Student stud2= new Student(
				new Student.StudentID("X", "A", 1),"Jane",16);
		
		Student stud3= new Student(
				new Student.StudentID("XI", "A", 1),"Jill",17);
		
		Student stud4= new Student(
				new Student.StudentID("XI", "A", 2),"Julie",18);
		
		Student stud5= new Student(
				new Student.StudentID("X", "B", 1),"Robert",19);
		
		dao.merge(stud1);
		dao.merge(stud2);
		dao.merge(stud3);
		dao.merge(stud4);
		dao.merge(stud5);
	}
	
	@Test
	public void testCase2() {
		BaseDAO dao = new BaseDAOImpl();
		
		Student stu = dao.find(Student.class, new Student.StudentID("X", "B", 1));
		System.out.println("student name : "+stu.getName());
		System.out.println("student age  : "+stu.getAge());
		
	}
}

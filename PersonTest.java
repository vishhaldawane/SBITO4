
public class PersonTest {
	public static void main(String[] args) {
		
		Person personObj = new Person('F', 22, "Jane");
		personObj.printPerson();
		System.out.println("---------------");
		//System.out.println("personObj : "+personObj);
		
		Student studentObj = new Student('M', 23, "Robert",34,"Bharati VidyaPeeth","EEE");
		studentObj.printStudent();
		System.out.println("---------------");
		//System.out.println("studentObj : "+studentObj);
		
		Employee employeeObj = new Employee('F', 25, "Janet",38,"Thakur College","IIIT", 1234, "JP Morgan", "Developer", 345000);
		employeeObj.printEmployee();
		System.out.println("---------------");
		
		//System.out.println("employeeObj : "+employeeObj);
	}
}

class Person
{
	private char gender;
	private int age;
	private String name;
	
	public Person(char gender, int age, String name) {
		super();
		this.gender = gender;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [gender=" + gender + ", age=" + age + ", name=" + name + "]";
	}
	void printPerson() {
		System.out.println("GENDER : "+gender);
		System.out.println("Age    : "+age);
		System.out.println("NAME   : "+name);
	}
}

class Student extends Person
{
	private int rollNumber;
	private String collegeName;
	private String streamName;
	
	public Student(char gender, int age, String name, int rollNumber, String collegeName, String streamName) {
		super(gender, age, name);
		this.rollNumber = rollNumber;
		this.collegeName = collegeName;
		this.streamName = streamName;
	}

	void printStudent() {
		super.printPerson();
		System.out.println("ROLL   : "+rollNumber);
		System.out.println("COLLEGE: "+collegeName);
		System.out.println("Stream : "+streamName);
	}
	@Override
	public String toString() {
		return "Student [toString()=" + super.toString() + ", rollNumber=" + rollNumber + ", collegeName=" + collegeName
				+ ", streamName=" + streamName + "]";
	}

}

class Employee extends Student
{
	private int employeeNumber;
	private String companyName;
	private String designation;
	private double basicSalary;
	
	public Employee(char gender, int age, String name, int rollNumber, String collegeName, String streamName,
			int employeeNumber, String companyName, String designation, double basicSalary) {
		super(gender, age, name, rollNumber, collegeName, streamName);
		this.employeeNumber = employeeNumber;
		this.companyName = companyName;
		this.designation = designation;
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "Employee [toString()=" + super.toString() + ", employeeNumber=" + employeeNumber + ", companyName="
				+ companyName + ", designation=" + designation + ", basicSalary=" + basicSalary + "]";
	}
	
	void printEmployee() {
		super.printStudent();
		System.out.println("EMPNO  : "+employeeNumber);
		System.out.println("COMPANY: "+companyName);
		System.out.println("DESG   : "+designation);
		System.out.println("SALARY : "+basicSalary);
	}
}




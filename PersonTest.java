
public class PersonTest {
	public static void main(String[] args) {
		
		Person personObj = new Person('F', 22, "Jane");
		personObj.printPerson();
		System.out.println("---------------");
		
		Person personObj1 = new Person('F', 65, "Putin", "Shanti Mahal", "Peace Road", "Shanti Nagar", "Prashant", "Heaven", 999999);
		personObj1.printPerson();
		
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

class Address
{
	String area;	String street;	String city;
	String state;	String country;	int pin;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}


	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	void printAddress() {
		System.out.println("AREA   : "+area);
		System.out.println("STREET : "+street);
		System.out.println("CITY   : "+city);
		System.out.println("STATE  : "+state);
		System.out.println("COUNTRY: "+country);
		System.out.println("PIN    : "+pin);
	}

	public Address(String area, String street, String city, String state, String country, int pin) {
		super();
		this.area = area;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}
	public Address() {
		
	}
	
}
class Person
{
	private char gender;
	private int age;
	private String name;
	Address homeAddress ; //hasA

	public Person(char gender, int age, String name, String area,String street, String city, String state, String country, int pin) {
		super();
		this.gender = gender;
		this.age = age;
		this.name = name;
		homeAddress = new Address(area,street,city,state,country,pin); //
	}

	
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
		if(homeAddress!=null)
			homeAddress.printAddress();
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




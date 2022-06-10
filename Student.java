package composite;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="student12")
public class Student {

	@EmbeddedId
	private Student.StudentID studentId;
	
	@Column(length=20)
	String name;
	
	int age;
	
	
	public Student(StudentID studentId, String name, int age) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static class StudentID implements Serializable
	{
		@Column(length=5)
		String std;
		@Column(length=5)
		String div;
		
		int rollno;
		
		public StudentID(String std, String div, int rollno) {
			super();
			this.std = std;
			this.div = div;
			this.rollno = rollno;
		}
		public StudentID() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public int hashCode() {
			return Objects.hash(div, rollno, std);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			StudentID other = (StudentID) obj;
			return Objects.equals(div, other.div) && rollno == other.rollno && Objects.equals(std, other.std);
		}
		@Override
		public String toString() {
			return "StudentID [std=" + std + ", div=" + div + ", rollno=" + rollno + "]";
		}
	} //end of inner class

	public Student.StudentID getStudentId() {
		return studentId;
	}

	public void setStudentId(Student.StudentID studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

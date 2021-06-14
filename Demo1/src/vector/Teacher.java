package vector;

public class Teacher {
	String name;
	String department;
	String subject;
	String college;
	public Teacher(String name, String department, String subject, String college) {
		super();
		this.name = name;
		this.department = department;
		this.subject = subject;
		this.college = college;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", department=" + department + ", subject=" + subject + ", college=" + college
				+ "]";
	}
	

}
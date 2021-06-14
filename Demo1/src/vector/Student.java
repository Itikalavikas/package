package vector;

public class Student {
String name;
String department;
String rollNo;
String college;
public Student(String name, String department, String rollNo, String college) {
	super();
	this.name = name;
	this.department = department;
	this.rollNo = rollNo;
	this.college = college;
}
@Override
public String toString() {
	return "Student [name=" + name + ", department=" + department + ", rollNo=" + rollNo + ", college=" + college + "]";
}

}
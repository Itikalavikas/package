package vector;

public class Hod {
	String name;
	String empId;
	String department;
	String college;
	public Hod(String name, String empId, String department, String college) {
		super();
		this.name = name;
		this.empId = empId;
		this.department = department;
		this.college = college;
	}
	@Override
	public String toString() {
		return "Hod [name=" + name + ", empId=" + empId + ", department=" + department + ", college=" + college + "]";
	}
	

}
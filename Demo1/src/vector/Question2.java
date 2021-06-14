package vector;

import java.util.Vector;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v= new Vector();
		Student s= new Student("vikas","ECE","1234ABCD","ABC");
		Hod d= new Hod("vikas","123","EEE","ABC");
		Teacher t= new Teacher("raju","ECE","Java","Global");
		v.add(s);
		v.add(d);
		v.add(t);
		for(Object o:v)
		{
			System.out.println(o.toString());
		}
		

	}

}
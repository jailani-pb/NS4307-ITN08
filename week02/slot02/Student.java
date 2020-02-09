package week02.slot02;

import java.io.Serializable;

public class Student implements Serializable {

	public int id;
	public String name;
	public School school = new School();
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
}

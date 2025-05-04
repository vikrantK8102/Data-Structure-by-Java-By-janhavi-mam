package datastructure;

public class Student {
	public int rollNo;
 public String name;
	public int studClass;
	
	public Student() {
		
	   rollNo = 0;
       name = "unknown";
		studClass = 0;
	}
	
	
	public Student(int rollNo, String name, int studClass) {
	
		this.rollNo = rollNo;
		this.name = name;
		this.studClass = studClass;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getStudClass() {
		return studClass;
	}


	public void setStudClass(int studClass) {
		this.studClass = studClass;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", studClass=" + studClass + "]";
	}
	
	

}

package datastructure;

public class StudentStack {

	public Student stud[];
	public int top ;
	
	public StudentStack() {
	   stud = new Student[10];
		top = -1;
	}
	
	public StudentStack(int d) {
		stud = new Student[d];
		top = -1;
	}
	
	//push function
	public void push(Student s1) {
		
		if(top==stud.length-1) {
			System.out.println("overflow");
			return ;
		}
		
		top = top+1;
		stud[top] = s1;
		return ;
	}
	
	//pop function
	public Student pop() {
	
		if(top==-1) {
			System.out.println("underflow");
			return null;
		}
		
		Student s2 = stud[top];
		top = top-1;
		return s2;
		
		
	}
	
	//peek function
	public Student peek() {
		
		if(top==-1) {
			System.out.println("underflow");
			return null;
		}
		
		return stud[top];
	}
	
	//display student
	public void displayStud() {
		for(int i=0;i<stud.length;i++) {
			
			System.out.println(stud[i]);
		}
	}
}

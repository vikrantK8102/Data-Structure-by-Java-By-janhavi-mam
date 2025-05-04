package datastructure;

public class stringStack {
	private String arr[];
	private int top;
	
	public stringStack() {
		arr = new String[10];
		top = -1;
	}
	
	public stringStack(int d) {
		arr = new String[d];
		top = -1;
	}
	
  //push function of sting stack
	public void push(String str) {
		
		if(top==arr.length-1) {
			System.out.println("stack is overflow..");
			return ;
		}
		top = top+1;
		arr[top] = str;
	}
	
	//function to pop elemts
	public String pop() {
	   String s1= "underflow_stack";
		if(top==-1) {
			System.out.println("underflow..");
			return s1;
		}
		
		s1 = arr[top];
		top = top -1;
		return s1;
	}
	
	//function for peek
	public String peek() {
		String s2 = "underflow_stack";
		if(top==-1) {
			System.out.println("underflow");
			return s2;
		}
		
		return arr[top];
		
		
	}
	
	//display stack
	public void displayStack() {
		System.out.println("stack elements are:");
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]+ "  ");
		}
	}
	
}

/*  digram of string stack:
    ===============================
     STRING STACK - ARRAY BOX
===============================

Initial State:
Index:   0     1     2     3     4     5     6     7     8     9
        [_]   [_]   [_]   [_]   [_]   [_]   [_]   [_]   [_]   [_]
Top -> -1 (Stack is empty)

Push "Apple":
        [Apple][_][_][_][_][_][_][_][_][_]
Top ->     ↑ (top = 0)

Push "Banana":
        [Apple][Banana][_][_][_][_][_][_][_][_]
Top ->             ↑ (top = 1)

Push "Cherry":
        [Apple][Banana][Cherry][_][_][_][_][_][_][_]
Top ->                      ↑ (top = 2)

Peek:
        Top element is "Cherry"
        No change in stack.

Pop (removes "Cherry"):
        [Apple][Banana][Cherry][_][_][_][_][_][_][_]
Top ->             ↑ (top = 1)

Pop (removes "Banana"):
        [Apple][Banana][Cherry][_][_][_][_][_][_][_]
Top ->     ↑ (top = 0)

Push "Date":
        [Apple][Date][Cherry][_][_][_][_][_][_][_]
Top ->             ↑ (top = 1)

Pop (removes "Date"):
        [Apple][Date][Cherry][_][_][_][_][_][_][_]
Top ->     ↑ (top = 0)

Final State:
        Only "Apple" remains in the stack at index 0
        [Apple][Date][Cherry][_][_][_][_][_][_][_]
Top ->     ↑ (top = 0)

===============================
*/

package dsa;

import java.util.Stack;

public class stack_demo {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		st.add(1);
		st.add(10);
		st.add(11);
		System.out.println(st);
		System.out.println("this is stack clss "+ st.peek());
		st.pop();
		System.out.println("\n" + st.peek());
		System.out.println(st);

	}

}

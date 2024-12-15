package dsa;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class queue_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> qu = new LinkedList<>();
		qu.add(10);
		qu.add(11);
		qu.add(12);
		qu.add(13);
		
		System.out.println(qu);
		System.out.println(qu.peek());
		System.out.println(qu.poll());
		System.out.println(qu.element());
	}

}

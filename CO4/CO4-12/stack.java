package CO4;
import java.util.*;

public class stack {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Stack <Integer> st = new Stack<Integer>();
		
		st.add(10);
		st.add(5);
		st.add(15);
		st.add(25);
		st.add(20);
		
		System.out.println("Original Stack:"+st);
		
		System.out.println("\nEnter the index to be removed:");
		int index = s.nextInt();
		
		int rm_ele = st.remove(index);
		
		System.out.println("Removed Element is:"+rm_ele);
		
		System.out.println("\nStack after updation:\n"+st);
		// TODO Auto-generated method stub

	}

}

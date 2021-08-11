package CO4;
import java.util.*;
public class DQ {
	
	 public static void main(String[] args) {
	        int ch, data;
	        Deque<Integer> dq = new LinkedList<Integer>();
	        Scanner sc = new Scanner(System.in);
	        do
	        {
	            System.out.println("\n______MENU______");
	            System.out.println("1.Insert the element at first");
	            System.out.println("2.Insert the element at last");
	            System.out.println("3.Delete the element at first");
	            System.out.println("4.Delete the element at last");
	            System.out.println("5.Display");
	            System.out.println("6.Exit");
	            System.out.println("\nEnter the choice(1-6):");
	            ch = sc.nextInt();
	            sc.nextLine();
	            switch(ch)
	            {
	                case 1: System.out.println("Enter the element to be inserted at first:");
	                        data = sc.nextInt();
	                        dq.addFirst(data);
	                        break;
	                case 2: System.out.println("Enter the element to be inserted at last:");
	                        data = sc.nextInt();
	                        dq.addLast(data);
	                        break;
	                case 3: System.out.println("Element deleted from the first position");
	                        dq.removeFirst();
	                        break;
	                case 4: System.out.println("Element deleted from the last position");
	                        dq.removeLast();
	                        break;
	                case 5: System.out.println("Elements:");
	                        System.out.println(dq);
	                        break;
	                case 6: System.exit(0);
	                        break;
	                default:System.out.println("Invalid choice...");
	            }
	        }while(true);
	    }
	

}

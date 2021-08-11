package CO4;
import java.util.*;

public class PriorityQ {
	public static void main(String[] args) {
        int n, data;
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        System.out.println("Enter the no. of data:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the data:");
        for(int i=0;i<n;i++)
        {
            data = sc.nextInt();
            pq.add(data);
        }
        Iterator itr = pq.iterator();
        System.out.println("\nPriority Queue\n");
        while(itr.hasNext())
            System.out.println(itr.next()+" ");
    }
}



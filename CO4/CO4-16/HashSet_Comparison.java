package CO4;
import java.util.*;
public class HashSet_Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<String> s1 = new HashSet<>();
	        s1.add("CSS");
	        s1.add("HTML");
	        s1.add("Java");

	        Set<String> s2 = new HashSet<>();
	        s2.add("CSS");
	        s2.add("Javascript");
	        s2.add("SQL");

	        //Printing  elements of both the hashsets
	        System.out.println("Elements of first Hash set (s1) :" + s1);
	        System.out.println("Elements of second Hash set (s2) : " + s2);

	        // Perform set operations
	        performUnion(s1, s2);
	        performIntersection(s1, s2);
	        performDifference(s1, s2);
	    }

	    public static void performUnion(Set<String> s1, Set<String> s2) {
	        Set<String> s1Unions2 = new HashSet<>(s1);
	        s1Unions2.addAll(s2);
	        System.out.println("s1 union s2: " + s1Unions2);
	    }

	    public static void performIntersection(Set<String> s1, Set<String> s2) {
	        Set<String> s1Intersections2 = new HashSet<>(s1);
	        s1Intersections2.retainAll(s2);
	        System.out.println("s1 intersection s2: " + s1Intersections2);
	    }
	    public static void performDifference(Set<String> s1, Set<String> s2) {
	        Set<String> s1Differences2 = new HashSet<>(s1);
	        s1Differences2.removeAll(s2);

	        Set<String> s2Differences1 = new HashSet<>(s2);
	        s2Differences1.removeAll(s1);

	        System.out.println("s1 difference s2: " + s1Differences2);
	        System.out.println("s2 difference s1: " + s2Differences1);
	    }

}

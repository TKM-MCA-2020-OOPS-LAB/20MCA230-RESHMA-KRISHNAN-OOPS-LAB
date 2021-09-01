package CO4;
import java.util.*;

public class Linked_HSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
			// Adding element to LinkedHashSet
			linkedset.add("Priya");
			linkedset.add("Sneha");
			linkedset.add("Arya");
			linkedset.add("Sree");
			linkedset.add("Priya"); //This will not add new element as Priya already exists
			linkedset.add("Roya");
			System.out.println("Size of LinkedHashSet= " + linkedset.size());
			System.out.println("Original LinkedHashSet: " + linkedset);
			System.out.println("Removing Sree from LinkedHashSet: " + linkedset.remove("Sree"));
			System.out.println("Trying to Remove Z which is not present: "
					+ linkedset.remove("Z"));
			System.out.println("Checking if Priya is present= " + linkedset.contains("Priya"));
			System.out.println("Updated LinkedHashSet: " + linkedset);
		}

}

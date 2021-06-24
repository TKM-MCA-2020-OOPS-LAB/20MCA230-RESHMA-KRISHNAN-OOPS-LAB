package CO4;
import java.util.*;
public class arrayList {
	public static void main(String[] args) {
		
		// Creating ArrayList of type "String" which means we can only add "String" elements
		
		 ArrayList<String> fruits = new ArrayList<String>();
		 
		 //adding elements to an ArrayList
		 
	      fruits.add("Apple");
	      fruits.add("Grapes");
	      fruits.add("Mango");
	      fruits.add("Pineapple");
	      fruits.add("Pomegranate");
	      fruits.add(3, "Orange");
	      

	      // Displaying elements
	      
	      System.out.println("\n ORIGINAL LIST:");
	      System.out.println("-----------------------------------------------------"); 
	      for(String str : fruits)
	         System.out.printf(str+"  ");

	      //Remove elements from ArrayList 
	      
	      fruits.remove("Grapes");
	      fruits.remove(2);
	     
	      // Displaying elements
	      System.out.println("\n-----------------------------------------------------"); 
	      System.out.println("\n\nARRAYLIST AFTER REMOVAL OF ELEMENTS:");
	      System.out.println("-------------------------------------"); 
	      for(String str : fruits )
	    	  System.out.printf(str+"  ");

	      
	      //Updating the ArrayList
	      
	      fruits.set(3,"Guava");
	      System.out.println("\n-------------------------------------"); 
	      System.out.println("\n\n ARRAYLIST AFTER UPDATION:");
	      System.out.println("-------------------------------------"); 
	      for(String str : fruits )
	    	  System.out.printf(str+"  ");
	      System.out.println("\n-------------------------------------");
	      //Sorting the ArrayList
	      
	      Collections.sort(fruits);
	       
	      System.out.println("\n\n ARRAYLIST AFTER SORTING:");
	      System.out.println("-------------------------------------"); 
	      for (String str : fruits) 
	    	  System.out.printf(str+"  ");
	
	
	     
	      // Checks whether the object is in the ArrayList
	      System.out.println("\n------------------------------------------"); 
	      System.out.println("\nApple is in the List- "+ fruits.contains("Apple"));
	      System.out.println("Strawberry is in the List- "+fruits.contains("Strawberry"));
	      
	      
	      //Size of the ArrayList
	      
	      System.out.println("\n------------------------------------------"); 
	      System.out.println("\nSIZE OF THE ARRAYLIST: "+ fruits.size());
	      

	      //returns the object of list which is present at the specified index  
	      System.out.println("\n------------------------------------------"); 
	      System.out.println("\n\nOBJECT AT INDEX 2: "+ fruits.get(2));
	      
	      
	      // removing all the elements of the ArrayList
	      
	      fruits.clear();
	      
	      System.out.println("\nARRAYLIST AFTER Clear(): "+ fruits);
	      
	}
}

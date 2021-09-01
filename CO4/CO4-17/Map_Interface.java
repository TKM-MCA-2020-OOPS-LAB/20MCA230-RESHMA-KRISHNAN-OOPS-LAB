package CO4;
import java.util.*;

public class Map_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hm = new HashMap<>();
  
        // Inserting the Elements
        hm.put(1, "Java");
        hm.put(2, "Python");
        hm.put(3, "SQL");
        hm.put(4, "JavaScript");
        hm.put(5, "CSS");
  
        System.out.println("Initial Map: "+hm);
        
        hm.put(2, "HTML"); //Changing an element
        
        System.out.println("Updated Map: " +hm);
        
        hm.remove(4); //Removing an element
        
        System.out.println("Final Map: "+hm);

	}

}

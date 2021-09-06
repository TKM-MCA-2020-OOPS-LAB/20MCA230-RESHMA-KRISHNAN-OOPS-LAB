package CO4;
import java.util.*;


public class treeMap {
    public static <i,s> Map<i,s> convertToTreeMap(Map<i,s> hashMap){
		
		Map<i,s> treeMap = new TreeMap<>();
		treeMap.putAll(hashMap);
		return treeMap;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> hashmap = new HashMap<>();
	      hashmap.put("One",1);
	      hashmap.put("Two",2);
	      hashmap.put("Three",3);
	      hashmap.put("Four",4);
	      hashmap.put("Five",5);
	      
	      System.out.println("HashMap: " +hashmap);
	      Map <String,Integer>treemap = convertToTreeMap(hashmap);
		  System.out.println("TreeMap: "+treemap);
	}

}

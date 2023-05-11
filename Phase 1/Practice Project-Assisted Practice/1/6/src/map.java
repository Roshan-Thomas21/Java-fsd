import java.util.*;
public class map {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//Hashmap
				HashMap<Integer,String> hm=new HashMap<Integer,String>();      
			      hm.put(1,"Rocky");    
			      hm.put(2,"Pushpa");    
			      hm.put(3,"Arjun");   			       
			      System.out.println("\nThe elements of Hashmap are ");  
			      for(Map.Entry m:hm.entrySet()){    
			       System.out.println(m.getKey()+" "+m.getValue());    
			      }
			      
			     //HashTable		       
			      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();    
			      ht.put(4,"Aby");  
			      ht.put(5,"Biby");  
			      ht.put(6,"Ciby");  
			      ht.put(7,"Diby");
			      System.out.println("\nThe elements of HashTable are ");  
			      for(Map.Entry n:ht.entrySet()){    
			       System.out.println(n.getKey()+" "+n.getValue());    
			      }
			      
			      
			      //TreeMap			      
			      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
			      map.put(8,"GT");    
			      map.put(9,"RCB");    
			      map.put(10,"RR");       			      
			      System.out.println("\nThe elements of TreeMap are ");  
			      for(Map.Entry l:map.entrySet()){    
			       System.out.println(l.getKey()+" "+l.getValue());    
			      }    
	}
}
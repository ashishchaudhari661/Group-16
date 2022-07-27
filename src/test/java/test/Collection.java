package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public class Collection {
public static void main(String[] args) {
	ArrayList<String> ar=new ArrayList();
									//not thread safe
	ar.add("velocity");				//Array List is not synchronized.
	ar.add("katraj");						// accept null value
	ar.add("pune");
	ar.add(null);
	
	 Object[] objects =ar.toArray();
	  
     // Printing array of objects
     for (Object obj : objects) {
         System.out.println(obj + " ");
     }
	System.out.println(ar.size());
	for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i));
	}
	
	Iterator value=ar.iterator();
	while(value.hasNext()){
	System.out.println(value.next());
	}

	System.out.println(ar.get(0));
	System.out.println(ar.get(2));
	System.out.println(ar.get(3));
	
//	Vector<Integer> v=new Vector();
//	v.add(null);
//	v.add(5);				//syncronized	
//	v.add(8);				//safe thread
//	v.add(4);				//accept null
//	
//	Iterator value=v.iterator();
//	System.out.println(v.get(2));
//	while(value.hasNext()) {
//		System.out.println(value.next());
			
//	HashSet h=new HashSet();
//	h.add("ashish");			//not maintain insertion order
//	h.add(5);					//not safe thread
//	h.add('r');					//contain uniq element only
//	h.add(null);				//allow null value
//	h.add("ashish");
//	
//Iterator value=	h.iterator();
//while(value.hasNext()) {
//	System.out.println(value.next());
//}
	
//	HashMap hm=new HashMap();	//uniq key
//	hm.put(1,"hello");			//not follow order
//	hm.put('c', 5);				//not safe thread
//	hm.put(null,"ashish");		//accept 1 null key and multiple null values 
//	hm.put(null, 6);			//based on key they gave values
//									
//	System.out.println(hm.get(1));
//	System.out.println(hm.get('c'));
//	System.out.println(hm.get(null));


//Hashtable ht=new Hashtable();	
//	ht.put("ashish", 2);		//not accept any null key and value
//	ht.put("shubham",5);		//not maintain order 
//	ht.put(6, 'd');				//syncronized
//	ht.put(5,"rakesh");
//	
//	System.out.println(ht.get("ashish"));
//	System.out.println(ht.get(6));
//	System.out.println(ht.get(5));	
}
}


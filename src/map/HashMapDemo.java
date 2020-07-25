package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(100, "ram");
		hm.put(101, "rao");
		hm.put(102, "jai");
		hm.put(102,"ravana");
		hm.get(101);
		System.out.println(hm);
		
	}

}

package Task12;
// Java program to Sort a TreeMap By Value 

import java.util.*;
import java.util.Map.Entry; 

class TreeMapDemo { 
	// Method for sorting the TreeMap based on values 
	public static <K, V extends Comparable<V> > Map<K, V> valueSort(final Map<K, V> map) 
	{ 
		// Static Method with return type Map and extending comparator class which compares values associated with two keys 
		Comparator<K> valueComparator = new Comparator<K>() 
		{ 			
			public int compare(K k1, K k2) 
			{ 
				int comp = map.get(k1).compareTo(map.get(k2)); 
				if (comp == 0) 
					return 1; 
				else
					return comp; 
			} 
		}; 
		// SortedMap created using the comparator 
		Map<K, V> sorted = new TreeMap<K, V>(valueComparator); 
		sorted.putAll(map); 
		return sorted; 
	} 

	public static void main(String[] args) 
	{ 
		Scanner input = new Scanner(System.in);
		TreeMap<Integer, String> map = new TreeMap<Integer, String>(); 

		// Put elements to the map 
		for(int i=1; i<=5; i++) {
			System.out.print("Enter inputs "+i+": ");
			int id = input.nextInt();
			String name = input.nextLine();
			map.put(id, name);
		} 

		// Calling the method valueSort 
		Map<Integer, String> sortedMap = valueSort(map); 

		// Get a set of the entries on the sorted map 
		Set<Entry<Integer, String>> set = sortedMap.entrySet(); 

		// Get an iterator 
		Iterator<Entry<Integer, String>> iterator = set.iterator(); 

		while (iterator.hasNext()) 
		{ 
			Map.Entry<Integer, String> mp = (Map.Entry<Integer, String>)iterator.next(); 
			System.out.println(mp.getKey() + ": " + mp.getValue()); 
		} 
	} 
}

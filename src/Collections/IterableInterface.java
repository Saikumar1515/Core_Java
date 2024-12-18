package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableInterface {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("pqr");
		list.add("xyz");
		
//		step1: Iterate an Iterable using enhanced for loop
		System.out.println("Iterating an Iterable using enhanced for loop");
		for (String elements : list) {
			System.out.println(elements+" ");
		}
		
		System.out.println("-------------------------------------------");
//		Step 2: Iterate an Iterable using forEach loop

//		The forEach() method takes the Lambda Expression as a parameter. This Lambda Expression is called for each element of the collection. 		In the below example, for each element of the list, the function prints the element to the console.
		System.out.println("Iterating an Iterable using forEach loop");
		list.forEach((element)-> {
			System.out.println(element+" ");
		});
		System.out.println("-------------------------------------------");
		
//		step3: Iterate an iterable Using Iterator<T> interface
//		methods: hasNext() - returns false if we have reached the end of the collection, otherwise returns true.
//		next(): Returns the next element in a collection.
//		remove(): Removes the last element returned by the iterator from the collection.
//		forEachRemaining(): Performs the given action for each remaining element in a collection, in sequential order.
		
//		System.out.println("Iterating an Iterable using Iterator<T> interface");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		System.out.println("-------------------------------------------");
		
		System.out.println("Iterating an Iterable using Iterator<T> interface");
		Iterator<String> iterator1 = list.iterator();
		try {
			while (iterator1.next() != null) {
				String element = iterator1.next();
				System.out.println(element);	
			}
		} catch (Exception e) {
			System.out.println("You don't have any elements");
		}
		
		System.out.println("Iterating an Iterable using to remove element using remove()");
		
		}
			
	}

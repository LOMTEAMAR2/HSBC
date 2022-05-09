// 11. Java Program to convert list(ArrayList) to array and vice -versa
package com.hsbc;

import java.util.ArrayList;

public class ConvertArrayListToArray{

public static void main(String[] args) {
	ArrayList languages = new ArrayList<>();

	// Add elements in the list
	languages.add("Vishnu");
	languages.add("Mahesh");
	languages.add("Brahma");
	System.out.println("ArrayList: " + languages);

	// Create a new array of String type
	String[] arr = new String[languages.size()];

	// Convert ArrayList into the string array
	languages.toArray(arr);
	System.out.print("Array: ");
	for(String item:arr) {
		System.out.print(item+", ");
	}
}
}

// Vice Versa

/*import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {

    // create an array
    String[] array = {"Java", "Python", "C"};
    System.out.println("Array: " + Arrays.toString(array));

    // convert array to list
    List languages= new ArrayList<>(Arrays.asList(array));

    System.out.println("List: " + languages);

  }
}*/
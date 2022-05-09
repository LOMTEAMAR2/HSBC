// 10. Java Program t join Two Lists
package com.hsbc;

import java.util.ArrayList;
public class JoinTwoLists {
	public static void main(String args[]){
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Amar");
		list1.add("Pankaj");
		list1.add("Shripad");
		System.out.println("Contents of list1 ::"+list1);

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Akash");
		list2.add("Ashitosh");
		list2.add("Shubham");
		System.out.println("Contents of list2 ::"+list2);

		list1.addAll(list2);
		System.out.println("Contents of list1 after adding list2 to it ::"+list1);
	}
}
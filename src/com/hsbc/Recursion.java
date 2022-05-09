// 24. Java Program to reverse a sentence using Recursion
package com.hsbc;

public class Recursion {

	public static void main(String[] args) {
		String sentence = "Come Home";
		String reversed = reverse(sentence);
		System.out.println("The reversed sentence is: " + reversed);
	}

	public static String reverse(String sentence) {
		if (sentence.isEmpty())
			return sentence;

		return reverse(sentence.substring(1)) + sentence.charAt(0);
	}
}


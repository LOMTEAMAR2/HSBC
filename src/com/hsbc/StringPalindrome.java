// 3. Check whether a string is palindrome or not
package com.hsbc;

public class StringPalindrome {

		   public static void main(String args[]) {
		      String myString = "sarsa";
		      StringBuffer buffer = new StringBuffer(myString);
		      buffer.reverse();
		      String data = buffer.toString();
		      if(myString.equals(data)){
		         System.out.println("Given String is palindrome");
		      } else {
		         System.out.println("Given String is not palindrome");
		      }
		   }
		}



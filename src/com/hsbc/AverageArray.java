//4. Java Program to calculate average using strings
package com.hsbc;

public class AverageArray {

	
		 
	    public static void main(String[] args) {
	 
	        // create an array
	        int[] array = { 2,4,6,8,10,12,14,16 };
	 
	        // getting array length
	        int length = array.length;
	 
	        // default sum value.
	        int sum = 0;
	 
	        // sum of all values in array using for loop
	        for (int i = 0; i < array.length; i++) {
	            sum += array[i];
	        }
	 
	        double average = sum / length;
	         
	        System.out.println("Average of array : "+average);
	 
	    }
	 
	

}

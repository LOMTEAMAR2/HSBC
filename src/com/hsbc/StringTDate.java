// 23. Java Program to convert String To Date
package com.hsbc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringTDate {

	public static void main(String[] args)throws Exception {  
	    String sDate1="04/05/1999";  
	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
	    System.out.println(sDate1+"\t"+date1);  
	}  
	}  


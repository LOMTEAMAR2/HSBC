//15. check whether a character is aplhbet or not
package com.hsbc;

public class Alphbet{

public static void main(String[] args) {
	
	char value ='%';
	
	if ( (value>='a' && value<='z') || (value>='A' && value<='Z') )
	{
		switch(value)
		{
		case 'a' : 
		case 'e' : 
		case 'i' : 
		case 'o' :	
		case 'u' :		
		case 'A' :
		case 'E' :	
		case 'I' :
		case 'O' :	
		case 'U' :
			System.out.println("Vowel");
		break;
		
		default : System.out.println("consonant");
		}
	}
	
	else 
	{
		System.out.println("Its not a Alphabet");
	}
}
}
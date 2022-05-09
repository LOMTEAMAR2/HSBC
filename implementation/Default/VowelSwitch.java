
public class VowelSwitch {

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



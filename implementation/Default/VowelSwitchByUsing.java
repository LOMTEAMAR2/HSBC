
public class VowelSwitchByUsing {

	public static void main(String[] args) {
	
		char value ='%';
		
		if ( (value>='a' && value<='z') || (value>='A' && value<='Z') )
		{
			switch(value)
			{
			case 'a' : 
				System.out.println("Vowel");
			break;
			
			case 'e' : 
				System.out.println("Vowel");
			break;
			
			case 'i' : 
				System.out.println("Vowel");
			break;
			
			case 'o' :
				System.out.println("Vowel");
			break;
			
			case 'u' :
				System.out.println("Vowel");
			break;
			
			case 'A' :
				System.out.println("Vowel");
			break;
			
			case 'E' :
				System.out.println("Vowel");
			break;
			
			case 'I' :
				System.out.println("Vowel");
			break;
			
			case 'O' :
				System.out.println("Vowel");
			break;
			
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

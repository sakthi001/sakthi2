package guvi;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vowelsconstant{
	public class Vowel_Consonant 
	{
	    public void main(String[] args) throws Exception 
	    {
	        char c;
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter the character you want to check:");
	        c= (char) bf.read();
	        switch(c)
	        {
	            case 'a':
	            System.out.println("The given character "+c+" is vowel");
	            break;
	 
	            case 'e':
	            System.out.println("This character  is vowel");
	            break;
	 
	            case 'i':
	            System.out.println("This character  is vowel");
	            break;
	 
	            case 'o':
	            System.out.println("This character  is vowel");
	            break;
	 
	            case 'u':
	            System.out.println("This character  is vowel");
	            break;
	 
	            default:
	            System.out.println("This character  is consonants");
	            break;
	        }
	    }
	}}



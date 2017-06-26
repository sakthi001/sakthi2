package guvi;
  import java.util.*;
	
	class Textfile
	{  
	    public static void main(String[]args) throws FileNotFoundException        
	    { 
	            Scanner sc= new Scanner(System.in);           

	            System.out.println("enter the string: ");
	           String input = sc.next();

	            int chars = 0;

	            while(sc.hasNextByte())
	            {
	                sc.nextByte();
	                chars++;
	            }

	            
	           
	            System.out.println("Number of characters: " + chars);
	    }
	
}




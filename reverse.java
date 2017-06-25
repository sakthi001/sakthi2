package guvi;


	import java.util.*;
	 
	class ReverseString
	{
	   public static void main(String args[])
	   {
	      String original, reverse = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter the reverse string");
	      original = sc.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      System.out.println("Reverse of enter string is: "+reverse);
	   }
	}
	
	
	
	

}

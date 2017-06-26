package guvi;


	import java.util.Scanner;
	 
	class NumberReverse
	{
	   public static void main(String args[])
	   {
	      int x, rev = 0;
	 
	      System.out.println("Enter the number is: ");
	      Scanner sc = new Scanner(System.in);
	      x = sc.nextInt();
	 
	      while( x != 0 )
	      {
	    	  rev=rev * 10;
	    	rev=rev+ x%10;
	         x= x/10;
	      }
	 
	      System.out.println("Reverse number is: "+rev);
	   }
	}


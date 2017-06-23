package guvi;


	import java.util.Scanner;

	public class leapyear {
	  
	  public static void main(String []args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    
	    if(num % 4 == 0 && num!=100)
	      System.out.print("Leap year");
	      if(num%400==0)
	   System.out.print("Not a leap year");
	  }
	}


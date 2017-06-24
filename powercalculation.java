package guvi;


	import java.util.*;
	
	public class powercalculation {
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        int number = 0;
	        int pow = 0;
	        int power = 0;

	        System.out.print("Enter the number: ");
	        number = sc.nextInt();

	        System.out.print("Enter power: ");
	        pow = sc.nextInt();

	        System.out.print(power(number,pow));
	    }
	    public static int power(int x, int y)
	    {
	            int power = 1;
	            for(int c=0;c<y;c++)
	            power*=x;
	            return power;
	        }

	}


package guvi;

	import java.util.*;
	class Largest
	{
	public static void main(String args[])
	{ int x, y, z;
	System.out.println("Enter three integers ");
	Scanner sc = new Scanner(System.in);
	x= sc.nextInt();
	y= sc.nextInt();
	z= sc.nextInt();
	if ( x>y && x>z )
	System.out.println(x+" is largest.");
	else if ( y>z&& y>x )
	System.out.println(y+" is largest.");
	else if ( z>x && z>y )
	System.out.println(z+" is largest.");
	}
	}



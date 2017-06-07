package n4;

import java.util.Scanner;

public class oddeven {
	public static void main(String args[])
	{int num;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the value of num");
	num=in.nextInt();
	if(num==0)
	{System.out.println("The given no is zero");
	}if(num%2==0){
		System.out.println("The given no is even");
	}if(num%2!=0){
		System.out.println("The given no is odd");
	}else
	{System.out.println("Invalid input");
	}
	}
}

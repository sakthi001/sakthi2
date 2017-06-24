package guvi;

	 import java.util.*;
	public class Sum_number {
	public static void main(String ar[])throws Exception
	{
	int n,sum=0;
	int no[]=new int[100];
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(int i=1;i<n;i++)
	{
	no[i]=sc.nextInt();
	sum+=no[i];
	}
	System.out.println("sum of N number is +");
	}
	}


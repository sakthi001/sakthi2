package guvi;


	import java.io.*;
	import java.util.*;
	class Evennumbti
	{
	public static void main(String[] args)
	{
	int n,m;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the value");
	n=in.nextInt();
	m=in.nextInt();
	for(int i=n;i<=m;i++)
	{
	if(i%2==0)
	{
	System.out.println(i);
	}
	}
	}
	}


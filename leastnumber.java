package guvi;
	import java.util.*;
	public class leastnumber 
	{
	public static void main(String ar[])throws Exception
	{
	    int r,i,k;
	    int p[]=new int[100];
	Scanner s=new Scanner(System.in);
	leastnumber m1=new leastnumber();
	String a=new String();
	a=s.next();
	k=s.nextInt();
	int n=Integer.parseInt(a);
	i=0;
	while(n>0)
	{
	r=n%10;
	p[i++]=r;
	n/=10;
	}
	m1.sort(p,k,i);
	}
	public void sort(int l[],int m,int g)
	{
	    int t;
	for(int i=0;i<g-1;i++)
	{
	for(int j=i+1;j<g;j++)
	{
	if(l[i]>l[j])
	{
	t=l[i];
	l[i]=l[j];
	l[j]=t;
	}
	}
	}
	for(int i=0;i<m;i++)
	    System.out.print(l[i]);
	}
	}


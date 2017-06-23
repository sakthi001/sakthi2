package guvi;

	import java.util.Scanner;
	public class Sum{

	     public static void main(String []args){
	         int i,n,sum=0;
	         Scanner sc= new Scanner(System.in);
	         System.out.println("enter the limit");
	         n=sc.nextInt();
	        for(i=1;i<=n;i++)
	            sum=sum+i;
	        System.out.println(sum);
	     }
	}


package guvi;

	import java.util.Scanner;
	public class Count {
		public static void main(String[] args) {
			int num;
			int count =0;
			System.out.println("Enter a number to count");
			Scanner input = new Scanner(System.in);
			num = input.nextInt();
			while (num!=0){
				num = num /10;
				count++;
			}System.out.println("Total number of digit  is " + count);
		}
	}



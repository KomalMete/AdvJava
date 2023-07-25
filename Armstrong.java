package sdm;


	import java.util.Scanner;
	public class Armstrong {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number : ");
			int num = sc.nextInt();
					int ref = 0;
					double sum = 0;
					int trav = num; 
			while( num > 0)
			{
				ref = num % 10;
				sum = sum + Math.pow(ref, 3);
				num = num/10;
			}
			System.out.println("sum of cubes of digits in number : "+sum);
			
			if(sum == trav)
			{
				System.out.println(sum + " is a Armstrong Number ");
			}
			else
			{
				System.out.println(sum + " is not a Armstrong number ");
			}
			System.out.println(" Armstrong number ");
			System.out.println(" Armstrong number!!!!!!!!!!!!!!!!!!");

		}

	}



package assignment1;
import java.util.Scanner;
public class arms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while(n>0)
		{
			sum = sum+(n%10)*(n%10)*(n%10);
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("The number is armstrong number");
		}
		else
		{
			System.out.println("The number is not armstrong number");
		}
	}

}

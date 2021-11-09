package assignment1;
import java.util.Scanner;
public class Cui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count=0;
		String username="",password="";
		do {
			System.out.println("enter the useername ");
			username=sc.nextLine();
			System.out.println("enter the password ");
			password=sc.nextLine();
			if(username.equals("sowjanya")&&password.equals("sowjanya"))
			{
				System.out.println("welcome"+username);
				return;
			}
			else
			{
				System.out.println("incorrect details");
				count++;
			}
		}
		while(count<3);
		{
			System.out.println("contact admin");
		}
		
	}

}

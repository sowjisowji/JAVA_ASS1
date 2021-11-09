package assignment1;
import java.util.Scanner;
public class Supply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("marks of subject1");
		int sub1=sc.nextInt();
		System.out.println("marks of subject2");
		int sub2=sc.nextInt();
		System.out.println("marks of subject3");
		int sub3=sc.nextInt();
		double avg=(sub1+sub2+sub3)/3;
		System.out.println("average="+avg);
		if(sub1>60&&sub2>60&&sub3>60)
		{
			System.out.println("passed");
		}
		else if(sub1>60&&sub2>60||sub3>60)
		{
			System.out.println("promoted");
		}
		else if(sub1>60||sub2>60&&sub3>60)
		{
			System.out.println("failed");
		}
	}

}

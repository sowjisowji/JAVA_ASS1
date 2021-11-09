package assignment1;
import java.util.Scanner;
public class Income {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter CTC ");
		double c=sc.nextDouble();
		if(c<180000)
		{
			System.out.println("the payabale tax is nill");
		}
		else if(c>181001&&c<300000)
		{
			System.out.println("the payable tax"+c*0.1);
		}
		else if(c>300001&&c<500000)
		{
			System.out.println("the payable tax"+c*0.2);
		}
		else if(c>500001&&c<1000000)
		{
			System.out.println("the payable tax"+c*0.3);
		}
	}

}

package assignment1;

public class Armst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=100;n<1000;n++)
		{
			int sum = 0;
			int i = n;
			int a=0;
			while(n>0)
			{
				a=i%10;
				sum=sum+a*a*a;
				i/=10;
			}
			if(n==sum)
			{
				System.out.println("armstrong numbers are:"+n);
			}
		}
	}

}

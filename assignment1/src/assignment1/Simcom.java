package assignment1;
import java.util.Scanner;
public class Simcom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pri,r,t,sim,comp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principal amount");
		pri=sc.nextDouble();
		System.out.println("enter the rate");
		r=sc.nextDouble();
		System.out.println("enter the time");
		t=sc.nextDouble();
		sim=(pri*t*r)/100;
		comp=pri* Math.pow(1.0+r/100.0,t)-pri;
		System.out.println("simple interest="+sim);
		System.out.println("compound interest="+comp);
	}

}

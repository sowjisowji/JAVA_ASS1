package assignment1;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ph,ch,ma,ap,ac,am,sc1,sp,sm;
		System.out.println("enter the marks scored by a :\n");
		System.out.println("Physics :");
		Scanner sc = new Scanner(System.in);
		ph =sc.nextInt();
		System.out.println("chemistry :");
		ch =sc.nextInt();
		System.out.println("Maths :");
		ma =sc.nextInt();
		int rtot = ch+ma+ph;
		int ravg=rtot/3;
		sc.close();
		System.out.println("enter the marks scored by b :\n");
		System.out.println("Physics :");
		//Scanner sc = new Scanner(System.in);
		sp =sc.nextInt();
		System.out.println("chemistry :");
		sc1 =sc.nextInt();
		System.out.println("Maths :");
		sm =sc.nextInt();
		int stot = sc1+sm+sp;
		int savg=rtot/3;
		sc.close();
		System.out.println("enter the marks scored by c:\n");
		System.out.println("Physics :");
		//Scanner sc = new Scanner(System.in);
		ap =sc.nextInt();
		System.out.println("chemistry :");
		ac =sc.nextInt();
		System.out.println("Maths :");
		am =sc.nextInt();
		int atot = ac+am+ap;
		int aavg=atot/3;
		sc.close();
		int py=ph+sp+ap;
		System.out.println("subject total,avg Physics:"+py+","+py/3);
		int cy=sc1+ch+ac;
		System.out.println("subject total Chemistry:"+cy);
		int my=ma+sm+am;
		System.out.println("subject total Maths:"+my);
	}

}

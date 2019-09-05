package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int n1= 3+4*2;
		int n2=(3+4)*2;
		int n3= 17%3;
		double n4=10.0/8.0;
		 
		double a=1.0, b=-3.0, c=-4.0;
		//formula de Baskara
		double x1=(-b+ Math.sqrt(b*b-4.0*a*c))/(2.0*a);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(x1);
		System.out.println("----------------------------------------");
		
		Scanner sc= new Scanner (System.in);
		String sentence= sc.nextLine();
		String x,y,z;
		x=sc.next();
		y=sc.next();
		z=sc.next();
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("----------------------------------------");
		sc.close();
		
	}

}

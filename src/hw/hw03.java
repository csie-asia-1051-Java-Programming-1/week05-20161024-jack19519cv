package hw;

import java.util.Scanner;
//105021059 ¤ý«T÷g

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 1;
		double m=0;
		while(m<10000)
		{
			m= Math.pow(n,a);
			a++;
		}	
		System.out.print(a);
		
		
		
		
		
	}

}

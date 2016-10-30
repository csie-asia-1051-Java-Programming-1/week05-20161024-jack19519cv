package hw;
import java.util.Scanner;
//105021059 ¤ý«T÷g
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scn = new Scanner(System.in);
  long n = scn.nextLong();
  double sum = 0;
  double m = 0;
  double a = 0;
  for(float i=1;i<=n;i++){
	  
	 m = 1/(((2*i)-1)*(2*i));
	  a+=m;
	  
  }
  System.out.print(a);
  
  
	}

}

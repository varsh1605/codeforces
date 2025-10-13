import java.util.*;
public class SystemOfEquations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		
		
		int c=0;
		for(int a=0;a<=100;a++) {
			for(int b=0;b<=1000;b++) {
				if (a * a + b == n && a + b * b == m)
				c++;
			}
		}
		System.out.println(c);	
		

	}

}

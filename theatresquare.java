import java.util.*;
public class theatresquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long m=sc.nextInt();
		long a=sc.nextInt();
		long n1=(long)Math.ceil((double)n/a);
		long n2=(long)Math.ceil((double)m/a);
		System.out.println(n1*n2);

	}

}

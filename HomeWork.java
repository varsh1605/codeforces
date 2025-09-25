
import java.util.*;

public class HomeWork {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int l1=sc.nextInt();
			sc.nextLine();
			String a=sc.nextLine();
			
			int l2=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			String format=sc.nextLine();
			
		
			for (int j=0;j<l2;j++) {
				if(format.charAt(j)=='D')
					a=a+b.charAt(j);
				else
					a=b.charAt(j)+a;
			}
		
			System.out.println(a);
		}
	}

}

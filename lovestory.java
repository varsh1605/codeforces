import java.util.*;
public class lovestory {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			int c=0;
			String a=sc.nextLine();
			String given="codeforces";
			for(int j=0;j<a.length();j++) {
			if(a.charAt(j)!=given.charAt(j))
				c++;
			}
			System.out.println(c);
		}
       
	}

}
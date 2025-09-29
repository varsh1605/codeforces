import java.util.*;
public class shortstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String a=sc.nextLine();
			StringBuilder sb = new StringBuilder();
			char sub=a.charAt(0);
			sb.append(sub);
			for(int j=1;j<a.length();j+=2) {
				sb.append(a.charAt(j));
			}
			System.out.println(sb.toString());
			
		}
	}

}

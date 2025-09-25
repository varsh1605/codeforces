import java.util.*;
public class vanya {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int h=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++) {
			int hh=sc.nextInt();
			if(hh<=h)
				sum+=1;
			else
				sum+=2;
				
		}
		System.out.println(sum);
	}

}
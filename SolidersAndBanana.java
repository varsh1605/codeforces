import java.util.*;
public class SolidersAndBanana {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		int n=s.nextInt();
		int w=s.nextInt();
		int ans=k*((w*(w+1))/2);
		ans=ans-n;
		if(ans>0)
			System.out.println(ans);
		else
			System.out.println(0);
			

	}

}
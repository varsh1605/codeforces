import java.util.*;

public class creatingwords {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			
			String a=sc.nextLine();
		    String[] arr=a.split(" ");
		    char a1=arr[0].charAt(0);
		    char b1=arr[1].charAt(0);
		    String s1 = b1 + arr[0].substring(1);
            String s2 = a1 + arr[1].substring(1);
		    System.out.println(s1+ " "+s2);
			
		}

	}

}

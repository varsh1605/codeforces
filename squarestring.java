import java.util.*;
public class squarestring {

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          sc.nextLine();
          for(int i=0;i<n;i++) {
        	  String a=sc.nextLine();
        	  if(a.length()%2==0) {
        		 String s1=a.substring(0,a.length()/2);
        		 String s2=a.substring(a.length()/2);
        		 if(s1.equals(s2))
        			 System.out.println("YES");
        		 else
        			 System.out.println("NO");
        	  }
        	  else
        		  System.out.println("NO");
          }
	}

}

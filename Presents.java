import java.util.*;
public class Presents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] arr1=new int [n+1];
		int []arr2=new int[n+1];
		for(int i=1;i<=n;i++) {
			arr1[i]=s.nextInt();
			
		}
     for(int j=1;j<=n;j++) {
    	 int a=arr1[j];
    	 arr2[a]=j;
    	 
     }
     for(int k=1;k<=n;k++) {
    	 System.out.println(arr2[k]+" ");
     }
	}

}

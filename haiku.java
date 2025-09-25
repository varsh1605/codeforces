
import java.util.*;
public class Haiku {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] lines=new String[3];
				for(int i=0;i<3;i++) {
			        lines[i]=sc.nextLine();
			
				       
		}
				int []e= {5,7,5};
		for(int j=0;j<3;j++) {
			int c=0;
			for(char ch:lines[j].toCharArray()) {
				if("aeiou".indexOf(Character.toLowerCase(ch))>=0)
					c++;
				
			}
			if(c!=e[j]) {
				System.out.println("No");
			    return;
			}
		}
		System.out.println("Yes");
	}

}

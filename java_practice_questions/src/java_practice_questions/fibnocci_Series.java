package java_practice_questions;
import java.util.*;

public class fibnocci_Series {

	public static void main(String[] args) {
		
		int a=0,b=1,c,i;
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.print(a + " " + b);
		
		for(i=2;i<=n;i++)
		{
			c=a+b;
			System.out.print(" " +c);
			a=b;
			b=c;
		}
		

	}

}

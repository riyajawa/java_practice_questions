package java_practice_questions;
import java.util.*;

public class prime_Number {

	public static void main(String[] args) {
		
		int i,c=0;
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c>2)
		{
			System.out.println("prime");
		}
		else 
		{
			System.out.println("not prime");
		}
		
		

	}

}

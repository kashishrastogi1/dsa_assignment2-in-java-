import java.util.*;
public class Hello
{
	public static void main(String[]args)
	{
        System.out.println("enter the number:");
		Scanner scn= new Scanner(System.in);
		int n = scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		for (int i=1;i<=n/2;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			if(n/2-i>0)
			{for (int j=1;j<=2*(n/2-i)-1;j++)
			{
				System.out.print(" ");
			}}
			if(n/2-i>0)
			{System.out.print("*");}
			
			System.out.println();
		}
		for(int i=1;i<=n/2-1;i++)
		{
			for(int j=1;j<=n/2-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
		}
		
	}
}

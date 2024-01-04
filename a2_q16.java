import java.util.Scanner;

public class Hello
{
	public static void main(String[]args)
{
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  for(int i=1;i<=n;i++)
	  {
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print(j);
		  }
		  for (int j=1;j<=2*(n-i)-1;j++)
		  {
			  System.out.print(" ");
		  }
		  if(i<n)
		  {
			  for(int j=i;j>=1;j--)
			  {
				  System.out.print(j);
			  }
		  }
		  else
		  {
			  for (int j=i-1;j>=1;j--)
			  {
				  System.out.print(j);
			  }
		  }
		  System.out.println();
	  }
      sc.close();
		
}
}

import java.util.*;
public class Hello
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a no.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int  i =1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if (i == j || i + j == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
        sc.close();
    }
}

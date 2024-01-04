import java.util.Scanner;
public class q20{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<(n-3);i++){   //first two lines
            for(int j=0;j<(n-4);j++){
                System.out.print("*");
            }
            for(int j=0;j<(n-2);j++){
                System.out.print(" ");
            }
                System.out.print("*");
           
            System.out.println();

        }

        System.out.print("*");  //mid
        for (int i = 0; i< n-4; i++){
            System.out.print(" ") ;
        }
        System.out.print("*");

        for (int i = 0; i < n-4; i++){
            System.out.print(" ");
        }
        System.out.println("*");

        
        for(int i=0;i<(n-3);i++){  //secondlast
            System.out.print("*");
        }
        System.out.print(" ");
        for(int i=0;i<(n-3);i++){
            System.out.print("*");
        }
        System.out.println();

        System.out.print("*"); //lastline
        for(int i=0;i<(n-2);i++){
            System.out.print(" ");
        }
        System.out.print("*");

        sc.close();
    
    }
}

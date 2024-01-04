import java.util.Scanner;

public class Hello {
    public static void main(String[] args){

        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        // 1st row
        for (int j = 0; j < n; j++){
            System.out.print("*");
        }

        for (int j = 1; j < (n-1); j++){
            System.out.print(" ");
        }
        
        System.out.println("*");

        // upper part
        for (int i = 1; i <(n-1); i++){ 
            for (int j = 1; j < n; j++){
            System.out.print(" ");
            }

            System.out.print("*");

            for (int j=1;j<(n-1);j++){
            System.out.print(" ");
            }

            System.out.println("*");
        }
        for (int j=1; j < 2*n; j++){
            System.out.print("*");
        }
        System.out.println();

        for (int i=1;i<(n-1);i++){ //lower part

            System.out.print("*");

            for (int j = 1; j < n-1; j++){
            System.out.print(" ");
            }

            System.out.print("*");

            System.out.println();         
        }

        // last row
        System.out.print("*");

        for (int j = 1; j < n-1; j++){
            System.out.print(" ");
        }

        for (int j = 0; j < n; j++){
            System.out.print("*");
        }

        sc.close();
    }
    
}

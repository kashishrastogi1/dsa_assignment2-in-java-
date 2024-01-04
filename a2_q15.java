import java.util.*;

public class Hello {
    public static void main(String[] args){

        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //take n=3 for reqd pattern
        for (int i = 1; i <= n; i++){

            for (int j = n; j > i; j--){
                System.out.print(" ");
            }

            for (int j = i; j <= 2*i-1; j++){
                System.out.print(j);
            }

            for (int j = 2*i-2; j >= i; j--){
                System.out.print(j);
            }

            System.out.println();
        }

        for (int i = n-1; i > 0; i--){
            
            for (int j = n; j > i; j--){
                System.out.print(" ");
            }

            for (int j = i; j <= 2*i-1; j++){
                System.out.print(j);
            }

            for (int j = 2*i-2; j >= i; j--){
                System.out.print(j);
            }

            System.out.println();
            
        }
        
        sc.close();
    }
    
}

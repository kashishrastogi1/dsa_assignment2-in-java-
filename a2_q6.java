import java.util.*;
public class q6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for(int i=0;i<=n/2;i++){
            for(int j=n/2;j>=i;j--){
                System.out.print("*");
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.print(" ");
            }
            for(int j=n/2;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i = (n/2)-1 ; i >= 0 ; i--){
            for (int j = i; j<=(n/2); j++){
                System.out.print("*");
            }
            for (int j= 0; j < (2*i+1); j++){
                System.out.print(" ");
            }
            for (int j = i; j<=(n/2); j++){
                System.out.print("*");
            }

        System.out.println();
        }
        obj.close();
    }
}

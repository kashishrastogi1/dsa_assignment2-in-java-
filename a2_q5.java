import java.util.*;
public class Hello{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //for upper triangle
        for(int i=0;i<=n/2;i++){
            for(int j=n/2;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //for lower one
        for(int i=n/2;i>0;i--){
            for(int j=n/2;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

       
        sc.close();

    }

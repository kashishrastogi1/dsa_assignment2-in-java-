import java.util.*;
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            int val =n*i;
            System.out.println(n + " * " + i + " = " + val);
        }
         
            sc.close();
    }
}
    

package patterns;
import java.util.*;
public class p3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            int val;
            if (i%2 == 0)
                val = 0;
            else
                val = 1;
            for (int j=1; j<=i; j++){
                System.out.print(val + " ");
                val =(val==1)? 0:1;
            }
            System.out.println();
            sc.close();
        }
    }
    
    
}

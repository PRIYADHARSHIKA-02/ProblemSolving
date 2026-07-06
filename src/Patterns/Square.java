package Patterns;
import java.util.*;
public class Square {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStarSquare(n);
    
        System.out.println();
        printNumberSquare(n);
        sc.close();
    }

    // ***
    // ***
    // ***
    public static void printStarSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 111
    // 222
    // 333
    public static void printNumberSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
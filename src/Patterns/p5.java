package Patterns;

import java.util.Scanner;

// public class p5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i=1; i<=n; i++){
//             for(int j=1; j<= n-(i-1); j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         sc.close();

//         }
// }

// n = 5 
// *****
// ****
// ***
// **
// *
// j<= n-(i-1) or other type give below sop("*")
//      5-(1-1) = 5 
//      5-(2-1) = 4
//      5-(3-1) = 3
//     ...

// public class p5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i=n; i>=1; i--){
//             for(int j=1; j<= i; j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//         sc.close();

//         }
// }

// 5
// 55555
// 4444
// 333
// 22
// 1

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=n; i>=1; i--){
            for(int j=1; j<= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();

        }
}

// 5 --- System.out.print(j)
// 12345
// 1234
// 123
// 12
// 1

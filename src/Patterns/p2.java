package patterns;
import java.util.*;
// public class p2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         scanner.close();
//     }
// }
// *
// **
// ***
// rightangletriangle - row equals to column tyms - j<=i

// public class p2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//         scanner.close();
//     }
// }
// n=5
// 1
// 22
// 333
// 4444
// 55555

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}

// n=5
// 1
// 12
// 123
// 1234
// 12345
// here, column has be printed - System.out.print(j)
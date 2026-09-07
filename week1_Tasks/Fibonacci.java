import java.util.Scanner;

public class Fibonacci {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        if (n == 1) {
            System.out.println(first);
        } else if (n == 2) {
            System.out.println(second);
        } else {

            int next = 0;

            for (int i = 3; i <= n; i++) {
                next = first + second;
                first = second;
                second = next;
            }

            System.out.println("Nth Fibonacci Number = " + next);
        }
    }
    
}

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if (n == 1){
            return 1;
        } 
        return factorial(n - 1) * n;
    }
}
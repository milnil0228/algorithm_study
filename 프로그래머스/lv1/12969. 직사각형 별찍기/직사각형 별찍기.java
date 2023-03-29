import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
            
    }
}
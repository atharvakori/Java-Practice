import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("================================\n");        
        String str1 = sc.next();
        int num1 = sc.nextInt();
        
        String str2 = sc.next();
        int num2 = sc.nextInt();
        
        String str3 = sc.next();
        int num3 = sc.nextInt(); 
                   
        System.out.printf("%-15s%03d%n", str1, num1);
        System.out.printf("%-15s%03d%n", str2, num2);
        System.out.printf("%-15s%03d%n", str3, num3);
        System.out.printf("================================");
        
        // Close the scanner
        sc.close();
    }
}

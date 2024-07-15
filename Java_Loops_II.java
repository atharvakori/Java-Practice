import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        double doub = sc.nextDouble();
        sc.nextLine();
        String str = sc.nextLine();
        
        System.out.println("String: " + str);
        System.out.println("Double: " + doub);
        System.out.println("Int: " + num);
        
        sc.close();
    }
}

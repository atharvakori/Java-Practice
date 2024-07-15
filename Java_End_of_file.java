import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        byte num = 1;
        String str;
        
        while(sc.hasNext()){
            str = sc.nextLine();
            System.out.println(num + " " + str);
            num ++;
        }
    }
}
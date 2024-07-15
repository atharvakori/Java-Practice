import java.io.*;
import java.util.*;

public class Solution {
    public static String palindromeCheck(String str){
        int p, q, forward, backward;
        
        forward = 0;
        backward = str.length()-1;
        
        p = str.charAt(forward);
        q = str.charAt(backward);
        
        while(forward < backward){
            if(p != q){
                return "No";
            }
            forward ++;
            backward --;
        }
        
        return "Yes";
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String result = palindromeCheck(A);
        System.out.println(result);
    }
}

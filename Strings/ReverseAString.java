package Strings;

import java.io.*;
import java.util.*;
import java.math.*;


public class ReverseAString {
        public static void main(String args[]) throws IOException {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
    
            while (t-- > 0) {
                String str = read.readLine();
                System.out.println(new Solution().reverseString(str));
    
                System.out.println("~");
            }
        }    
}

class Solution{
    public String reverseString(String s) {
        String reversed = "";
        for(int i = s.length()-1; i >= 0; i--){
            reversed += s.charAt(i);
        }
        return reversed;
    }
}
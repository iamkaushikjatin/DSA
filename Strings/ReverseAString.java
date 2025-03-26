package Strings;

import java.io.*;


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
        StringBuilder reversed = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--){
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }
}
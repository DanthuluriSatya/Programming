/*
Given a string of characters, find the first repeating character.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single string of characters.

Constraints

1 <= T <= 1000
'a' <= str[i] <= 'z'
1 <= len(str) <= 104

Output Format

For each test case, print the first repeating character, separated by newline. If there are none, print '.'.

Sample Input 0

3
smartinterviews
algorithms
datastructures
Sample Output 0

s
.
a
*/

import java.io.*;
import java.util.*;

public class Find_1st_repeat_char {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       int T=sc.nextInt();
      while(T>0){
          int count=0;
            String st = sc.next();
            char arr[] = st.toCharArray();
            int cnt[] = new int[26]; 
               
                for(int i=0;i<arr.length;i++) {
                     cnt[arr[i]-'a']++;             
                }
                for(int i=0;i<arr.length;i++)
                {  
                           if(cnt[arr[i]-'a'] >1){
                           System.out.println(arr[i]); 
                               break;
                             }    
                    if(cnt[arr[i]-'a'] ==1)
                    {
                        count++;
                        if(count==arr.length)
                           System.out.println("."); 
                    }
               
                }
            T--;
        }
    }
}

/*
Given 2 strings, check if they are anagrams. An anagram is a rearrangement of the letters of one word to form another word. In other words, some permutation of string A must be same as string B.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line containing 2 space separated strings.

Constraints

10 points
1 <= T <= 100
1 <= len(S) <= 103
'a' <= S[i] <= 'z'

40 points
1 <= T <= 100
1 <= len(S) <= 105
'a' <= S[i] <= 'z'

Output Format

For each test case, print True/False, separated by newline.

Sample Input 0

4
a a
b h
stop post
hi hey
Sample Output 0

True
False
True
False
*/
import java.io.*;
import java.util.*;

public class Anagrams {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       int T=sc.nextInt();
      while(T>0){
          int count=0;
            String s1 = sc.next();
            String s2 = sc.next();
            char arr1[] = s1.toCharArray();
            char arr2[] = s2.toCharArray();
            int cnt[] = new int[26]; 
               
                 for(int i=0;i<arr1.length;i++) 
                     cnt[arr1[i]-'a']++;             
                 for(int i=0;i<arr2.length;i++) 
                     cnt[arr2[i]-'a']--;
                 if(arr1.length!=arr2.length)
                 System.out.println("False"); 
              else
              {
                for(int i=0;i<arr2.length;i++)
                {  
                           if(cnt[arr2[i]-'a'] !=0){
                           System.out.println("False"); 
                               break;
                             }    
                    if(cnt[arr2[i]-'a'] ==0)
                    {
                        count++;
                        if(count==arr2.length)
                           System.out.println("True"); 
                    }
               
                 }
            }
          
            T--;
        }
    }
}

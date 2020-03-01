/*
Given a sentence containing only uppercase/lowercase english alphabets and spaces, you have to count the number of words, vowels and consonants.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single sentence.

Constraints

1 <= T <= 1000
1 <= len(sentence) <= 104

Output Format

For each test case, print the number of words, vowels and consonants, separated by newline.

Sample Input 0

4
Hi
Hello World
  Exception  
Hi there
Sample Output 0

1 1 1
2 3 7
1 4 5
2 3 4
*/

import java.io.*;
import java.util.*;

public class words_vow_consonants {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++)
        {
          int w_count=0;int v_count=0;int c_count=0;
          String sss=br.readLine();
          String ss=sss.trim();
          String line = ss.toLowerCase();
          int flag=0;
          for(int i=0;i<line.length();i++)
          {   
              char c=line.charAt(i);
              if(c>='a'&&c<='z')
              {
                  flag=1;
                  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                     v_count++;
                  else
                     c_count++; 
              }
              else
              {
                  if(flag==1)
                  w_count++;
                  flag=0;
              }
          }
            if(flag==1)
               w_count++;  
                   System.out.print(w_count+" ");
                   System.out.print(v_count+" ");
                   System.out.print(c_count);
                   System.out.println();
      }
    }
}

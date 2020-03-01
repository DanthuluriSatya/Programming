/*
Given height of adjacent buildings, find the largest rectangular area possible, where the largest rectangle can be made of a number of contiguous buildings. For simplicity, assume that all buildings have same width and the width is 1 unit.
Note: The sides of rectangle has to be parallel to the axes.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines - the first line contains N - the number of buildings. The second line contains the height of the buildings.

Constraints

50 points
1 <= T <= 100
1 <= N <= 103
1 <= A[i] <= 1000

150 points
1 <= T <= 100
1 <= N <= 105
1 <= A[i] <= 104

Output Format

For each test case, print the area of the largest possible rectangle, separated by new line.

Sample Input 0

2
7
6 2 5 4 5 1 6 
4
5 10 12 4 
Sample Output 0

12
20
Explanation 0

Test Case 1

You can form the following rectangles:
6x1 = 6, 2x5 = 10, 5x1 = 5, 4x3 = 12, 5x1 = 5, 1x7 = 7, 6x1 = 6 : max = 12 [axb means rectangle with height a and width b]

Test Case 2

You can form the following rectangles:
5x3 = 15, 10x2 = 20, 12x1 = 12, 4x4 = 16 : max = 20 [axb means rectangle with height a and width b]
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Rect_area_histogram {

    public static void main(String[] args)throws IOException  {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        int i=0;
        for(int t=0;t<T;t++)
            {
                 Stack<Integer>stk1=new Stack<>();
                 Stack<Integer>stk2=new Stack<>();
                 int n;
            String[] inp=br.readLine().split(" ");
            n=Integer.parseInt(inp[0]);
            inp=br.readLine().split(" ");
                
                int a[]=new int[n];
                int p1[]=new int[n];
                int p2[]=new int[n];
                int b[]=new int[n];
                for(i=0;i<n;i++)
                    a[i]=Integer.parseInt(inp[i]);  
                p1[0]=-1;
                stk1.push(0);
                for(i=1;i<n;i++)
                {
                    while((!stk1.empty())&&(a[i]<=a[stk1.peek()]))
                        stk1.pop();
                    if(stk1.empty())
                        p1[i]=-1;
                    else
                        p1[i]=stk1.peek();
                    stk1.push(i);
                }
                for(i=n-1;i>=0;i--)
                {
                    while((!stk2.empty())&&(a[i]<=a[stk2.peek()]))
                        stk2.pop();
                    if(stk2.empty())
                        p2[i]=n;
                    else
                        p2[i]=stk2.peek();
                    stk2.push(i);
                }
               for(i=0;i<n;i++)
               {
                   b[i]=(p2[i]-p1[i]-1)*(a[i]);
               }
             Arrays.sort(b); 
             bw.write(b[n - 1]+"\n"); 
        }
         bw.flush(); 
    }
}

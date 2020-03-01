/*You are given a series of daily price quotes for a stock and you need to calculate span of stock’s price for each day. The span Si of the stock’s price on current day i is defined as the maximum number of consecutive days just before the current day[including the current day], on which the price of the stock is less than or equal to its price on the current day.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array. The second line contains N integers - the elements of the array, ith element denotes the stock price on ith day.

Constraints

1 <= T <= 200
1 <= N <= 104
0 <= A[i] <= 104

Output Format

For each test case, print space-separated Stock Span Array, separated by new line.

Sample Input 0

2
7
100 80 60 70 60 75 85 
10
0 7 3 6 6 9 18 0 16 0 
Sample Output 0

1 1 1 2 1 4 6 
1 2 1 2 3 6 7 1 2 1
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Stack;

public class Stock_span {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        int i=0;
        for(int t=0;t<T;t++)
            {
                 Stack<Integer>stk=new Stack<>();
                 int n;
            String[] inp=br.readLine().split(" ");
            n=Integer.parseInt(inp[0]);
            //k=Integer.parseInt(inp[1]);
            inp=br.readLine().split(" ");
                
                int a[]=new int[n];
                int b[]=new int[n];
                for(i=0;i<n;i++)
                    a[i]=Integer.parseInt(inp[i]);
                
                     b[0]=1;
                    stk.push(0);
                for(i=1;i<n;i++)
                {
                    while((!stk.empty())&&(a[i]>=a[stk.peek()]))
                        stk.pop();
                    if(stk.empty())
                    {
                        b[i]=i+1;
                        stk.push(i);
                    }
                    else
                    {
                        b[i]=i-stk.peek();
                        stk.push(i);
                    }
                }
                 for(i=0;i<n;i++)
                      bw.write(b[i]+" ");
               bw.write("\n");
            }
             bw.flush(); 
    }
}

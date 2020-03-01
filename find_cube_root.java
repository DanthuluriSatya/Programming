/*
Find the cube root of the given number. Assume that all the input test cases will be a perfect cube.
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each containing a single integer.

Constraints

30 points
1 <= T <= 103
-109 <= N <= 109

70 points
1 <= T <= 106
-1018 <= N <= 1018

Output Format

For each test case, print the cube root of the number, separated by newline.

Sample Input 0

5
-27
-125
1000
6859
-19683
Sample Output 0

-3
-5
10
19
-27
*/

import java.io.*;
import java.util.*;
public class find_cube_root {

    public static void main(String[] args)throws IOException  {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            String[] inp=br.readLine().split(" ");
            long n=Long.parseLong(inp[0]);
            //int r=(int)Math.pow(10, 6);
            long temp=(long)Math.abs(n);
            long low=0;
            long high=(long)Math.pow(10, 6);        
            while(low<=high)
            {
                long mid=(low+high)/2;
                    if(temp==(mid*mid*mid))
                    {
                        if(n>=0)
                        {
                        bw.write(mid+"\n");
                        break;
                        }
                        else
                        {   
                        bw.write(-mid+"\n");    
                        break;
                        }
                    }
                    else if((mid*mid*mid)>temp)
                    high = mid-1; 
                    else
                    {
                    low=mid+1;
                    }      
          }
     }
          bw.flush(); //after all test cases
    }
}

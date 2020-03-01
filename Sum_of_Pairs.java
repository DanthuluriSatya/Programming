/*
Given an array of integers and a number K, check if there exist a pair of indices i,j s.t. a[i] + a[j] = K and i!=j.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, first line of each test case contains N - size of the array and K, and the next line contains N integers - the elements of the array.

Constraints

30 points
1 <= T <= 100
2 <= N <= 1000

70 points
1 <= T <= 300
2 <= N <= 10000

General Constraints
-108 <= K <= 108
-108 <= ar[i] <= 108

Output Format

For each test case, print "True" if such a pair exists, "False" otherwise, separated by newline.

Sample Input 0

3
5 -15
-30 15 20 10 -10 
2 20
10 10 
4 7
-4 0 10 -7 
Sample Output 0

True
True
False
*/
import java.io.*;
import java.util.*;

public class Sum_of_Pairs {
public static void main(String[] args)throws IOException  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
        String[] inp=br.readLine().split(" ");
        int n=Integer.parseInt(inp[0]);
        int k=Integer.parseInt(inp[1]);
        inp=br.readLine().split(" ");
        int m=0;int b=0;int flag=0;
        int i;
         int[] ar = new int[n]; 
        for(i=0;i<n;i++)
            ar[i]=Integer.parseInt(inp[i]);
        Arrays.sort(ar);
        for(int j=0;j<n;j++)
        {
            b=k-ar[j];
            int lo=j+1;int hi=n-1;
            while(lo<=hi)
            {
                m=(lo+hi)/2;
                if(ar[m]==b)
                {
                    bw.write("True"+"\n");
                    flag=1;
                    break;
                }
                if(ar[m]<b)
                    lo=m+1;
                else
                    hi=m-1;
            }
            if(flag==1)
                break;
            
        }
            if(flag==0)
            bw.write("False"+"\n");
            }
     bw.flush(); //after all test cases
    }
}

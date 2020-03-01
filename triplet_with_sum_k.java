/*
You are given an integer array and a number K. You have to tell if there exists i,j,k in the given array such that ar[i]+ar[j]+ar[k]=K, i≠j≠k.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N and K - the size of the array and the number K. The second line contains the elements of the array.

Constraints

30 points
1 <= T <= 100
3 <= N <= 100

70 points
1 <= T <= 100
3 <= N <= 1000

General
-100000 <= A[i] <= 100000
0 <= K <= 100000

Output Format

For each test case, print "true" if the arrays contains such elements, false otherwise, separated by new line.

Sample Input 0

3
5 60
1 20 40 100 80 
12 54
12 45 52 65 21 645 234 -100 14 575 -80 112 
3 15
5 5 5
Sample Output 0

false
true
true
*/
import java.io.*;
import java.util.*;

public class triplet_with_sum_k {
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
        for(i=0;i<n;i++)
        {
             int x=k-ar[i];
            for(int j=i+1;j<n;j++)
            {
             int p=x-ar[j];
             int lo=j+1;int hi=n-1;
            while(lo<=hi)
            {
                m=(lo+hi)/2;
                if(ar[m]==p)
                {
                    bw.write("true"+"\n");
                    flag=1;
                    break;
                }
                if(ar[m]<p)
                    lo=m+1;
                else
                    hi=m-1;
            }
                if(flag==1)
                break;
            }
            if(flag==1)
                break;
            
         }
            if(flag==0)
            bw.write("false"+"\n");
        }
    bw.flush(); //after all test cases
}
}

/*
Input Format

First line of input contains N - size of the array. The next line contains N integers - elements of the array. The next line contains Q - number of queries. Each of the next Q lines contains 2 space separated indexes: i and j.

Constraints

30 points
1 <= N,Q <= 10000

70 points
1 <= N,Q <= 500000

General Constraints
-109 <= A[i] <= 109
0 <= i <= j <= N-1

Output Format

For each query, print the sum of array elements from A[i] to A[j], both inclusive, separated by newline.

Sample Input 0

10
1 30 13 -4 -5 12 -53 -12 43 100 
4
0 5
1 7
2 3
7 9
Sample Output 0

47
-19
9
131
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sum-subarrays {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
        long sum=0;
        long[] arr = new long[n]; 
        for(int i=0;i<n;i++)
        {
            sum=sum+sc.nextLong();
            arr[i]=sum;
        }
          int cases;
        //System.out.println("enter number of cases");
        cases=sc.nextInt();
        for(int T=0;T<cases;T++){
            long sum1=0;
            int f_idx=sc.nextInt();
            int l_idx=sc.nextInt();
            if(f_idx>0)
                sum1=arr[l_idx]-arr[f_idx-1];
            if(f_idx==0)
                sum1=arr[l_idx]; 
            System.out.println(sum1);
        }
    }
}

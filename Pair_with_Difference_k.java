/*You are given an integer array and a positive integer K. You have to tell if there exists a pair of integers in the given array such that ar[i]-ar[j]=K and i≠j.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N and K - the size of the array and the number K. The second line contains the elements of the array.

Constraints

1 <= T <= 50
2 <= N <= 100000
1 <= K <= 100000
-100000 <= A[i] <= 100000

Output Format

For each test case, print "true" if the arrays contains such elements, false otherwise, separated by new line.

Sample Input 0

2
5 60
1 20 40 100 80 
10 11
12 45 52 65 21 645 234 14 575 112 
Sample Output 0

true
false
*/
import java.io.*;
import java.util.*;

public class Pair_with_Difference_k {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int cases=scanner.nextInt();
        for(int T=0;T<cases;T++)
        { 
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int m=0;
            int i;
        int b=0;
            int flag=0;
         int[] ar = new int[n]; 
        for(i=0;i<n;i++)
            ar[i]=scanner.nextInt();
        Arrays.sort(ar);
        for(int j=0;j<n;j++)
        {
            b=ar[j]-k;
            int lo=0;int hi=i-1;
            while(lo<=hi)
            {
                m=(lo+hi)/2;
                if(ar[m]==b)
                {
                    System.out.println("true");
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
            System.out.println("false");
            }
    }
}

/*
Given an array, you have to find the floor of a number x. The floor of a number x is nothing but the largest number in the array less than or equal to x.

Input Format

First line of input contains N - size of the array. The next line contains N integers, the elements of the array. The next line contains Q - number of queries. Each of the next Q lines contains a single integer X, for which you have to find the floor of X in the given array.

Constraints

30 points
1 <= N <= 105
1 <= Q <= 102
-108 <= ar[i] <= 108

70 points
1 <= N <= 105
1 <= Q <= 105
-108 <= ar[i] <= 108

Output Format

For each query, print the floor of X, separated by newline. If floor not found, print the value of "INT_MIN"

Sample Input 0

6
-6 10 -1 20 15 5 
5
-1
10
8
-10
-4
Sample Output 0

-1
10
5
-2147483648
-6
*/
import java.io.*;
import java.util.*;

public class finding_floor {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
          int[] ar = new int[n]; 
        for(int i=0;i<n;i++)
            ar[i]=scanner.nextInt();
           Arrays.sort(ar);
         int cases=scanner.nextInt();
        for(int T=0;T<cases;T++)
        {  
            int flag=0;
            int floor=Integer.MIN_VALUE;
            int x=scanner.nextInt();
            int lo=0;int hi=n-1;
            while(lo<=hi)
            {
                int m=(lo+hi)/2;
                if(ar[m]==x)
                {
                    flag=1;
                System.out.println(ar[m]);
                    break;
                }
                else if(ar[m]>x)
                    hi=m-1;
                else
                {
                    floor=ar[m];
                    lo=m+1;
                }
            }
            if(flag==0)
            System.out.println(floor);   
        }
    }
}

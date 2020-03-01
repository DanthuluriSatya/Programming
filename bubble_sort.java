/*
Implement Bubble Sort and print the total number of swaps involved to sort the array.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - size of the array. The next line contains N integers - elements of the array.

Constraints

1 <= T <= 100
1 <= N <= 100
-1000 <= ar[i] <= 1000

Output Format

For each test case, print the total number of swaps, separated by new line.

Sample Input 0

4
8
176 -272 -272 -45 269 -327 -945 176 
2
-274 161
7
274 204 -161 481 -606 -767 -351
2
154 -109
Sample Output 0

15
0
16
1
*/
import java.io.*;
import java.util.*;

public class bubble_sort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int cases=scanner.nextInt();
        int n;
            for(int c=0;c<cases;c++)
            {
                n=scanner.nextInt();
                int[] a = new int[n]; 
                for(int i=0;i<n;i++)
                {
                a[i]=scanner.nextInt(); 
                }
                int temp=0;
                int swap=0;
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n-1;j++)
                    {
                       if(a[j]>a[j+1])
                       {
                           swap++;
                           temp=a[j];
                           a[j]=a[j+1];
                           a[j+1]=temp;
                       }
                    }
                }
                System.out.println(swap);
            }
        
        
        
    }
}
                

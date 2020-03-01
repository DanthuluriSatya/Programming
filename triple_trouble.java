/*
Given an array of size 3X+1, where every element occurs three times, except one element, which occurs only once. Find the element that occurs only once.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array (of the form 3X + 1) and second line contains the elements of the array.

Constraints

1 <= T <= 300
1 <= N <= 104
1 <= A[i] <= 109

Output Format

For each test case, print the number which occurs only once, separated by new line.

Sample Input 0

2
10
5 7 8 7 7 5 5 9 8 8 
7
10 20 20 30 20 10 10 
Sample Output 0

9
30
*/
import java.io.*;
import java.util.*;

public class triple_trouble {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int cases;
        //System.out.println("enter number of cases");
        cases=scanner.nextInt();
        for(int T=0;T<cases;T++){
            int sum=0;
        int n=scanner.nextInt();
        int[] a = new int[n]; 
            int i,count;
        for(i=0;i<n;i++)
        {
            int ele=scanner.nextInt();
            a[i]=ele;
        }
            for(i=0;i<32;i++)
            {
                 count=0;
                for(int j=0;j<n;j++)
                {
                    if(((1<<i)&(a[j]))!=0)
                        count++;
                }
                int rem=count%3;
                int pwr=(int)(Math.pow(2, i));
                sum=sum+(rem*pwr);  
            }
            System.out.println(sum);
        }
    }
}

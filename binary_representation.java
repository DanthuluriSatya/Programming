/*
Given a positive integer, print its binary representation.
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line containing a single integer.

Constraints

1 <= T <= 10000
0 <= N <= 109

Output Format

For each test case, print binary representation, separated by new line.

Sample Input 0

5
10
15
7
1
120
Sample Output 0

1010
1111
111
1
1111000
*/
import java.io.*;
import java.util.*;

public class binary_representation {

    public static void main(String[] args) {
        int cases;
    int n;
            Scanner scanner = new Scanner(System.in);
            cases=scanner.nextInt();
             int[] a = new int[32]; 
            for(int i=0;i<cases;i++)
            {
                int y;
                n=scanner.nextInt();
                int h=0;
                if(n==0)
                   System.out.print(n); 
                while(n>0)
                {
                    a[h]=n%2;
                    n=n/2;
                    h++;
                }
                for( int k=h-1;k>=0;k--)
                    {
                       System.out.print(a[k]);
                    }
                System.out.println();
                    
            }
    }}

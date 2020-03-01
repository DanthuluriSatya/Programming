/*
Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line containing a single positive integer.

Constraints

1 <= T <= 10000
1 <= N <= 1018

Output Format

For each test case, print "True" or "False", separated by new line.

Sample Input 0

5
1
8
10
25
512
Sample Output 0

True
True
False
False
True
*/

import java.io.*;
import java.util.*;

public class check_power_of_two {

    public static void main(String[] args) {
        
       int cases;
            Scanner scanner = new Scanner(System.in);
            cases=scanner.nextInt();
            for(int i=0;i<cases;i++)
            { 
                long n = scanner.nextLong();
        if(n>0)
    {
        while(n%2 == 0)
        {
            n/=2;
        }
        if(n == 1)
        {
            System.out.print("True");
        }
    }
    if(n == 0 || n != 1)
    {
      System.out.print("False");  
    }
         System.out.println();
    }
}
}

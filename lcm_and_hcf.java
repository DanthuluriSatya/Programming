/*
Given 2 numbers, find their LCM and HCF.
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each contains 2 numbers A and B.

Constraints

1 <= T <= 105
1 <= A,B <= 109

Output Format

For each test case, print their LCM and HCF separated by space, separated by newline.

Sample Input 0

4
4 710
13 1
6 4
605904 996510762
Sample Output 0

1420 2
13 1
12 2
7740895599216 78
*/


import java.io.*;
import java.util.*;

public class lcm_and_hcf {

    public static void main(String[] args) {
         long x, y;
        int cases;
           Scanner sc = new Scanner(System.in);
        
           cases=sc.nextInt();
            for(int i=0;i<cases;i++)
            {
              x = sc.nextLong();
              y = sc.nextLong();
              long g=(long)gcd(x,y);
        
              long z =(long)((x*y)/(g));
        System.out.print(z+" ");
        System.out.print(g);
        System.out.println();
    }
    }
    
    static long gcd(long x, long y){
        //in case any of them is zero then gcd is zero
       
      
        if(x==0)
            return y;


        return gcd(y%x,x);
    }
    
}

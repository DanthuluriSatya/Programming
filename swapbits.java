/*
Given a number, swap the adjacent bits in the binary representation of the number, and print the new number formed after swapping.

Input Format

First line of input contains T - number of test cases. Each of the next T lines contains a number N.

Constraints

1 <= T <= 100000
0 <= N <= 109

Output Format

For each test case, print the new integer formed after swapping adjacent bits, separated by new line.

Sample Input

4
10
7
43
100

Sample Output

5
11
23
152

Explanation

Test Case 1

Binary Representation of 10: 000...1010
After swapping adjacent bits: 000...0101 (5)

Test Case 2

Binary Representation of 7: 000...0111
After swapping adjacent bits: 000...1011 (11)
*/
import java.io.*;
import java.util.*;
import java.lang.Math;

public class swapbits {

    public static void main(String[] args) {
           int y; 
           int cases;
           int a=0;
           int b=0;
           int temp=0;
            Scanner scanner = new Scanner(System.in);
           cases=scanner.nextInt();
            for(int i=0;i<cases;i++)
            {
            int n = scanner.nextInt();
            int[] rem = new int[32]; 
            int[] modify = new int[32]; 



            for(int j=0;j<32;j++)
            {
              rem[j]=n%2;
              n=n/2;
            }


            for(a=0,b=a+1;a<32;a=a+2,b=b+2)
            {
              temp=rem[a];
              rem[a]=rem[b];
              rem[b]=temp;
            }

            for(int m=0;m<32;m++)
            {
              modify[m]=rem[32-m-1];
             
            }


             int x=0;
            for(int k=0;k<32;k++)
            {
              y=(int)(modify[32-k-1]*Math.pow(2,k));
              x=(x+y);
            }
              System.out.println(x);
          }
}
}

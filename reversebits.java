/*
Given a number, reverse the bits in the binary representation (consider 32-bit unsigned data) of the number, and print the new number formed.

Input Format

First line of input contains T - number of test cases. Each of the next T lines contains a number integer N.

Constraints

1 <= T <= 100000
0 <= N <= 109

Output Format

For each test case, print the new number formed after reversing the bits, separated by new line.

Sample Input

4
4
15
6
1000000000

Sample Output

536870912
4026531840
1610612736
5462492

Explanation

Test Case 1

Binary Representation of 4: 000...100
After reversing the bits: 001...000 (536870912)

Test Case 2

Binary Representation of 15: 000...1111
After reversing the bits: 1111...000 (4026531840)
*/
import java.io.*;
import java.util.*;
import java.lang.Math;
public class reversebits {

    public static void main(String[] args) {
           long y; 
           int cases;
            Scanner scanner = new Scanner(System.in);
            cases=scanner.nextInt();
            for(int i=0;i<cases;i++)
            {
            int n = scanner.nextInt();
            int[] rem = new int[32]; 
            for(int j=0;j<32;j++)
            {
              rem[j]=n%2;
              n=n/2;
            }
             long x=0;
            for(int k=0;k<32;k++)
            {
              y=(long)(rem[32-k-1]*Math.pow(2,k));
              x=(x+y);
            }
              System.out.println(x);
          }
}
}

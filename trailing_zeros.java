/*Count the number of trailing 0s in factorial of a given number.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each containing an integer N.

Constraints

1 <= T <= 10000
1 <= N <= 1015

Output Format

For each test case, print the number of trailing 0s in N!, separated by new line.

Sample Input 0

3
2
5
20
Sample Output 0

0
1
4


*/
import java.io.*;
import java.util.*;

public class trailing_zeros {

    public static void main(String[] args) {
        int cases;
            Scanner scanner = new Scanner(System.in);
            cases=scanner.nextInt();

            for(int T=0;T<cases;T++)
            {
                
                long n = scanner.nextLong();
                long count=0;
            for(long i=5;(n/i)>=1;i=i*5)
           { 
             
                long res=(n/i);
            count+=(res);
                
          }
         System.out.println(count); 
            }
    }
}

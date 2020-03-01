/* Given an array of integers, find the sum of the elements of the given array.
Note: Try to solve this without declaring/storing the array elements.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array and second line contains the elements of the array.

Constraints

1 <= T <= 100
1 <= N <= 1000
1 <= ar[i] <= 1e15

Output Format

For each test case, print the sum of the elements of the array, separated by new line.

Sample Input 0

2
3
5 15 3 
2
70 100 
Sample Output 0

23
170

*/

import java.io.*;
import java.util.*;

public class sum_array_ele {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
           int cases = scanner.nextInt();
          
            for (int i=0;i<cases;i++)
            {
               int p= scanner.nextInt(); 
                long sum=0;
                 long k=0;
                for (int j=0;j<p;j++)
                {
                 k = scanner.nextLong(); 
                 sum=(long)(sum+k);
                 }
           
          System.out.println(sum);         
       
          }
        
        
    }
}

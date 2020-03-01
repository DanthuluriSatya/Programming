/*Given a 2D square matrix, print the matrix in a spiral order. Refer examples for more details. From interviews point of view, after you scan the matrix in a 2D array, try to print the matrix in a spiral order without using any extra space.


Input Format

First line of input contains T - number of test cases. First line of each test case contains N - size of the matrix [NxN]. Its followed by N lines each containing N integers - elements of the matrix.

Constraints

1 <= T <= 100
1 <= N <= 100
-100 <= ar[i][j] <= 100

Output Format

For each test case, print the matrix in a spiral order, separated by newline.

Sample Input 0

4
1
1
2
1 2
4 3
3
1 2 3
8 9 4
7 6 5
5
-44 25 -52 69 -5 
17 22 51 27 -44 
-79 28 -78 1 -47 
65 -77 -14 -21 -6 
-96 43 -21 -20 90 
Sample Output 0

1 
1 2 3 4 
1 2 3 4 5 6 7 8 9 
-44 25 -52 69 -5 -44 -47 -6 90 -20 -21 43 -96 65 -79 17 22 51 27 1 -21 -14 -77 28 -78 

*/

import java.io.*;
import java.util.*;

public class spiral_traversal_matrix {

    public static void main(String[] args) {
         int n;

            Scanner scanner = new Scanner(System.in);
        int cases=scanner.nextInt();
            for(int T=0;T<cases;T++)
            {
            //System.out.print("enter N1");
            n = scanner.nextInt();

             int[][] m1 = new int[n][n]; 

            for(int row=0;row<n;row++)
            {
                for(int col=0;col<n;col++)
                {
                  int ele=0;
                  // System.out.print("enter elements");
                   ele=scanner.nextInt();
                   m1[row][col]=ele;
                }
            }

       
 for(int k=0;k<n;k++)
 {
  n=n-1;
  int i=k;
  for( int j=i;j<=n;j++)
    System.out.print(m1[i][j]+" ");

   int j=n;
    for(i=i+1;i<=n;i++)
       System.out.print(m1[i][j]+" ");

     i=n;
     for( j=i-1;j>=k;j--)
       System.out.print(m1[i][j]+" ");


      j=k;
     for(i=n-1;i>0;i--)
     {
       if(i>j)
       System.out.print(m1[i][j]+" ");
     }
  }

System.out.println();


            }


}}
 

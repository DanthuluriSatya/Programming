/*
Given 2 matrices, find the product.

Input Format

First line of input contains T - number of test cases. First line of each test case contains N1, M1 - size of the 1st matrix. Its followed by N1 lines each containing M1 intergers - elements of the 1st matrix. The next line contains N2, M2 - size of the 2nd matrix. Its followed by N2 lines each containing M2 intergers - elements of the 2nd matrix. Note that M1 = N2.

Constraints

1 <= T <= 100
1 <= N1,M1,N2,M2 <= 50
-100 <= mat[i][j] <= 100

Output Format

For each test case, print the resultant product matrix, separated by newline.

Sample Input 0

2
2 2
1 2 
3 -1 
2 3
1 -2 3 
2 3 -1 
2 3
27 29 53 
-28 49 -24 
3 4
23 52 -38 72 
-64 15 -59 -10 
-75 43 10 25 
Sample Output 0

5 4 1 
1 -9 10 
-5210 4118 -2207 2979 
-1980 -1753 -2067 -3106 
*/

import java.io.*;
import java.util.*;

public class matrices_product {

    public static void main(String[] args) {

int N1,N2,M1,M2,cases;

            Scanner scanner = new Scanner(System.in);
        cases=scanner.nextInt();
            for(int t=0;t<cases;t++)
            {
            //System.out.print("enter N1");
            N1 = scanner.nextInt();
            //System.out.print("enter M1");
            M1 = scanner.nextInt();
             int[][] m1 = new int[N1][M1]; 

            for(int i=0;i<N1;i++)
            {
                for(int j=0;j<M1;j++)
                {
                  int ele=0;
                   //System.out.print("enter elements");
                   ele=scanner.nextInt();
                   m1[i][j]=ele;
                }
            }

            //System.out.print("enter N2");
            N2 = scanner.nextInt();
            //System.out.print("enter M2");
            M2 = scanner.nextInt();
           int[][] m2 = new int[N2][M2]; 
            
            for(int i=0;i<N2;i++)
            {
                for(int j=0;j<M2;j++)
                {
                   int ele=0;
                   //System.out.print("enter elements");
                   ele=scanner.nextInt();
                   m2[i][j]=ele;
                }
            }
 int[][] c = new int[N1][M2]; 
          if(M1==N2)
            {
              for(int i=0;i<N1;i++)
              {
                for (int j=0;j<M2;j++)
                {
                  for(int k=0;k<M1;k++)
                  {
                    c[i][j]+=m1[i][k]*m2[k][j];
                  }
                }
              }
            }

            



//System.out.print("printing arrays");
            for(int i=0;i<N1;i++)
           {
                for(int j=0;j<M2;j++)
                {
                  
                   System.out.print(c[i][j]+" ");
                }
                System.out.println();

            }

    }



          }
        }
            



           

/*Print hollow diamond pattern using '*'. See examples for more details.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single odd integer N - the size of the diamond.

Constraints

1 <= T <= 100
3 <= N <= 201

Output Format

For each test case, print the test case number as shown, followed by the diamond pattern, separated by newline.

Sample Input 0

4
3
7
5
15
Sample Output 0

Case #1:
 *
* *
 *
Case #2:
   *
  * *
 *   *
*     *
 *   *
  * *
   *
Case #3:
  *
 * *
*   *
 * *
  *
Case #4:
       *
      * *
     *   *
    *     *
   *       *
  *         *
 *           *
*             *
 *           *
  *         *
   *       *
    *     *
     *   *
      * *
       *
*/
import java.io.*;
import java.util.*;

public class hollowdiamond {

    public static void main(String[] args) {
        int cases;
            Scanner scanner = new Scanner(System.in);
            //System.out.println("enter number of cases");
            cases=scanner.nextInt();
            for(int T=0;T<cases;T++)
            {
       int n= scanner.nextInt();
       String[][] a = new String[n][n]; 
        
        
      int i,j;
                
        System.out.println("Case #"+(T+1)+":");
        //upper triangle 1st half
        i=0;
        for(j=n/2;j>=0;j--)
        {
            a[i][j]="*";
            i++;
        }
        //upper triangle 2nd half
         i=0;
        for(j=n/2;j<n;j++)
        {
              a[i][j]="*";
             // System.out.println(a[i][j]);
              i++;
        }
        //lower triangle 1st half
        j=0;
        for(i=n/2;i<n;i++)
        {
              a[i][j]="*";
              //System.out.println(a[i][j]);
              j++;
        }
        //lower triangle 2nd half
        i=n-1;
        for(j=n/2;j<n;j++)
        {
              a[i][j]="*";
              //System.out.println(a[i][j]);
              i--;
        }
              
                
            for(i=0;i<n;i++)
           {
                for(j=0;j<n;j++)
                {
                   if((a[i][j])!=null)
                   System.out.print(a[i][j]);
                    else
                    System.out.print(" ");
                }
                
            System.out.println();

            }
     
 }//test cases    
        
        
        
    }
}
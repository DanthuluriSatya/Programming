/*Print mirror image of right-angled triangle using '*'. See examples for more details.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single integer N - the size of the pattern.

Constraints

1 <= T <= 100
1 <= N <= 100

Output Format

For each test case, print the test case number as shown, followed by the pattern, separated by newline.

Sample Input 0

4
2
1
5
10
Sample Output 0

Case #1:
 *
**
Case #2:
*
Case #3:
    *
   **
  ***
 ****
*****
Case #4:
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********
*/

import java.io.*;
import java.util.*;

public class rightangletriangle {

    public static void main(String[] args) {
        int n;
        int cases;
        Scanner sc=new Scanner(System.in);
        cases=sc.nextInt();
        for(int k=0;k<cases;k++){
             n=sc.nextInt();
            System.out.println("Case #"+(k+1)+":");
            for(int i=n;i>0;i--){
                for(int j=1;j<=n;j++){
                    if(i<=j)
                         System.out.print("*"); 
                    else
                        System.out.print(" "); 
                }
                System.out.println(); 
            }

            
        }
        


     }
 }

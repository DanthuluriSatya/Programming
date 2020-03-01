/*
Given 2 numbers - a and b, evaluate ab.
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line containing 2 numbers - a and b, separated by space.

Constraints

30 points
1 <= T <= 1000
0 <= a <= 106
0 <= b <= 103

70 points
1 <= T <= 1000
0 <= a <= 106
0 <= b <= 109

Output Format

For each test case, print ab, separated by new line. Since the result can be very large, print result % 1000000007

Sample Input 0

4
5 2
1 10
2 30
10 10
Sample Output 0

25
1
73741817
999999937
*/
import java.io.*;
import java.util.*;

public class compute_a_power_b {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
            int cases=scanner.nextInt();
            long M=(long)Math.pow(10,9)+7;
            for(int j=0;j<cases;j++)
            {
              int a = scanner.nextInt();
              int b = scanner.nextInt();
                long x=a;
                long ans=1;
               double k= (Math.log(b) / Math.log(2));
                    for(int i=0;i<=k;i++)
                    {
                     
                        if((1<<i & b) != 0)
                            ans=(long)((ans%M)*(x%M))%M;
                        x=((x%M)*(x%M))%M;
                    }
                         System.out.println(ans);
            }
                
    }
}

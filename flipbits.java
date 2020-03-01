/*You are given two numbers A and B. Write a program to count the number of bits to be flipped to change the number A to the number B. Flipping a bit of a number means changing a bit from 1 to 0 or vice versa.

Input Format

First line of input contains T - number of test cases. Each of the next T lines contains 2 integer A and B, separated by space.

Constraints

1 <= T <= 100000
0 <= N <= 109

Output Format

For each test case, print the number of bit flips required to convert A to B, separated by new line.

Sample Input 0

4
20 10
16 8
1 153
549 24
Sample Output 0

4
2
3
6

*/
import java.io.*;
import java.util.*;

public class flipbits {

    public static void main(String[] args) {
        int cases;
        Scanner sc=new Scanner(System.in);
        cases=sc.nextInt();
        int swap=0;
        for(int i=0;i<cases;i++)
        {
            int n1;
            int rem1;
            int n2;
            int rem2;
            n1=sc.nextInt();
            n2=sc.nextInt();
            for(int j=0;j<64;j++)
            {
                rem1=n1%2;
                n1=n1/2;
                rem2=n2%2;
                n2=n2/2;
                if(rem1!=rem2)
                    swap++;
            }
            System.out.println(swap);
            swap=0;
        }
    }
}

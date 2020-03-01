/*
There are 2 teams, each having N players. There will be N rounds played between the 2 teams. In every round, a player from team A plays against a player from team B. The more powerful player wins the game. Given the strength of the players of both the teams, you have to find the maximum number of rounds team A can win. Note that a player cannot play more than 1 round.

Input Format

First line of input contains T - number of test cases. Its followed by 3T lines. The first line contains N - size of the team. The next 2 lines contains N numbers each - strength of the players of team A and team B respectively.

Constraints

1 <= T <= 500
1 <= N <= 10000
0 <= A[i], B[i] <= 10000

Output Format

For each test case, print the maximum number of rounds team A can win, separated by newline.

Sample Input 0

3
4
1 5 7 4 
3 8 2 10 
2
2 3 
10 5 
3
3 7 10 
5 20 15 
Sample Output 0

2
0
1
Explanation 0

Test Case 1
Player with strength 5 in team A can defeat player with strength 3 in team B.
Player with strength 7 in team A can defeat player with strength 2 in team B.

Test Case 2
No Player in team A can defeat any player in team B.

Test Case 1
Player with strength 7 in team A can defeat player with strength 5 in team B.
*/
import java.io.*;
import java.util.*;

public class Power_Game {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int cases;
        //System.out.println("enter number of cases");
          cases=scanner.nextInt();
    for(int T=0;T<cases;T++){
        int count=0;
        int ele;
        int i;
        int n=scanner.nextInt();
        int[] a = new int[n]; 
        int[] b = new int[n]; 
        for(i=0;i<n;i++)
        {
            ele=scanner.nextInt();
            a[i]=ele;
        }
        for(i=0;i<n;i++)
        {
            ele=scanner.nextInt();
            b[i]=ele;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int p1=0;int p2=0;
        while(p1<n&&p2<n)
        {
            if(a[p1]<=b[p2])
                p1++;
            else{
                count++;
                p2++;
                p1++;
            }
            
        }
        System.out.println(count);
    }
            
    }
}

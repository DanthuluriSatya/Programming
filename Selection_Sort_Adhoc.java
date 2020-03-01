/*
Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - size of the array. The next line contains N integers - elements of the array.

Constraints

1 <= T <= 100
2 <= N <= 100
-1000 <= ar[i] <= 1000


Output Format

For each test case, print the index which gets swapped at each step, separated by space. Separate the output of different tests by newline.

Sample Input 0

6
8
176 -272 -272 -45 269 -327 -945 176 
2
-274 161 
7
274 204 -161 481 -606 -767 -351 
2
154 -109 
4
5 3 1 5 
4
40 10 20 40 
Sample Output 0

4 0 4 3 1 2 1 
1 
3 0 1 2 2 1 
0 
0 0 1 
0 0 0 
*/
import java.io.*;
import java.util.*;

public class Selection_Sort_Adhoc{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int cases=scanner.nextInt();
            int temp=0;
            int j;
            for(int c=0;c<cases;c++)
            {
                int n = scanner.nextInt();
                
            
                int[] a = new int[n]; 
                for(int i=0;i<n;i++)
                {
                a[i]=scanner.nextInt(); 
                }
              
                for(int i=0;i<n-1;i++)
                {
                    int maxele=a[n-i-1];
                    int maxidx=(n-i-1);
                  
                    for( j=0;j<(n-i-1);j++)
                    {
                        if(a[j]>=maxele)
                        {
                            if(a[j]==maxele)
                            {
                                if(j>maxidx){
                                    maxele=a[j];
                                    maxidx=maxidx;}
                                else{
                            
                                 maxele=a[j];
                                  maxidx=j;
                                   }
                            }
                            else{
                            
                            maxele=a[j];
                            maxidx=j;
                            }
                        }
                    }
                        
                   System.out.print(maxidx+" "); 
                    
                    temp=a[n-i-1];
                    a[n-i-1]=a[maxidx];
                    a[maxidx]=temp;
                        
                }   
                
              System.out.println();  
          }
    }
}

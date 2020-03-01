/*
Given an array of integers and a window size K, find the number of distinct elements in every window of size K of the given array.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - size of the array and K - size of the window. The second line contains N integers - elements of the array.

Constraints

1 <= T <= 1000
1 <= N <= 10000
1 <= K <= N
-100 <= ar[i] <= 100

Output Format

For each test case, print the number of distinct elements in every window of size K, separated by newline.

Sample Input 0

3
5 3
-2 -4 -2 4 -2 
10 7
3 -4 -3 -4 -2 0 2 -2 6 0 
17 13
-5 -1 4 8 -5 -3 -4 7 4 -4 0 8 0 -2 3 2 5 
Sample Output 0

2 3 2 
6 5 6 5 
8 9 9 10 11 
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Distinct_ele_window {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++)
        {
            String[] inp=br.readLine().split(" ");
            int n=Integer.parseInt(inp[0]);
            int k=Integer.parseInt(inp[1]);
            int[] arr = new int[n]; 
            int i=0;
            String[] input=br.readLine().split(" ");
            for(i=0;i<n;i++)
             {
              //read ele to array
              arr[i]=Integer.parseInt(input[i]);
             }
            Map<Integer,Integer> map=new HashMap<Integer,Integer> ();
            int distinct_cnt=0;Integer c=0;
            
            for(i=0;i<k;i++)
             {  
                c=map.get(arr[i]);
                if(map.get(arr[i])==null)
                {
                map.put(arr[i],1);
                distinct_cnt+=1;
                }
                else
                {
                int count = map.get(arr[i]); 
                map.put(arr[i],count+1);
                }
            }   
          bw.write(distinct_cnt+" ");
           
            for(i=k;i<arr.length;i++)
            {   
                
                if (map.get(arr[i-k]) == 1) 
                {
                map.remove(arr[i-k]); 
                distinct_cnt--;    
                }
                else
                {
                 int count = map.get(arr[i-k]); 
                 map.put(arr[i-k], count-1); 
                }
            
                if(map.get(arr[i])==null)
                {
                map.put(arr[i],1);
                distinct_cnt+=1;
                }
                else
                { 
                int count = map.get(arr[i]); 
                map.put(arr[i],count+1);
                }
             bw.write(distinct_cnt+" ");
            }
   
           bw.write("\n");
       } 
         bw.flush(); //after all test cases
           
}
}

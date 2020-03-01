/*
Given an array, you have to find the frequency of a number x.

Input Format

First line of input contains N - size of the array. The next line contains N integers, the elements of the array. The next line contains Q - number of queries. Each of the next Q lines contains a single integer X, for which you have to find the frequency of X in the given array.

Constraints

30 points
1 <= N <= 105
1 <= Q <= 102
-108 <= ar[i] <= 108

70 points
1 <= N <= 105
1 <= Q <= 105
-108 <= ar[i] <= 108

Output Format

For each query, print the frequency of X, separated by newline.

Sample Input 0

9
-6 10 -1 20 -1 15 5 -1 15
5
-1
10
8
15
20
Sample Output 0

3
1
0
2
1
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class find_frequency {
 public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        String[] inp=br.readLine().split(" ");
        int[] arr = new int[n]; 
        int k;
        Integer c;
        HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(inp[i]);
        
        for(int j=0;j<n;j++){
            c=hmap.get(arr[j]);
            if(hmap.get(arr[j])==null)
                hmap.put(arr[j],1);
            else
                hmap.put(arr[j],++c);
        }
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            int e=Integer.parseInt(br.readLine());
            Integer r =hmap.get(e);
            if(hmap.get(e)==null)
                bw.write("0"+"\n"); 
            else
                bw.write(r+"\n");         
        }                          
        bw.flush(); //after all test cases

    }
}

/*
Given an array of unique elements, construct a Binary Search Tree and print the sum of all the numbers formed along the path from the root node to the leaf nodes.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes.

Constraints

1 <= T <= 1000
1 <= N <= 1000
0 <= ar[i] <= 10000

Output Format

For each test case, print the sum, separate each traversal by newline. Since the output can be very large, print output % 1000000007.

Sample Input 0

3
5
1 2 3 4 5
5
3 2 4 1 5
7
4 5 15 2 1 7 17
Sample Output 0

12345
666
497095
Explanation 0

Test Case 1
Total Sum = 12345

Test Case 2
Total Sum = 321 + 345 = 666

Test Case 3
Total Sum = 421 + 45157 + 451517 = 497095
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public class Node 
    { 
        int data; 
        Node left, right; 

        public Node(int item) 
        { 
            data = item; 
            left = right = null; 
        } 
    }   
   public Node insert(Node root,int x)
    {
        if(root==null){
            Solution s=new Solution();
            Solution.Node root1 = s.new Node(x);
            return root1;
        }
        if(x<root.data)
            root.left=insert(root.left,x);
        else if(x>root.data)
             root.right=insert(root.right,x);
        return root;
    }
    public int digits(int data)
    {
        int count=1;
        while((data/10)!=0)
        {
            count++;
            data=data/10;
        }
        return count;
    }
    public long sumAlongPath(Node root,long sum,long K)
    {
        if(root==null)
            return 0;
        sum=(sum%K)*(long) Math.pow(10, digits(root.data))+(long)root.data;
        if(root.left==null&&root.right==null)
            return sum%K;
        return sumAlongPath(root.left,sum%K,K)+sumAlongPath(root.right,sum%K,K);
    }
        
      
     public static void main(String[] args) throws IOException {
         
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
         long K=(long)Math.pow(10,9)+7;
         
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            int n;
            String[] inp=br.readLine().split(" ");
            n=Integer.parseInt(inp[0]);
            inp=br.readLine().split(" ");
 
            Node root=null;
            for(int i=0;i<n;i++)
            {
               int ele=Integer.parseInt(inp[i]);
                Solution s = new Solution();
                root=s.insert(root,ele);
            }
            Solution soln = new Solution();
            long result= soln.sumAlongPath(root,0,K);
            bw.write((result%K)+"\n");
        }
         
          bw.flush(); //after all test cases
   
    }
}

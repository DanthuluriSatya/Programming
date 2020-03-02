/*
Given an array of unique elements, construct a Binary Search Tree. Now, given two nodes u and v of the BST, find their Lowest Common Ancestor (LCA). LCA is defined as the furthest node from the root that is an ancestor for both u and v.

Input Format

First line of input contains T - number of test cases. First line of each test case contains N, Q - number of nodes in the BST and the number of queries. The next line contains N unique integers - value of the nodes. Its followed by Q lines, each contains 2 nodes of the tree, u and v.

Constraints

1 <= T <= 1000
1 <= N,Q <= 1000
0 <= ar[i] <= 10000

Output Format

For each test case, for each query print the LCA of the given nodes u and v, separated by space. Separate the output of different test cases with a newline.

Sample Input 0

2
5 2
3 2 4 1 5
2 5
1 2
7 3
4 5 15 0 1 7 17
0 15
7 17
17 4
Sample Output 0

3 2 
4 15 4 
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LCA_Tree {
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
    public int lca(Node root, int v1, int v2) {
          // Write your code here.
          if(v1<=root.data&&v2>=root.data)
          return root.data;
          if(Math.min(v1,v2)>root.data)
          return lca(root.right, v1, v2);
          if(Math.max(v1,v2)<root.data) 
           return lca(root.left, v1, v2);
           else
           return root.data;

    } 
     public static void main(String[] args) throws IOException {
     
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            int n,Q;
            String[] inp=br.readLine().split(" ");
            n=Integer.parseInt(inp[0]);
            Q=Integer.parseInt(inp[1]);
            inp=br.readLine().split(" ");
 
            Node root=null;
            for(int i=0;i<n;i++)
            {
               int ele=Integer.parseInt(inp[i]);
                Solution s = new Solution();
               root=s.insert(root,ele);
            }
            for(int q=0;q<Q;q++)
            {
               String[] input=br.readLine().split(" ");
               int x= Integer.parseInt(input[0]);
               int y= Integer.parseInt(input[1]);
               Solution soln = new Solution();
               int res=soln.lca(root,x,y); 
               bw.write(res+" ");
            }
             bw.write("\n");
        }
         
          bw.flush(); //after all test cases
   
    }
}

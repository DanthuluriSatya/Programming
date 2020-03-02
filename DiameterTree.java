/*
Given an array of unique elements, construct a Binary Search Tree and find the diameter of the tree. Diameter is defined as the number of nodes on the longest path between 2 nodes of the tree.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes.

Constraints

1 <= T <= 1000
1 <= N <= 5000
0 <= ar[i] <= 10000

Output Format

For each test case, print the diameter of the Binary Search Tree, separated by newline.

Sample Input 0

3
5
1 2 3 4 5 
5
2 4 3 1 5 
7
4 5 15 0 1 7 17 
Sample Output 0

5
4
6

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiameterTree {
    public static int result=0;
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
   public static Node insert(Node root,int x)
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
     public static int numofnodesinpath(Node root)
     {
         if(root==null)
             return -1;
         int left_height=numofnodesinpath(root.left);
         int right_height=numofnodesinpath(root.right);
           result=Math.max(result,left_height+1+right_height+1+1);
         return 1+Math.max(left_height,right_height);
         
     }
     
     public static void main(String[] args) throws IOException {
     
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
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
           root=Solution.insert(root,ele);
        }
            result=0;
            Solution.numofnodesinpath(root);
            bw.write(result+"\n");
            
            
      }
         
          bw.flush(); //after all test cases
   
    }
}

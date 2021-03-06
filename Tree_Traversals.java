/*
Given an array of unique elements, construct a Binary Search Tree and print the PreOrder, InOrder and PostOrder Traversals of the tree.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes.

Constraints

1 <= T <= 1000
1 <= N <= 1000
0 <= ar[i] <= 10000

Output Format

For each test case, print the PreOrder, InOrder and PostOrder Traversals of the Binary Search Tree, separate each traversal by newline. Separate the output of different test cases with an extra newline.

Sample Input 0

3
5
1 2 3 4 5 
5
3 2 4 1 5 
7
4 5 15 0 1 7 17 
Sample Output 0

1 2 3 4 5 
1 2 3 4 5 
5 4 3 2 1 

3 2 1 4 5 
1 2 3 4 5 
1 2 5 4 3 

4 0 1 5 15 7 17 
0 1 4 5 7 15 17 
1 0 7 17 15 5 4 
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tree_Traversals {
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
   
        public static void preOrder(Node root,BufferedWriter bw)
     {
        if(root==null)
        return;
       try{ bw.write(root.data+" ");}  catch(IOException e){}
        preOrder(root.left,bw);
        preOrder(root.right,bw);  
     }
     public static void inOrder(Node root,BufferedWriter bw)
     {
         if(root==null)
         return;
         inOrder(root.left,bw);
        try{ bw.write(root.data+" ");}catch(IOException e){}
         inOrder(root.right,bw);
         
     }
     public static void postOrder(Node root,BufferedWriter bw)
     {
         if(root==null)
         return;
         postOrder(root.left,bw);
         postOrder(root.right,bw);    
        try{ bw.write(root.data+" ");}catch(IOException e){}
         
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
            Solution.preOrder(root,bw);
            bw.write("\n");
            Solution.inOrder(root,bw);
            bw.write("\n"); 
            Solution.postOrder(root,bw);
            bw.write("\n"); 
            bw.write("\n"); 
      }
         
          bw.flush(); //after all test cases
   
    }
}

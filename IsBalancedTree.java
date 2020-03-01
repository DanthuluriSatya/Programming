/*
Given an array of unique elements, construct a Binary Search Tree and check if its balanced. A tree is said to be balanced if for every node, the difference between the height of its child nodes is not greater than 1.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes.

Constraints

1 <= T <= 1000
1 <= N <= 1000
0 <= ar[i] <= 10000

Output Format

For each test case, print "Yes" if the Binary Search Tree is balanced, "No" otherwise, separated by newline.

Sample Input 0

3
5
1 2 3 4 5 
5
3 2 4 1 5 
7
4 5 15 0 1 7 17 
Sample Output 0

No
Yes
No
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IsBalancedTree{
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
   /* public static void balanced(Node root,BufferedWriter bw)
    {
        if(root==null){
            try{ bw.write("Yes");}catch(IOException e){}
        }
        else{
            
           int diff=Math.abs(   height(root.left)  -  height(root.right)  );
           if(diff>1)
                try{  bw.write("No");}catch(IOException e){}
           else
                try{ bw.write("Yes");}catch(IOException e){}
        }
       
    }*/
     public static int isBalanced(Node A) {
        if(A==null)
        return 1;
        
        if(A.left==null&&A.right==null)
        return 1;
        
        int lh= height(A.left);
        int rh= height(A.right);
         
        if(  (Math.abs(lh-rh)<=1)&&(isBalanced(A.left)==1)&&(isBalanced(A.right)==1) )
           return 1;
        else
          return 0;
       }
    
     public static int height(Node root)
    {
        if(root==null)
            return -1;
         return 1+Math.max(height(root.left),height(root.right));
        
    }
    
    /*public static int height(Node root)
    {
        if(root==null)
            return 0;
        if(root.left==null&&root.right==null)
            return 1;
         return 1+Math.max(height(root.left),height(root.right));
        
    }*/
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
            //int h=Solution.height(root,bw);
            //bw.write(h+"\n");
            int res=Solution.isBalanced(root);
            if(res==1)
              bw.write("Yes");
            else
               bw.write("No"); 
            bw.write("\n");
      }
         
          bw.flush(); //after all test cases
   
    }
}

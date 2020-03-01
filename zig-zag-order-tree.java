/*Given an array of unique elements, construct a Binary Search Tree and print the Level Order of the tree in a zig-zag fashion. Assume root is at level-1, zig-zag means that nodes at even levels will be printed left to right and the nodes at odd levels will be printed from right to left.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes.

Constraints

1 <= T <= 1000
1 <= N <= 1000
0 <= ar[i] <= 10000

Output Format

For each test case, print the Level Order Traversal of the Binary Search Tree in zig-zag fashion, separated by newline.

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
3 2 4 5 1 
4 0 5 15 1 7 17 

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class zig-zag-order-tree {
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
    public static void levelorder(Node root,BufferedWriter bw)
    {
        //Stack<Node> stack = new LinkedList<Node>(); 
        Stack<Node> stk1 = new Stack<>(); 
        Stack<Node> stk2 = new Stack<>(); 
        stk1.push(root); 
        while((!stk1.isEmpty())||(!stk2.isEmpty()))
        {
            while(!stk1.isEmpty())
            {
                Node r=stk1.pop();
                try{ bw.write(r.data+" ");}catch(IOException e){}
                if(r.right!=null)
                    stk2.push(r.right);
                if(r.left!=null)
                    stk2.push(r.left);
            }
            while(!stk2.isEmpty())
            {
                Node r1=stk2.pop();
                try{ bw.write(r1.data+" ");}catch(IOException e){}
                 if(r1.left!=null)
                 stk1.push(r1.left);
                if(r1.right!=null)
                  stk1.push(r1.right);           
            }
        }
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
            Solution.levelorder(root,bw);
             bw.write("\n");
      }
         
          bw.flush(); //after all test cases
   
    }
}

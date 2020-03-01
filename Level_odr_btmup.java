/*Given an array of unique elements, construct a Binary Search Tree and print the Level Order of the tree, not top-down, but bottom-up.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes.

Constraints

1 <= T <= 1000
1 <= N <= 1000
0 <= ar[i] <= 10000

Output Format

For each test case, print the bottom-up Level Order of the Binary Search Tree, separate each level by newline. Separate the output of different test cases with an extra newline.

Sample Input 0

3
5
1 2 3 4 5 
5
3 2 4 1 5 
7
4 5 15 0 1 7 17 
Sample Output 0

5 
4 
3 
2 
1 

1 5 
2 4 
3 

7 17 
1 15 
0 5 
4 
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Level_odr_btmup {
    public class Node 
    { 
        int data; 
        boolean isNull = false;
        Node left, right; 

        public Node(int item) 
        { 
            data = item; 
            left = right = null; 
        } 
        public Node(boolean isNullin)
        {
            left=right=null;
            isNull = isNullin;
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
    public void levelorder(Node root,BufferedWriter bw)
    {
        Queue<Node> queue = new LinkedList<Node>(); 
        Stack<Node> stk = new Stack<>(); 
        queue.add(root); 
        while(!queue.isEmpty())
        {
            int s=queue.size();
            for(int i=0;i<s;i++)
            {
                Node front=queue.poll();
                stk.push(front);
                if(front.right!=null)
                  queue.add(front.right);  
                if(front.left!=null)
                  queue.add(front.left);          
            }
            //stk.push(new Node(true));
            stk.push(null);
        }
       stk.pop(); 
       while (stk.empty() == false)  
        { 
            Node node = stk.peek(); 
            if (node == null || node.isNull)
            {
            System.out.print("\n");//1
            // try{ bw.write("\n");}catch(IOException e){}
            }
           else{
            System.out.print(node.data + " ");                
           }
            stk.pop(); 
        } 
        System.out.print("\n\n");//2
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
                Solution s = new Solution();
               root=s.insert(root,ele);
            }
            Solution soln = new Solution();
            soln.levelorder(root,bw);
        }
         
          bw.flush(); //after all test cases
   
    }
}

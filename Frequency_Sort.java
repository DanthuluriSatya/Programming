/*
You are given an array of integers. Sort them by frequency. See examples for more clarifications.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array. The second line contains the elements of the array.

Constraints

1 <= T <= 100
1 <= N <= 10000
-1000 <= A[i] <= 1000

Output Format

For each test case, print the elements of the array sorted by frequency. In case 2 elements have the same frequency, print the smaller element first.

Sample Input 0

2
6
4 -2 10 12 -8 4 
8
176 -272 -272 -45 269 -327 -945 176 
Sample Output 0

-8 -2 10 12 4 4 
-945 -327 -45 269 -272 -272 176 176 
*/import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class Frequency_Sort {
 public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
         Integer c;
        
         int cases;
        //System.out.println("enter number of cases");
        cases=scanner.nextInt();
       for(int T=0;T<cases;T++){
         int n=scanner.nextInt();
       int[] arr = new int[n]; 
            Map<Integer,Integer> map=new HashMap<Integer,Integer> ();
       for(int i=0;i<n;i++)//read ele to array
           arr[i]=scanner.nextInt();
        
       for(int j=0;j<n;j++)//store ele to map
       {
           c=map.get(arr[j]);
            if(map.get(arr[j])==null)
                map.put(arr[j],1);
            else
                map.put(arr[j],++c);
       }//sort map based on values
        List<Entry<Integer,Integer>>list=new LinkedList<Entry<Integer,Integer>>(map.entrySet());
         Collections.sort(list,new Comparator<Entry<Integer,Integer>>()
         {
             public int compare(Entry<Integer,Integer>o1,Entry<Integer,Integer>o2)
             {
                 if (o1.getValue().compareTo(o2.getValue())>=1)
                     return 1;
                 else if(o1.getValue().compareTo(o2.getValue())==0 )
                     return o1.getKey().compareTo(o2.getKey());
                 else
                     return -1;
             }
         });//print map
         for(Entry<Integer,Integer>item:list)
         {
             if(item.getValue()>1)
            {
             for(int k=1;k<=item.getValue();k++)
                 System.out.print(item.getKey()+" ");
            }
            else if(item.getValue()==1)
             System.out.print(item.getKey()+" ");
         }
        System.out.println();
         

        }
     }
 }

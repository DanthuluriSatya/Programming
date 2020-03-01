/*
Perform Enqueue and Dequeue operations on a queue. Implement Queue and avoid using inbuilt library.
Input Format

First line of input contains T - number of operations. Its followed by T lines, each line contains either "Enqueue x" or "Dequeue".

Constraints

1 <= T <= 10000
-100 <= x <= 100

Output Format

For each "Dequeue" operation, print the dequeued element, separated by newline. If the queue is empty, print "Empty".


Sample Input 0

8
Enqueue 5
Dequeue
Dequeue
Enqueue 10
Enqueue -15
Dequeue
Enqueue -10
Dequeue
Sample Output 0

5
Empty
10
-15
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<string.h> 
using namespace std;


int main() {
    int front=-1;int rear=-1;
     int T;
     cin>>T;
    int a[10000];
     while(T>0)
     {
         string N;
         string k;
         k="Enqueue";
         cin>>N;
          int res = N.compare(k); 
         if (res==0)
         {
            int x;
            cin>>x;
            if((front==-1)&&(rear==-1))
            {
                front=0;rear=0;
                a[rear]=x;
            }
             else if(front==rear)
             {
                 rear=rear+1;
                 a[rear]=x;
             }
             else
             {
                rear=rear+1;
                 a[rear]=x; 
             }
        }
        else{
             
                if((front==-1)&&(rear==-1))
                cout<< "Empty" <<'\n';
                else if(front==rear)
                {
                    int p=a[front];
                    cout<< p <<'\n';
                    front=rear=-1;
                }
                else
                {
                int p=a[front];
                cout<< p <<'\n';
                front=front+1;
            
                }
          }
           T--;
       }
    return 0;
}

/*
Given a sentence, reverse the entire sentence word-by-word.
Note: Solve using stack or in-place swap. Do not simply scan, split and print in reverse order.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each contains a sentence S of space separated words of lowercase english alphabet. All the words are separated by a single space.

Constraints

1 <= T <= 1000
1 <= len(S) <= 1000

Output Format

For each test case, print the reversed sentence, separated by newline.

Sample Input 0

3
hello world
a b c d
data structures and algorithms
Sample Output 0

world hello
d c b a
algorithms and structures data
*/
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <stack>
using namespace std;


int main() {
    int T;
        //cin>>T;
    scanf("%d\n",&T);
     while(T>0)
     {
         stack<char>stk;
         stack<char>stk1;
         string s;
         //cin>>s;
         getline(cin,s);
         int i=0;
        for(i=0;i<s.length();i++)
            stk.push(s[i]);
        while(!stk.empty())
        {
            char x=stk.top();
            stk.pop();
            if(x>='a'&& x<='z')
            stk1.push(x);
            else
             {
                while(!stk1.empty())
                { 
                   char ele=stk1.top();
                      stk1.pop();
                   //cout<<ele;
                    printf("%c",ele);
                }
              //cout<<" ";  
                printf(" ");
             }
        }
         while(!stk1.empty())
                {
                    char ele=stk1.top();
                    stk1.pop();
                    //cout<<ele;
                    printf("%c",ele);
                }
         printf("\n");
         T--;
        
     }
    
    //return 0;
}

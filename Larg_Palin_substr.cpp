/*
Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. The first line contains N - the size of the string and the second line contains a string of size N, containing only lowercase english alphabets.

Constraints

30 points
1 <= T <= 200
1 <= len(S) <= 102
'a' <= S[i] <= 'z'

70 points
1 <= T <= 200
1 <= len(S) <= 103
'a' <= S[i] <= 'z'

Output Format

For each test case, print the length of the largest palindromic substring, separated by newline.

Sample Input 0

5
8
pfyafafd
9
sllwffoqq
6
yoogvb
4
hcch
23
mzmqnnrkurfmmfrukrnnqsm
Sample Output 0

3
2
2
4
18
*/
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
int main() {
    int T;
     cin>>T;
     while(T>0)
     {
         string ar;
         int N;
         cin>>N>>ar;
         if(N==ar.length()){
 if(ar.length()==1)
     cout<< "1" <<'\n';
else{
    int ans=1;
    int len=0;
         int n=ar.length();
         int p1,p2;
   for(int i=0;i<ar.length();i++)
   {
       p1=i-1;p2=i+1;
       while(p1>=0&&p2<=n-1&&ar[p1]==ar[p2])
       {
           len=p2-p1+1;
           if(len>ans)
               ans=len;
           p1--;
           p2++; 
       }
       p1=i;
       p2=i+1;
       while(p1>=0&&p2<=n-1&&ar[p1]==ar[p2])
       {
           len=p2-p1+1;
           if(len>ans)
               ans=len;
           p1--;
           p2++;   
       }
   }
     cout<< ans <<'\n';;
         }
         }
         else
             cout<< "0" <<'\n';
         T--;
     }
}

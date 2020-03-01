/*
Given an 2 strings A and B, find the number of occurrences of A in B as a substring. Solve using Rabin-Karp string matching algorithm with multiple hash functions. Do not use inbuilt library.

Input Format

First line of input contains T - number of test cases. Its followed by T lines. Each line contains 2 strings - A and B, separated by space.

Constraints

1 <= T <= 2000
1 <= len(A), len(B) <= 10000
'a' <= A[i], B[i] <= 'z'

Output Format

For each test case, print the number of occurrences of A in B, separated by newline.

Sample Input 0

4
smart yekicmsmartplrplsmartrplplmrpsmartrpsmartwmrmsmartsmart
interviews interviewseiwcombvinterviewskrenlzp
ds dsdsajdsrjjdsjjj
algo yalgoalgoalgopalgoaxalgoasaxalgolalgoalgoalgo
Sample Output 0

6
2
4
9
*/
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
long long int K = 1000000007; 
int main() {
    int T;
     cin>>T;
     while(T>0)
     {
      string A;string B;
      cin>>B>>A;
      int M=B.size();
      int N=A.size();
      long long int pwr[M+1]; 
      long long int pwr2[M+1]; 
      pwr[0]=1;pwr2[0]=1;long long int i=0;int count=0;
      int p=5441;int p2=2423;long long int hb=0;long long int ha=0;long long int hb2=0;long long int ha2=0;
      for(int i=1;i<=M;i++)
      {
          pwr[i]=(pwr[i-1]*p)%K;
          pwr2[i]=(pwr2[i-1]*p2)%K;
          
      }
      for( i=0;i<=M-1;i++)
      {
          hb=(hb+(B[i]*pwr[M-i])%K)%K;
          hb2=(hb2+(B[i]*pwr2[M-i])%K)%K;   
      }
      for(i=0;i<=M-1;i++)
      {
          ha=(ha+(A[i]*pwr[M-i])%K)%K;
          ha2=(ha2+(A[i]*pwr2[M-i])%K)%K;
          
      }
      if((ha==hb)&&(ha2==hb2))
          count++;
      for(i=M;i<=N-1;i++)
      {
          long long int product=((A[i-M]%K)*(pwr[M]%K))%K;
          long long int temp=(product%K);
          ha=((ha%K)-temp+K)%K;
          long long int sum=(ha%K+(A[i]%K))%K;
          ha=((sum%K)*(p%K))%K;
          
          long long int product2=((A[i-M]%K)*(pwr2[M]%K))%K;
          long long int temp2=(product2%K);
          ha2=((ha2%K)-temp2+K)%K;
          long long int sum2=(ha2%K+(A[i]%K))%K;
          ha2=((sum2%K)*(p2%K))%K;
          
          if((ha==hb)&&(ha2==hb2))
             count++;
      }
    printf("%d",count);
    printf("\n"); 
         T--;
     }
}

/*
Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains 2 numbers N and P, separated by space.

Constraints

20 points
1 <= T <= 100
1 <= N <= 1018
1 <= P <= 108

80 points
1 <= T <= 100
1 <= N <= 1010000
1 <= P <= 1015

Output Format

For each test case, print the value of N % P, separated by new line.

Sample Input 0

4
5 2
4 10
1085377843 81765943
8290826691135830692772803 95972011
Sample Output 0

1
4
22420584
60316167
*/


Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains 2 numbers N and P, separated by space.

Constraints

20 points
1 <= T <= 100
1 <= N <= 1018
1 <= P <= 108

80 points
1 <= T <= 100
1 <= N <= 1010000
1 <= P <= 1015

Output Format

For each test case, print the value of N % P, separated by new line.

Sample Input 0

4
5 2
4 10
1085377843 81765943
8290826691135830692772803 95972011
Sample Output 0

1
4
22420584
60316167

*/
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
  void stringMod(string N,long long int P){
      long long int r=0;
      for(int i=0;i<N.length();i++)
      {
          r=(r*10+(int)N[i]-'0')%P;
      }
      cout<< r <<'\n';
  }

int main() {
     int T;
     cin>>T;
     while(T>0)
     {
         long long int P;
         string N;
         cin>>N>>P;
         stringMod(N,P);
         T--;
     }
    return 0;
}


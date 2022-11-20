/* TASK
Mario was going to gift Princess Peach a string SS of even length NN.

Mario was clumsy and thus, broke the string in the middle. He now has two strings AA and BB such that A = S[1, \frac{N}{2}]A=S[1, 
2
N
​
 ] and B = S[\frac{N}{2} + 1, N]B=S[ 
2
N
​
 +1,N].

Mario is not sure about the order in which he should join the strings AA and BB to get the string SS. Thus, he joins the strings in any random order. Find whether it is guaranteed that Mario will get the same string SS if he joins the strings AA and BB in any order.

Note that S[L, R]S[L,R] denotes a substring of string SS starting at index LL and having a length (R - L + 1)(R−L+1).

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of two lines of input:
The first line of each test case contains NN - the length of the initial string SS.
The second line contains the string SS.
Output Format
For each test case, print YES if it is guaranteed that Mario will get the same string SS irrespective of the order in which he joins the strings AA and BB and NO otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).

Constraints
1 \leq T \leq 30001≤T≤3000
1 \leq N \leq 10001≤N≤1000
NN is even.
SS consists of lowercase english alphabets.
Sample 1:
Input
Output
4
6
abcabc
6
abcdef
4
aaaa
4
baab
YES
NO
YES
NO
Explanation:
Test case 11: On breaking, the string SS gives A = abcA=abc and B = abcB=abc. Thus, joining it in either way (AB(AB or BA)BA), would give the same string SS.

Test case 22: On breaking, the string SS gives A = abcA=abc and B = defB=def. Joining it as BABA would give the string defabcdefabc which is not equal to string SS.

Test case 33: On breaking, the string SS gives A = aaA=aa and B = aaB=aa. Thus, joining it in either way (AB(AB or BA)BA), would give the same string SS.

Test case 44: On breaking, the string SS gives A = baA=ba and B = abB=ab. Joining it as BABA would give the string abbaabba which is not equal to string SS. */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    String str=sc.next();
		    String first=str.substring(0,n/2);
		    String second=str.substring(n/2,n);
		    if(first.equals(second)){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}

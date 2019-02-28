import java.io.*;
public class ClimbingStairs {
public static void main(String args[])throws IOException
{
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter number of steps to climb");
	int n = Integer.parseInt(stdin.readLine());
	int no_of_ways=count(n);
	System.out.println("No of ways to climb "+ n +" steps are "+ no_of_ways + " ways.(FIBONACCI WAY");
	int no_recur=count_recur(0,n);
	System.out.println("No of ways to climb "+ n +" steps are "+ no_recur + " ways.(RECURSIVE BRUTE FORCE");
	int memo[]=new int[n+1];
	int no_memo=count_memo(0,n,memo);
	System.out.println("No of ways to climb "+ n +" steps are "+ no_memo + " ways.(MEMOIZATION)");
	int no_dp=count_dp(n);
	System.out.println("No of ways to climb "+ n +" steps are "+ no_dp + " ways.(DYNAMIC PROGRAMMING)");
}
public static int count(int n) {
	if(n==0)
		return 1;
	int first = 1;
	int second = 2;
	for(int i=3;i<=n;i++)
	{
		int third = first + second;
		first = second;
		second = third;
	}
	return second;
}
public static int count_recur(int i,int n)
{
	if(i>n)
		return 0;
	if(i==n)
		return 1;
	return count_recur(i+1,n) + count_recur(i+2,n);
}
public static int count_memo(int i,int n,int memo[])
{
	if(i>n)
		return 0;
	if(i==n)
		return 1;
	if(memo[i]>0)
		return memo[i];
	memo[i]=count_memo(i+1,n,memo)+count_memo(i+2,n,memo);
	return memo[i];
	
}
public static int count_dp(int n)
{
	if(n==0)
		return 1;
	int dp[]=new int[n+1];
	dp[1]=1;
	dp[2]=2;
	for(int i=3;i<=n;i++)
	{
		dp[i]=dp[i-1] + dp[i-2];
	}
	return dp[n];
}
}

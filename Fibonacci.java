import java.util.*;
import java.io.*;
public class Fibonacci {
	static HashMap<Integer,Integer> cache = new HashMap<>();
public static void main(String args[])throws IOException
{
	char ch='y';
	do {
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter number");
	int n = Integer.parseInt(stdin.readLine());
	System.out.println("Enter choice");
	System.out.println("1. Recursive");
	System.out.println("2. Dynamic (Memoisation");
	System.out.println("Enter choice");
	int c = Integer.parseInt(stdin.readLine());
	switch(c)
	{
		case 1:
		{
			long startTime = System.currentTimeMillis();
			int fib=fibRecur(n);
			System.out.println(fib);
			long stopTime = System.currentTimeMillis();
		    long elapsedTime = stopTime - startTime;
		    System.out.println(elapsedTime);
			break;
		}
		case 2:
		{
			long startTime = System.currentTimeMillis();
			int fib2 = fibDyna(n);
			System.out.println(fib2);
			long stopTime = System.currentTimeMillis();
		    long elapsedTime = stopTime - startTime;
		    System.out.println(elapsedTime);
			break;
		}
	}
	System.out.println("Continue?");
	ch = (char)stdin.read();
	}while(ch=='y');
}
public static int fibRecur(int n)
{
	if(n<2)
		return n;
	else
		return (fibRecur(n-1) + fibRecur(n-2));
}
public static int fibDyna(int n)
{
	 
	 if(cache.containsKey(n))
		 return cache.get(n);
	 int res;
	 if(n<2)
		 res = n;
	 else
		 res = (fibDyna(n-1) + fibDyna(n-2));
	 cache.put(n, res);
	 return res;
	  
}
}

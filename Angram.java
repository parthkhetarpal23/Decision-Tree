import java.util.HashMap;
import java.io.*;
public class Anagram {
	public static void main(String args[])throws IOException
	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String s="angram";
		String t="nagram";
		int arr[] = new int[26];
		if(s.length()!=t.length())
			System.out.println("LENGTH DOES NOT MATCH");
		for(int i=0;i<s.length();i++)
		{
			//System.out.println((int)s.charAt(i));
			arr[(int)s.charAt(i) - 97]++;
			arr[(int)t.charAt(i)-97]--;
		}
		for(int count:arr)
			if(count!=0)
				System.out.println("NO");
			else
				System.out.println("YES");
		
		
		}
	}


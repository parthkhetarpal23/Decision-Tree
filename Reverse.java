
public class Reverse {
public static void main(String args[])
{
	char arr[]= {'h','e','l','l','o'};
	 helper(0,arr.length-1,arr);
	 System.out.print(arr);
}
/*public static void helper(int index,char arr[])
{
	if(arr==null||index>=arr.length)
		return;
	helper(index+1,arr);
	System.out.print(arr[index]);
}*/
public static void helper(int start,int end,char arr[])
{
	if(start>end)
		return;
	char temp = arr[start];
	arr[start]=arr[end];
	arr[end]=temp;
	helper(start+1,end-1,arr);
	
}
}

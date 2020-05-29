/*
Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.

input =5
3 1 4 1 5
2
output =2

Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.

Example 2:
input =5
1 2 3 4 5
1
output =4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).

Example 3:
input =5
1 3 1 5 4
0
output =1
Explanation: There is one 0-diff pair in the array, (1, 1).


//backend testcases:
case = 1
input =5
1 3 1 5 4
0
output =1
case = 2
input =5
1 2 3 4 5
1
output =4
case = 3
input =5
3 1 4 1 5
2
output =2

3 1
1 2
4 1
5 1



*/
import java.util.*;
class UniqueKdiffPairs
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		Arrays.sort(arr);
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(Math.abs(arr[i]-arr[j])==k)
				{
					hm.put(arr[i],arr[j]);
				}
			}
		}
		System.out.println(hm.size());
			
	}
}
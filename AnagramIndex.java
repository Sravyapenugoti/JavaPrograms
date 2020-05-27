import java.util.*;
class AnagramIndex
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
Map<Integer,Integer>  map=new HashMap<Integer,Integer>(); 
for(int i=0;i<arr.length;i++)
{
map.put(sc.nextInt(),i);
}
for(int i=0;i<n;i++)
{
if(map.containsKey(arr[i]))
{
System.out.print(map.get(arr[i])+" ");
}
else
{
System.out.print("-1 ");
}
}
}
}

import java.util.*;
class RotateNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr1[],arr2[],i,j=0,m;
arr1=new int[n];
arr2=new int[n];
for(i=0;i<n;i++)
arr1[i]=sc.nextInt();
m=sc.nextInt();
for(i=n-m;i<n;i++)
{
arr2[j]=arr1[i];
j++;
}
for(i=0;i<n-m;i++)
{
arr2[j]=arr1[i];
j++;
}
for(i=0;i<n;i++)
System.out.print(arr2[i]+" ");
}

}
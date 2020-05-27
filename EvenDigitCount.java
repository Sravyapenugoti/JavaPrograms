import java.util.*;
class EvenDigitCount
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=0;
int a[]=new int[n];
for(int j=0;j<n;j++)
a[j]=sc.nextInt();
for(int i=0;i<n;i++)
{
String s=String.valueOf(Math.abs(a[i]));
int x=s.length();
if(x%2==0)
{
c++;
}
}
System.out.println(c);
if(c==0)
{
System.out.println("0");
}
}
}
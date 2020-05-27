import java.util.*;
class NumHappy
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(sqrSum(n));
}
public static boolean sqrSum(int n)
{
Set<Integer> set=new HashSet<Integer>();
while(set.add(n))
{
int sum=0;
while(n>0)
{
int m=n%10;
sum=sum+(m*m);
n=n/10;
}
if(sum==1)
return true;
else
n=sum;
}
return false;
}
}

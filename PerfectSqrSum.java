import java.util.*;
class PerfectSqrSum
{
static int numSqr(int n)
{
int dp[]=new int[n+1];
dp[0]=0;

for(int i=1;i<=n;i++)
{
int temp=Integer.MAX_VALUE;
for(int j=1;j*j<=i;j++)
{
temp=Math.min(temp,dp[i-j*j]+1);
}
dp[i]=temp;
}
return dp[n];
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
PerfectSqrSum t=new PerfectSqrSum();
int n=sc.nextInt();
System.out.println(t.numSqr(n));
}
}
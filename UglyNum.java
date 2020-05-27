import java.util.*;
class UglyNum
{
    static int getUglyNum(int n)
	{
	int i=1;
	int count=1;
	while(n>count)
	{
	i++;
	if(isUgly(i)==1)
	count++;
	}
	return i;
	}
	
	static int isUgly(int no)
	{
	no=divide(no,2);
	no=divide(no,3);
	no=divide(no,5);
	
	return (no==1)?1:0;
	}
	
	static int divide(int m,int n)
	{
	while(m%n==0)
	{
	m=m/n;
	}
	return m;
	}
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=getUglyNum(n);
		System.out.println(result);
    }
}
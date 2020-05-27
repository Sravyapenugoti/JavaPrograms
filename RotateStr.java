import java.util.*;
class RotateStr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
String s3=s1+s2;
if(s3.contains(s2))
System.out.println("Yes");
else
System.out.println("-1");
}
}
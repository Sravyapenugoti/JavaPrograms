import java.util.*;
class Anagram
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
String str1=sc.next();
String str2=sc.next();
//str1=str1.toLowerCase();
//str2=str2.toLowerCase();
char c1[]=str1.toCharArray();
char c2[]=str2.toCharArray();
Arrays.sort(c1);
Arrays.sort(c2);
str1=String.valueOf(c1).toLowerCase();
str2=String.valueOf(c2).toLowerCase();
System.out.println(str1);
System.out.println(str2);
if(str1.equals(str2))
System.out.println("Yes");
else
System.out.println("-1");
}
}
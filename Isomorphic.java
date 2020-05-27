import java.util.*;
class Isomorphic
{
static boolean isIsomorphic(String s1,String s2)
{
if(s1.length()!=s2.length())
return false;

HashMap<Character,Character> h1=new HashMap<Character,Character>();
HashMap<Character,Character> h2=new HashMap<Character,Character>();

for(int i=0;i<s1.length();i++)
{
h1.put(s1.charAt(i),s2.charAt(i));
h2.put(s2.charAt(i),s1.charAt(i));
}

if(h1.size()!=h2.size())
return false;
int count=0;
for(int i=0;i<s1.length();i++)
{
char ch=h1.get(s1.charAt(i));
System.out.println("ch : "+i+" = "+ch);
char c1=h2.get(ch);
System.out.println("c1 : "+i+" = "+c1);
char c2=h1.get(c1);
System.out.println("c2 : "+i+" = "+c2);
if(ch==c2)
count++;
}
if(count==s1.length())
   return true;
else
	return false;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Isomorphic t=new Isomorphic();
String s1=sc.next();
String s2=sc.next();
System.out.println(t.isIsomorphic(s1,s2));
}
}
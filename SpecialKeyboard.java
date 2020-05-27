import java.util.*;
class SpecialKeyboard
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String input=sc.next();
String word=sc.next();
if(input.length()==26)
{
System.out.println(wordSum(input,word));
}
else
{
System.out.println("-1");
}
}
public static int wordSum(String input,String word)
{
int sum=0,a=0,b=0;
Map<Character,Integer> map=new HashMap<Character,Integer>();
for(int i=0;i<input.length();i++)
{
map.put(input.charAt(i),i);
}
for(int j=0;j<word.length();j++)
{
a=map.get(word.charAt(j));
sum=sum+Math.abs(a-b);
b=a;
}
return sum;
}
}

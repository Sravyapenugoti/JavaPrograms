/*
A number is valid if each digit remains a digit after rotation. 0, 1, and 8 rotate to themselves; 2 and 5 rotate to each other (on this case they are rotated in a different direction, in other words 2 or 5 gets mirrored); 6 and 9 rotate to each other, and the rest of the numbers do not rotate to any other number and become invalid.

Now given a positive number N, how many numbers X from 1 to N are good?

Example:
Input: 10
Output: 4
Explanation: 
There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.
Note:

testcases:
case = 1
   input =10
   output =4
case = 2
   input =15
    output =6
case = 3
   input =50
   output =16
case = 4
   input =200
   output =81

*/
import java.util.*;
class CountRotateDigits
{
	private static Map<Character, Character> transition = new HashMap(){{
            put('0','0');
            put('8','8');
            put('1','1');
            put('2','5');
            put('5','2');
            put('6','9');
            put('9','6'); }};
    public static int rotatedDigits(int N) {
        if(N==0)
            return 0;
        int count = 0;  
        for(int i=1; i<=N; i++){
            String oldNo = Integer.toString(i);
            boolean isValid = true;
            StringBuilder newNo = new StringBuilder();
            for(char ch : oldNo.toCharArray()){
                if(!transition.containsKey(ch)){
                    isValid = false;
                    break;
                } else {
                    newNo.append(transition.get(ch));
                }
            }
            if(isValid && !newNo.toString().equals(oldNo)){
                count++;
            }
            
        }
        return count;
        
    } 

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(rotatedDigits(n));
	}
}

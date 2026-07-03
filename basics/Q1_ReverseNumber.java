/*Problem: Reverse a Number

Description:
Given an integer, reverse its digits.

Example:
Input: 1234
Output: 4321

Approach:
- Take input from user
- Extract last digit using % 10
- Build reversed number by multiplying previous result by 10 and adding digit
- Repeat until number becomes 0

Time Complexity: O(n)
Space Complexity: O(1)*/ 

import java.util.*;
public class Q1_ReverseNumber {
    public static void main(String args[]){
        int lastdigit;
        int reverse=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int original=n;
        while(n!=0){
            lastdigit=n%10;
            reverse=reverse*10+lastdigit;
            n/=10;
        }
        System.out.println("Reverse of " +original + " is " +reverse);

        sc.close();
    }
    
}

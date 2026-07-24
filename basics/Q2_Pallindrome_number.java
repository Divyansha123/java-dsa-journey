import java.util.Scanner;
public class Q2_Pallindrome_number{
    public static void palindrome(int number){
        int original=number;
        int last_digit;
        int reverse=0;
        while(number>0){
            last_digit=number%10;
            reverse=reverse*10+last_digit;
            number=number/10;
        }
        if(original==reverse){
            System.out.print("It is a palindrome number");
        }else{
            System.out.print("Not an palindrome number");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int number=sc.nextInt();
        palindrome(number);

    }
    
}

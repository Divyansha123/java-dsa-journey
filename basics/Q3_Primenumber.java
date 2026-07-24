import java.util.Scanner;
public class Q3_Primenumber {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to check if it is prime or not: ");
        int number=sc.nextInt();
        if(number==1){
            System.out.print("Not prime nor composite");
        }
        else if(number==2){
            System.out.print("Prime number");
        }
        else{
            boolean isPrime = true;
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime==true){
                System.out.print("Prime number");
            }else{
                System.out.print("Not a prime number");
            }
        }
    }
}

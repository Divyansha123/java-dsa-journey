import java.util.*;
public class Q6_EvenOddSum {
    public static void main(String[] args) {
        int evensum=0;
        int oddsum=0;
        int Evencount=0;
        int Oddcount=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size: ");
        int n =sc.nextInt();
        int[] array=new int[n];

        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if((array[i]%2)==0){
                evensum+=array[i];
                Evencount++;
            }else{
                oddsum+=array[i];
                Oddcount++;
            }
        }
        System.out.println("Evensum: " +evensum +","+ "Oddsum: " +oddsum);
        System.out.print("Even no.: " +Evencount +","+ "Odd no.: " +Oddcount);

    }
}

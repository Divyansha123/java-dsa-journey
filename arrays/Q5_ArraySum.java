import java.util.Arrays;
import java.util.Scanner;

public class Q5_ArraySum{
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            sum=sum+array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Sum: " +sum);


}
}

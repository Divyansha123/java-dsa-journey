import java.util.*;
public class Q7_FindSecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enetr size: ");
        int n= sc.nextInt();
        int[] array=new int[n];

        System.out.print("Eneter Elements: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        int largest=array[0];
        int secondlargest=Integer.MIN_VALUE;

        for(int i=1;i<n;i++){
            if(array[i]>largest){
                secondlargest=largest;
                largest=array[i];
            }
            else if(array[i]<largest && array[i]>secondlargest){
                secondlargest=array[i];
            }
        }
        if(secondlargest==Integer.MIN_VALUE){
                secondlargest=-1;
            }
    System.out.println("Largest: "+largest);
    System.out.print("Second Largest: "+secondlargest);

    }
}

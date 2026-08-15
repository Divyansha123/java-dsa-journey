import java.util.*;
public class Q8_CheckSortedArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=sc.nextInt();
        int[] array=new int[n];

        System.out.println("Enetr Elements: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        boolean isSorted=true;

        for(int i=0;i<n-1;i++){
            if(array[i]>array[i+1]){
                isSorted=false;
                break;
        }
    }


        if(isSorted==true){
                System.out.print("Array is Sorted");
            }else{
                System.out.println("Array is Unsorted");
            }
    }
}

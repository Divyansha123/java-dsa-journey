import java.util.*;
public class Q4_ReverseArray{
    public static int[] reversearray(int array[]){
        int start=0;
        int end=array.length-1; 
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;

            start++;
            end--;
        }
        return array;
        }
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter size: ");
            int n=sc.nextInt();
            int[] array=new int[n];

            System.out.print("Enter Elements: ");
            for(int i=0;i<array.length;i++){
                array[i]=sc.nextInt();
            }

            int[] originalArray=Arrays.copyOf(array,array.length);

            int[] result=reversearray(array);
            System.out.println("Original Array: " +Arrays.toString(originalArray));
            System.out.print("Reversed Array: " +Arrays.toString(result));


        }
    }
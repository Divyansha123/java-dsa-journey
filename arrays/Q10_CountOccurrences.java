import java.util.Scanner;

public class Q10_CountOccurrences {
    public static void main(String args[]){
        int count=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size: ");
        int n=sc.nextInt();
        int[] array=new int[n];

        System.out.print("Enter key: ");
        int key=sc.nextInt();

        System.out.println("Enetr Elements: ");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }

        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                count++;
            }
        }
        System.out.println(key+" occurs "+count+" times ");
    }
}

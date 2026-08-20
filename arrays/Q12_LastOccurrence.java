import java.util.Scanner;

public class Q12_LastOccurrence {
    public static void main(String[] args) {
        int index=-1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.print("Enter Key: ");
        int key=sc.nextInt();
        System.out.print("Enter Elements: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                index=i;
            }
        }
        if(index!=-1){
            System.out.println("Last occurrence of " + key + " is at index " + index);
        }
        else{
            System.out.println(key+" not found");
        }
    }
}

import java.util.Arrays;

public class Q3_SwapNumbers {
    public static int[] swaptwonumbers(int array[], int p1,int p2){
        int index1=-1;
        int index2=-1;
        int i;
        for(i=0;i<array.length;i++){
            if(array[i]==p1){
                index1=i;
            }
            if(array[i]==p2){
                index2=i;
            }
        }
        
            if(index1!=-1 && index2!=-1){
                int temp=array[index1];
                array[index1]=array[index2];
                array[index2]=temp;
            }
            return array;
        }
    
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        System.out.println(Arrays.toString(swaptwonumbers(array,2,6)));
    }
}

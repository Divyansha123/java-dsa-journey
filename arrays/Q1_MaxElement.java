public class Q1_MaxElement {
    public static void FindMaxElement(int Array[]){
        int largest=Array[0];
        for(int i=0;i<Array.length;i++){
            if(largest<Array[i]){
                largest=Array[i];
            }
        }
        System.out.print(largest);
    }
    public static void main(String[] args) {
        int Array[]={1,6,7,2,9,5};
        FindMaxElement(Array);
    }
}

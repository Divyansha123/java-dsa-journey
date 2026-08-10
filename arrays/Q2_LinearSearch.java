public class Q2_LinearSearch{
    public static int linearSearch(int array[], int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){ //to check if number is equal to key or not
                return i; //to return index of number to be searched
            }
        }
        return -1; //number not found
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        System.out.println(linearSearch(array,3)); //call and print 
    }
}
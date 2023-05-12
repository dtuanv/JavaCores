package sortAlgorithms;

public class BubbleSort {

    public static void main (String[] args){
        int[] intArray = {20, -15, 19, 1 ,1, 40, -20, 0};

        for(int lastUnsortedIndex = intArray.length - 1 ; lastUnsortedIndex > 0; lastUnsortedIndex -- ){

            for(int i = 0 ; i< lastUnsortedIndex; i++){
                if(intArray[i] > intArray[i+1]){
                    swap(intArray , i, i+1);
                }
            }


        }
        for(int a = 0; a < intArray.length; a++  ){
            System.out.println(intArray[a]);
        }
    }

    public static void swap(int[] array, int i , int j){
        int temp = array[i];
        array[i] = array[j];

        array[j] = temp;
    }
}

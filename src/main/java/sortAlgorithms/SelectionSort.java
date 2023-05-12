package sortAlgorithms;

public class SelectionSort {
//    Selection sort is a simple sorting algorithm that sorts an array by repeatedly selecting the smallest
//    or largest element from the unsorted portion of the array and moving it to the sorted portion.
    public static void main(String[] args){
        int[] intArray = {20, -15, 19, 1 ,1, 40, -20, 0};

//        one by one  move boundary of unsorted subarray
        for(int i =0 ; i < intArray.length ; i ++){

//            find the minimum element in unsorted array
            int minIndex= i;


            for(int j = minIndex + 1; j < intArray.length; j++){
                if(intArray[j] < intArray[minIndex]){
                    BubbleSort.swap(intArray, j ,minIndex);
                }
            }

        }

        for(int a = 0 ; a < intArray.length; a++ ){
            System.out.println(intArray[a]);
        }


    }

}

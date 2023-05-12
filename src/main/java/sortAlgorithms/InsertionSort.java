package main.java.abstractFd.sortAlgorithms;


public class InsertionSort {
//    Insertion sort is a simple sorting algorithm that sorts an array by repeatedly inserting the elements in the right place.
//    It is one of the simplest algorithms and is quite efficient for small data sets,
//    but becomes slower as the size of the data increases.
    public static void main(String[] args){
        int[] intArray = {20, -15, 19, 1 ,1, 40, -20, 0};

        for(int i = 1 ; i < intArray.length; i ++ ){

            for(int j = i ; j > 0 ; j -- ){
                while (intArray[j] < intArray[j-1]){
                    BubbleSort.swap(intArray, j , j-1);
                }
            }

        }

        for(int a = 0 ; a < intArray.length; a++ ){
            System.out.println(intArray[a]);
        }




    }
}

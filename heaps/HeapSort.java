
import java.util.*;
public class HeapSort {
    
    public static void heapify(int arr[] , int i , int size){
        int left = 2*i + 1 ;
        int right = 2*i + 2 ;
        int maxIdx = i ;

        if(left < size && arr[left] > arr[maxIdx]){
            maxIdx = left ;
        }
        if( right < size && arr[right] > arr[maxIdx]){
            maxIdx = right ;
        }

        if(maxIdx != i ){
            //swap 
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp ;

            heapify(arr, 0, size);
        }
    }
    public static void heapSort (int arr []){
        //1 -> build max heap 
        int n = arr.length;
        //to find the non-leaf nodes 
        for(int i = n/2 ; i >= 0 ; i--){
            heapify(arr, i, n);
        }
        //2 -> push largest element to the last 
        for(int i = n-1 ; i >= 0 ; i--){
            //swap largest -> smallest 
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp ;

            heapify(arr, 0, i); // call heapify to correct order after swap for each root node level wise moving top to down 

        }
        
    }
    public static void main (String args []){
        int arr[] = {1 , 2 , 4 , 5, 3};
        heapSort(arr);

        //print 
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}

package basic;

import java.util.Arrays;

/**
  This is a recursive method
  Merge sort takes more memory but faster time complexity O(n log n)
  Ideal for large data
 */
public class MergeSortDemo {
  private static void merge(int[] leftArray, int[] rightArray, int[] array){

    int leftSize = array.length / 2;
    int rightSize = array.length - leftSize;

    int i=0;
    int l=0;
    int r=0;

    while (l < leftSize && r < rightSize){
        if(leftArray[l] < rightArray[r]){
            array[i] = leftArray[l];
            i++;
            l++;
        }else{
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

    while(l<leftSize){
        array[i] = leftArray[l];
        i++;
        l++;
    }

    while(r<rightSize){
        array[i] = rightArray[r];
        i++;
        r++;
    }

}

private static void mergeSort(int[] array){
   
    int length = array.length;
    System.out.println("LENGTH: "+length);
    if(length <= 1) return; //base case

    int middle = length /2;
    int[] leftArray = new int[middle];
    int[] rightArray = new int[length-middle];

    int left = 0;
    int right = 0;

    for (int i = 0; i < length; i++) {
        System.out.println("I: "+ i);
        if(i<middle){
            leftArray[left] = array[i];
            left++;
        }else{
            rightArray[right] = array[i];
            right++;
        }
    }
    mergeSort(leftArray);
    mergeSort(rightArray);
    merge(leftArray, rightArray, array);

}

public static void main(String[] args) {

    int[] array = {4, 6, 2, 1, 100, 75, 34,300};

    mergeSort(array);

    System.out.println(Arrays.toString(array));

}
}

package basic;

import java.util.Arrays;

public class BubbleSortDemo {
  
    public static void main(String[] args) {

        int array[] = {5, 1, 3, 2, 8, 11,32,100,10};

        bubbleSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] data){

        for(int i = 0; i< data.length - 1; i++){
            for(int j = 0; j< data.length - 1 - i; j++){
                if(data[j] > data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
}

package basic;

import java.util.Arrays;

public class SelectionSortDemo {
  public static void main(String[] args) {
    int[] array = {5, 1, 3, 2, 8, 11, 32, 100, 10};
    // int[] array = {3,2,1};

    selectionSort(array);

    System.out.println(Arrays.toString(array));
}

private static void selectionSort(int[] data) {
    for (int i = 0; i < data.length - 1; i++) {
        System.out.println("i: "+ i);
        // int minValue = data[i];
        int indexMinimum = i;
        for (int j = i; j < data.length; j++) {
            System.out.println("DATA J at index: "+ j + " => " + data[j]);
            if (data[j] < data[indexMinimum]) {
                // minValue = data[j];
                indexMinimum = j;
            }
        }
        if (data[indexMinimum] < data[i]) {
            int temp = data[i];
            data[i] = data[indexMinimum];
            data[indexMinimum] = temp;
        }
    }
}

}

package basic;

public class BinarySearchDemo {
  

  private static int binarySearch(int[] data, int target) {

    int low = 0;
    int high = data.length - 1;

    while (low <= high) {
        int middle = low + (high - low) / 2;
        int value = data[middle];
        System.out.println("Middle: " + middle );
        if (value < target) {
            low = middle + 1;
        } else if (value > target) {
            high = middle - 1;
        } else {
            return middle;
        }
    }

    return -1;

}

public static void main(String[] args) {

    int[] sortedArray = new int[10];

    for (int i = 0; i < sortedArray.length; i++) {
        sortedArray[i] = i;
    }

    // int index = Arrays.binarySearch(sortedArray, key);
    int index = binarySearch(sortedArray, 3);

    System.out.println("TARGET ON INDEX: " + index);
}
  
}

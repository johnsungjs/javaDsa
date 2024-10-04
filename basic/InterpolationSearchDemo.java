package basic;

public class InterpolationSearchDemo {
  /**
        This is the improvement from binary search, instead of use middle where we do (low + (high - low) / 2), we use special probe formula

        This is efficient when the differece between each data has a nearly similar distance

        So data like this [1,2,3,4,5] is great for interpolation search
        If the data is [1,100,126,3000,10000] merge sort is still a better algorithm
     */
    private static int interpolationSearch(int[] data, int target) {

      int high = data.length -1;
      int low = 0;

      while(target >= data[low] && target <= data[high] && low <= high){
          int probe = low + (high - low) * (target - data[low]) / (data[high] - data[low]);

          System.out.println("probe: "+ probe);

          if(data[probe] == target){
              return probe;
          }else if(data[probe] < target){
              low = probe + 1;
          }else{
              high = probe - 1;
          }
      }

      return -1;
  }

  public static void main(String[] args) {
      int[] data = {1, 2, 3, 4, 5};
      int index = interpolationSearch(data, 2);
      System.out.println("Interpolation RESULT: " + index);
  }
}

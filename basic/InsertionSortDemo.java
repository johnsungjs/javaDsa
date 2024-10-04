package basic;

import java.util.Arrays;

public class InsertionSortDemo {
  
    public static void main(String[] args) {

        int[] array = {5, 7, 9, 1, 3, 100, 200, 99, 88, 77};

        insertionSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            System.out.println("I: " + i);

            int temp = data[i];

            int j = i-1;

            while (j >= 0 && temp < data[j]){
                data[j+1] = data[j];
                j--;
            }

            data[j + 1] = temp; 

        }
    }
}

// INI NGACO TP BOLELA BUAT BELAJAR
// private static void insertionSort(int[] data) {
//     for (int i = 1; i < data.length; i++) {
//         System.out.println("I: " + i);
//         int temp = data[i];
//         if (data[i] < data[i - 1]) {
//             System.out.println("MASUK IF");
//             for (int j = i; j > 0; j--) {
//                 System.out.println("VALUE J: " + j);
//                 if (temp < data[j - 1]) {
//                     //disini dorong bkn switch                 
//                     data[j] = data[j - 1];
//                 } else {
//                     System.out.println("TEMP: " + temp);
//                     data[j] = temp;
//                     break;
//                 }
//             }
//             //biasain neh kalau mau ada iteration yg di eksekusi di akhir jangan pakai forloop, pakai while aja ya
//             data[j] = temp;
//             System.out.println("KONDISI AFTER I= " + i + " => " + Arrays.toString(data));
//         }
//     }


package basic;

import java.util.Hashtable;

public class HashTableDemo {
   /**
     * this data type has marked as "Obsolete Collection" (ketinggalan jalan) on
     * java official documentation
     *
     * Hash table = ds to store key value pair example: <Integer, String>
     * Each key-value pair => entry
     *
     * Fast insertion, lookup, delete Not ideal for small datasets, ideal for
     * large datasets
     *
     * Hashing: takes a key and computes an integer (formula will vary based on
     * data type) in hashtable hashing is made by % to calculate
     *
     * key.hashCode() % capacity = index
     *
     * collision => hash function that generates the same index for more than 1
     * key
     *
     * bucket => to store multiple entries in case of collision (same hashing),
     * similar to linkedlist
     *
     * less collisions = more efficiency
     *
     * runtime complexity: best case O(1) worst case O(n)
     *
     */
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(11);

        table.put(100, "spongebob");
        table.put(123, "patrick");
        table.put(321, "sandy");
        table.put(555, "squidward");
        table.put(777, "gary");

        table.remove(777);

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 11 + "\t" + key + "\t" + table.get(key));
        }
    }
}


import basic.DynamicArray;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        DynamicArray da = new DynamicArray(5);

        da.add("A");
        da.add("B");
        da.add("C");
        da.add(0, "X");
        da.remove(1);
        // da.remove("B");
        da.add("1");
        da.add("2");
        da.add("3");
        da.add("4");
        da.add("5");
        da.remove(0);
        da.remove(0);
        da.remove(0);
        da.remove(0);
        da.remove(0);
        da.remove(0);


        System.out.println("SIZE: " + da.size());
        System.out.println("CAPACITY: " + da.capacity());
        System.out.println("IS EMPTY: "+ da.isEmpty());
        System.out.println("DATA: " + da.toStringCapacity());

        System.out.println("WHERE IS C NOW: " + da.indexOf("C"));
        // System.out.println("TEST RANDOM INDEXOF: " + da.indexOf("akwkawkaw"));

        ArrayList<String> test = new ArrayList<>();
        // test.add(1, "12");
        // System.out.println("test: "+ test);
    }
}

package basic;

public class DynamicArray {

    private int size = 0;
    private int capacity = 10;
    private Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.array = new Object[capacity];
        this.capacity = capacity;
    }

    public int size() {
        return this.size;
    }

    public int capacity() {
        return this.capacity;
    }

    public Object[] array() {
        return this.array;
    }

    public void add(Object data) {

        if (this.size >= capacity) {
            grow();
        }

        this.array[size] = data;
        this.size++;
    }

    public void add(int index, Object data) {
        if (this.size >= this.capacity) {
            grow();
        }

        for (int i = this.size - 1; i >= index; i--) {
            this.array[i + 1] = this.array[i];
        }

        array[index] = data;
        this.size++;
    }

    public void remove(int index) {

        for (int i = index; i < this.size; i++) {
            this.array[i] = this.array[i + 1];
        }
        if ((int) this.size <= (this.capacity / 3)) {
            shrink();
        }
        this.size--;

    }

    public void remove(Object data) {

        int index = this.indexOf(data);

        if (index != -1) {

            for (int i = index; i < this.size; i++) {
                this.array[i] = this.array[i + 1];
            }
            if ((int) this.size <= (this.capacity / 3)) {
                shrink();
            }
            this.size--;

        } else {
            System.out.println("Index out of bound");
        }

    }

    public int indexOf(Object data) {

        for (int i = 0; i < this.size; i++) {
            if (this.array[i].equals(data)) {
                return i;
            }
        }

        return -1;

    }

    public void grow() {
        int newCapacity = this.capacity * 2;

        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < this.size; i++) {
            newArray[i] = this.array[i];
        }

        this.array = newArray;
        this.capacity = newCapacity;

    }

    public void shrink() {
        int newCapacity = (int) (this.capacity / 2);

        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < this.size; i++) {
            newArray[i] = this.array[i];
        }

        this.array = newArray;
        this.capacity = newCapacity;

    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "[]";
        }
        String res = "";
        //the properway is i < this.size, but this.capacity is great for learning purpose
        for (int i = 0; i < this.size; i++) {
            res += array[i] + ", ";
        }
        res = "[" + res.substring(0, res.length() - 2) + "]";
        return res;
    }

    public String toStringCapacity() {
        if (this.isEmpty()) {
            return "[]";
        }
        String res = "";
        //the properway is i < this.size, but this.capacity is great for learning purpose
        for (int i = 0; i < this.capacity; i++) {
            res += array[i] + ", ";
        }
        res = "[" + res.substring(0, res.length() - 2) + "]";
        return res;
    }

}

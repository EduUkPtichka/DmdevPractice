package lesson2;

public class ListV3<T> {

    private T[] objects;
    private int size;

    public ListV3(int initialSize){
        this.objects = (T[]) new Object[initialSize];
    }

    public void add(T element){
        objects[size++] = element;
    }

    public T get(int index) {
        return objects[index];
    }

    public int getSize() {
        return size;
    }
}

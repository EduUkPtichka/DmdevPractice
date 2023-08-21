package lesson1v2;

public class ListV2<T> {

    private T[] objects;
    private int size;

    public ListV2(int initialSize){
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

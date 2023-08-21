package lesson1v1;

public class List {

    private Object[] objects;
    private int size;

    public List(int initialSize) {
        this.objects = new Object[initialSize];

    }

    public void add(Object element) {
        objects[size++] = element;

    }

    public Object get(int index){
        return objects[index];
    }
}

package lesson4Iterator_35;

import java.util.Iterator;

public class ListFour<T> implements Iterable<T> {

    private T[] objects;
    private int size;

    public ListFour(int initialSize) {
        this.objects = (T[]) new Object[initialSize];
    }

    public void add(T element) {
        objects[size++] = element;
    }

    public T get(int index){
        return objects[size];
    }

    public int getSize(){
        return size;
    }


    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {

        private int currentIndex; // нужно понить текущее состояние.
        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            return objects[currentIndex++];
        }
    }
}

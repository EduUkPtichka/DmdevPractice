package lesson1ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRunner {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(5);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6); // данный Элемент добавится блогодоря мезханизму заложенный в ArrayList

        System.out.println();
    }
}

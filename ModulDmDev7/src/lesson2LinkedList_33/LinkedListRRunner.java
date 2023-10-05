package lesson2LinkedList_33;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListRRunner {
    public static void main(String[] args) {
            List<Integer> integers = new LinkedList<>();
            integers.add(1);
            integers.add(2);
            integers.add(3);
            integers.add(4);
            integers.add(5);
            integers.add(6); // данный Элемент добавится блогодоря мезханизму заложенный в ArrayList

            System.out.println(integers.get(5));
        System.out.println(integers.contains(3));
    }
}

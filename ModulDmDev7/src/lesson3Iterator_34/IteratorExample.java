package lesson3Iterator_34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> listSours = List.of(1, 2, 3, 4, 5, 6);// Неизменяемыя коллекция
        List<Integer> list = new ArrayList<>(listSours);

        //Раньше мы использовали массивы что бы хранить мн-ва одиковых элемента одного типа
        //И для итерирования мы использовали циклы

        //Но организация листов бывает разной!
        //for - От начала к концу.
//        for (int i = 0; i < list.size(); i++) { //size() - получить размер
//            Integer integer = list.get(i);
//            System.out.println(integer);
//        }

//        //Так же есть foreach (fori)/
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }
//        System.out.println();

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) { //Додех пор пока наш итератор содержит следующий элемент
//            Integer next = iterator.next();
//            System.out.println(next);
//        }

        //Так же это все мы могли сделать используя классический iter
//        for (Iterator<Integer> iterator1 = list.iterator(); iterator.hasNext();  ) {
//            Integer next = iterator.next();
//            System.out.println(next);
//        }

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();
            if (next == 3 || next == 4) {
                iterator.remove();
            }
        }
        System.out.println(list);

    }
}

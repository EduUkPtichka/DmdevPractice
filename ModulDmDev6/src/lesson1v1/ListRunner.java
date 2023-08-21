package lesson1v1;

import lesson1v1.List;
public class ListRunner {
    public static void main(String[] args) {
        List list = new List(10);
        list.add("String1");
        list.add(25);

        //list.add(new List(22));

        list.add("String3");

        //Object element = list.get(1);

        //Мы можем привести к типу String и оперировать с ними как String
        //Object element = list.get(1);
        String element = (String) list.get(1);
        System.out.println(element);
    }
}

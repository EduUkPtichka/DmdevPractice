package lesson4Iterator_35;

public class ListFourRunner {
    public static void main(String[] args) {

        ListFour<String> list = new ListFour<>(10);
        list.add("String1");
        list.add("String2");
        list.add("String3");
        list.add("String4");

        for (String value : list) {
            System.out.println(value);
        }
        list.iterator().forEachRemaining(System.out::println);
    }
}

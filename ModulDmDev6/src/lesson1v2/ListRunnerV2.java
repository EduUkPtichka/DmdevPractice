package lesson1v2;

public class ListRunnerV2 {
    public static void main(String[] args) {
        ListV2<String> listV2 = new ListV2<String>(10);
        listV2.add("String1");
        listV2.add("String2");
        //listV2.add(25); // Уже так делать нельзя
        //listV2.add(new Archer());
        listV2.add("String3");

        //String element = (String) listV2.get(1); // Ну ненужно делать приведение.
        String element = listV2.get(1);
        System.out.println(element);
    }
}

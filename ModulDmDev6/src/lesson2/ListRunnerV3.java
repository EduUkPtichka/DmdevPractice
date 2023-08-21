package lesson2;
public class ListRunnerV3 {
    public static void main(String[] args) {
        ListV3<String> listV3 = new ListV3<String>(10);
        listV3.add("String1");
        listV3.add("String2");
        //listV3.add(25); // Уже так делать нельзя
        //listV3.add(new Archer());
        listV3.add("String3");

        //String element = (String) listV3.get(1); // Ну ненужно делать приведение.
        String element = listV3.get(1);
        System.out.println(element);
    }
}

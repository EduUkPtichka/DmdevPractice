package lesson6HashMap_37;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        PersonHashMap personOne = new PersonHashMap(1, "Anan", "Banan");
        PersonHashMap personTwo = new PersonHashMap(13, "Mahum", "Babah");

        Map<Integer, PersonHashMap> map = new HashMap<>();

        map.put(personOne.getId(), personOne);
        map.put(personTwo.getId(), personTwo);

        System.out.println(map.get(13));
    }
}

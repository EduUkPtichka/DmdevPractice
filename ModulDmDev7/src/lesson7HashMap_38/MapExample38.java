package lesson6HashMap_38;

import lesson6HashMap_37.PersonHashMap;

import java.util.HashMap;
import java.util.Map;

public class MapExample38 {

    public static void main(String[] args) {

        PersonHashMap38 personOne38 = new PersonHashMap38(1, "Anan", "Banan");
        PersonHashMap38 personTwo38 = new PersonHashMap38(13, "Mahum", "Babah");

        Map<Integer, PersonHashMap38> map = new HashMap<>();

        map.put(personOne38.getId(), personOne38);
        map.put(personTwo38.getId(), personTwo38);

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        for (PersonHashMap38 personHashMap38 : map.values()) {
            System.out.println(personHashMap38.getFirstName());
            
        }
    }

}

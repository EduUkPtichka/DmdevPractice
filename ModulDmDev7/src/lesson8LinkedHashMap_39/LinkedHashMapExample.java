package lesson8LinkedHashMap_39;

import lesson7HashMap_38.PersonHashMap38;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {

            PersonHashMap38 personOne38 = new PersonHashMap38(1, "Anan", "Banan");
            PersonHashMap38 personTwo38 = new PersonHashMap38(13, "Mahum", "Babah");
            PersonHashMap38 personThree38 = new PersonHashMap38(2, "Maha", "Mahabah");

            Map<Integer, PersonHashMap38> map = new HashMap<>();
            map.put(personOne38.getId(), personOne38);
            map.put(personTwo38.getId(), personTwo38);
            map.put(personThree38.getId(),personThree38);


            System.out.println(map.entrySet());
 
    }
}

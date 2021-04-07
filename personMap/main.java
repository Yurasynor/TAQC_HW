package personMap;

import java.util.*;

class Main {
    public static void main(String[] args) {

        Map<String, String> personMap = new HashMap<>();


        personMap.put("Shevchenko", "Andriy");
        personMap.put("Rebrov", "Sergiy");
        personMap.put("Gusin", "Andriy");
        personMap.put("Yarmolenko", "Andriy");
        personMap.put("Besedin", "Sergiy");
        personMap.put("Boyko", "Andriy");
        personMap.put("Rukyn", "Ira");
        personMap.put("Bubis", "Petro");
        personMap.put("Savchenko", "Orest");
        personMap.put("Romaniv", "Mariya");

        Set<Map.Entry<String, String>> set = personMap.entrySet();

        String firstName = personMap.get(0);

        for (Map.Entry<String, String> e : set) {
            if (e.getValue().equals(firstName)) {
                System.out.println("There are two person with same first name");
            }
        }
        System.out.println(personMap);


        String name = "Orest";
        List<String> keyByName = new LinkedList<>();
        for (Map.Entry<String, String> e : set) {
            if (e.getValue() == name) {
                keyByName.add(e.getKey());
            }
        }
        for (String key : keyByName) {
            personMap.remove(key);
        }

        System.out.println(personMap);


    }
}
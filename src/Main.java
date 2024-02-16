import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public static void main(String[] args) {
        Map<String, Set<String>> phoneBook = new HashMap<>();
        addPhoneNumber(phoneBook,"Криштиану", "89536547824");
        addPhoneNumber(phoneBook,"Джони Депп", "89865648632");
        addPhoneNumber(phoneBook,"Киркоров", "86574521689");
        addPhoneNumber(phoneBook,"Зубарев", "87542395614");
        addPhoneNumber(phoneBook,"Зубарев", "89594853224");
        addPhoneNumber(phoneBook,"Киркоров", "89084521467");
        addPhoneNumber(phoneBook,"Киркоров", "89134516983");
        addPhoneNumber(phoneBook,"Джони Депп", "89745149634");
        addPhoneNumber(phoneBook,"Киркоров", "83145298465");
        addPhoneNumber(phoneBook,"Зубарев", "89876543219");


        List<Map.Entry<String, Set<String>>> sortedContacts = new ArrayList<>(phoneBook.entrySet());
        Collections.sort(sortedContacts, new Comparator<Map.Entry<String, Set<String>>>() {
            public int compare(Map.Entry<String, Set<String>> entry1, Map.Entry<String, Set<String>> entry2) {
                return entry2.getValue().size() - entry1.getValue().size();
            }
        });


       for (Map.Entry<String, Set<String>> entry : sortedContacts) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void addPhoneNumber(Map<String, Set<String>> phoneBook, String name, String phone) {
        phoneBook.putIfAbsent(name, new HashSet<>());
        phoneBook.get(name).add(phone);
    }






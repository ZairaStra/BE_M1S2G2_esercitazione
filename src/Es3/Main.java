package Es3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();

        addContact(contacts, "Rupert", "483275011");
        addContact(contacts, "James", "4836385011");
        addContact(contacts, "Emma", "5641275011");
        addContact(contacts, "Amelia", "153875011");
        addContact(contacts, "Edgar", "483269511");
        System.out.println(contacts);

        removeContact(contacts, "James");
        System.out.println(contacts);

        System.out.println("Emma: " + searchByName(contacts, "Emma"));
        System.out.println("483269511" + searchByNumber(contacts, "483269511"));

        printContacts(contacts);
    }

    public static void addContact(Map<String, String> contacts, String name, String number) {
        contacts.put(name, number);
    }

    public static void removeContact(Map<String, String> contacts, String name) {
        contacts.remove(name);
    }

    public static String searchByName(Map<String, String> contacts, String name) {
        return contacts.get(name);
    }

    public static String searchByNumber(Map<String, String> contacts, String number) {
        return contacts.get(number);
    }

    //entrySet restituisce le coppie chiave-valore dell'hashmap
    public static void printContacts(Map<String, String> contacts) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


}


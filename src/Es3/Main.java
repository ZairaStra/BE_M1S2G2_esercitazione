package Es3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();

        addContact(contacts, "Rupert", "483275011");
        System.out.println(contacts);
    }

    public static void addContact(Map<String, String> contacts, String name, String number) {
        contacts.put(name, number);
    }
}


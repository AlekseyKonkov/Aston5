import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        contacts.putIfAbsent(lastName, new ArrayList<>());
        contacts.get(lastName).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return contacts.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "123-456");
        phoneBook.add("Иванов", "789-012");
        phoneBook.add("Петров", "345-678");
        phoneBook.add("Сидоров", "901-234");

        System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneBook.get("Петров"));
        System.out.println("Телефоны Сидорова: " + phoneBook.get("Сидоров"));
        System.out.println("Телефоны Смирнова: " + phoneBook.get("Смирнов")); 
    }
}


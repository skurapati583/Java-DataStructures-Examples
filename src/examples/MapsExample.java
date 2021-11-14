package examples;

import java.util.HashMap;

public class MapsExample {
    public static void main(String[] args) {
        HashMap<String, Integer> employerIds = new HashMap<>();
        employerIds.put("John", 7782);
        employerIds.put("Marah", 4353);
        employerIds.put("Carl", 8948);
        employerIds.put("Jerry", 38939);

        System.out.println(employerIds);

        System.out.printf("Carl's ID is: %d%n", employerIds.get("Carl"));

        System.out.printf("Is Jerry exists: %b%n", employerIds.containsKey("Jerry"));

        System.out.printf("Is Employer ID - 4333 exists: %b%n", employerIds.containsValue(4333));

        employerIds.replace("John", 93849);
        System.out.println(employerIds);

        employerIds.replace("Bailey", 193849); // Only replaces the key-value is present. Else, no operation.
        System.out.println(employerIds);

        employerIds.putIfAbsent("Bailey", 384938);
        employerIds.putIfAbsent("John", 384938); // No operation as John is already present.
        System.out.println(employerIds);

        employerIds.putIfAbsent("Steve", 384938); // Added as Steve is not present
        System.out.println(employerIds);

        employerIds.remove("Steve");
        System.out.println(employerIds);

        employerIds.remove("Steve"); // If key is not available, remove operation does nothing. If found, then
                                     // removes the key-value pair.
        System.out.println(employerIds);

    }
}

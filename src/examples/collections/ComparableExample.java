package examples.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Apple", 16, 99000.00));
        laptops.add(new Laptop("Lenovo", 8, 79000.39));
        laptops.add(new Laptop("Acer", 12, 189000.96));

        Collections.sort(laptops);

        for(Laptop laptop: laptops) {
            System.out.println(laptop);
        }
    }
}

package examples.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Apple", 16, 99000.00));
        laptops.add(new Laptop("Lenovo", 8, 79000.39));
        laptops.add(new Laptop("Acer", 12, 189000.96));

        Comparator<Laptop> comparator = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                }
                return -1;
            }
        };

        Collections.sort(laptops, comparator);

        for(Laptop laptop: laptops) {
            System.out.println(laptop);
        }
    }
}

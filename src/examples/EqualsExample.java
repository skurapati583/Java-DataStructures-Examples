package examples;

public class EqualsExample {
    public static void main(String[] args) {
        String str1 = "John";
        String str2 = "John";

        System.out.printf("Are both strings equal %b %n", (str1==str2)); // Returns true

        String objStr1 = new String("John");
        String objStr2 = new String("John");

        System.out.printf("Are both strings equal %b %n", (objStr1==objStr2)); // Returns false

        System.out.printf("Are both strings equal %b %n", (objStr1.equals(objStr2))); // Returns true

        Integer i1 = 45;
        Integer i2 = new Integer(45);

        System.out.printf("Are both integers equal: %b %n", (i1==i2)); //false
        System.out.printf("Are both integers equal: %b %n", (i1.equals(i2))); //true

        Character c1 = 'C';
        Character c2 = new Character('C');

        System.out.printf("Are both characters equal: %b %n", (c1==c2)); //false
        System.out.printf("Are both characters equal: %b %n", (c1.equals(c2))); //true

        Boolean b1 = true;
        Boolean b2 = new Boolean(true);

        System.out.printf("Are both boolean equal: %b %n", (b1==b2)); //false
        System.out.printf("Are both boolean equal: %b %n", (b1.equals(b2))); //true
    }
}

package examples;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) throws IOException {

        // Write to file

        String[] names = { "John", "Carl", "Jerry" };
        BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"));
        writer.write("Hello friends. This is first file.\n");
        writer.write("Writing another line.\n");

        for (String name : names) {
            writer.write(name);
            writer.newLine();
        }

        writer.close();

        // Read from File
        BufferedReader reader = new BufferedReader(new FileReader("Output.txt"));
        String line;
        // One way for reading
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }
}

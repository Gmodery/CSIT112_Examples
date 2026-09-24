package Chapter_11.IO.ReadFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        // The path to the file is relative to where you are running this .java file from
        // You may need to change it depending on which directory your IDE is opened to
        File file = new File("Chapter_11\\IO\\ReadFromFile\\file.txt");

        // try-with-resources automatically closes the scanner when done
        // This is similar to using "with open("file.txt", 'r') as f:" in Python
        try (Scanner scanner = new Scanner(file)) {
            // This will read and print the contents of the text file line-by-line
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("The file could not be found: " + e.getMessage());
        }
    }
}

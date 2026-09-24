package Chapter_11.IO.WriteToFile;

//********************************************************************
//  TestData.java       Author: Lewis/Loftus
//
//  Demonstrates I/O exceptions and the use of a character file
//  output stream.
//********************************************************************

import java.util.Random;
import java.io.*;

public class TestData {
    // -----------------------------------------------------------------
    // Creates a file of test data that consists of ten lines each
    // containing ten integer values in the range 10 to 99.
    // -----------------------------------------------------------------
    public static void main(String[] args) throws IOException {
        final int MAX = 10;

        int value;

        // The path to the file is relative to where you are running this .java file from
        // You may need to change it depending on which directory your IDE is opened to
        String fileName = "Chapter_11\\IO\\WriteToFile\\test.txt";

        // This creates a new PrintWriter object which creates the test.txt file
        // if it does not already exist
        PrintWriter outFile = new PrintWriter(fileName);

        Random rand = new Random();

        for (int line = 1; line <= MAX; line++) {
            for (int num = 1; num <= MAX; num++) {
                value = rand.nextInt(90) + 10;
                outFile.print(value + "   ");
            }
            outFile.println();
        }

        // The PrintWriter output stream should be explicitly closed to
        // prevent memory leaks
        outFile.close();
        System.out.println("Output file has been created: " + fileName);
    }
}

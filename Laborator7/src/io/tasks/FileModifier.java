package io.tasks;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileModifier {
    public static void main(String[] args) {
        String fileName = "inputFile.txt";
        appendTextToExistingFile(fileName, "new line");
        writeFirstLines(fileName, "newOut.txt", 6);
    }

    public static void appendTextToExistingFile(String fileName, String text) {
        try (FileWriter writer = new FileWriter(fileName, true)){
            writer.append("\n" + text);
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public static void writeFirstLines(String inputFilename, String outputFilename, int numberOfLines){
        BufferedReader br = null;
        String line;
        int lineNumber = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader(inputFilename));
            FileWriter writer = new FileWriter(outputFilename)) {
            while (((line = reader.readLine()) != null) && lineNumber <= numberOfLines){
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }



}

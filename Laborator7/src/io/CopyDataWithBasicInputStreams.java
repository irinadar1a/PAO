package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataWithBasicInputStreams {

    public static void main(String[] args) throws IOException {

        copyBytesInFile("input.txt", "byteOutput.txt");
        copyCharactersInFile("out.txt", "characterOutput.txt");
        copyLinesInFile("input.txt", "lineOutput.txt");
    }

    private static void copyBytesInFile(String inputFile, String outputFile) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(inputFile);
            outputStream = new FileOutputStream(outputFile);
            int c;

            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    private static void copyCharactersInFile(String inputFile, String outputFile) throws IOException {
        try (FileReader inputStream = new FileReader(inputFile);
             FileWriter outputStream = new FileWriter(outputFile)) {
            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.println(c);
                outputStream.write(c);
            }
        }
    }

    private static void copyLinesInFile(String inputFile, String outputFile) throws IOException {

        try (BufferedReader inputStream = new BufferedReader(new FileReader(inputFile));
             BufferedWriter outputStream = new BufferedWriter(new FileWriter(outputFile))/*;
             PrintWriter writer = new PrintWriter(new FileWriter("printer.txt"))*/) {
            String line;
            while ((line = inputStream.readLine()) != null) {
                System.out.println(line);
                outputStream.write(line);
                outputStream.newLine();
                writer.println(line);
            }
        }
    }
}

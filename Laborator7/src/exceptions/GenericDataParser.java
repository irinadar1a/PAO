package exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class GenericDataParser {

    //first version
//    public static Integer parseIntegerFromText(String text){
//        return new Integer(text);
//    }

    //second version
    public static Integer parseIntegerFromText(String text) {
        if (!text.isEmpty()) {
            return new Integer(text);
        } else {
            return null;
        }
    }

    //first version
    public void writeParsedDataToFile(String fileName) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write("Information...");
            parseTextForLetters("", "");
        } catch (IOException | ParsingException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //second version try with resources
//    public static void writeParsedDataToFile(String fileName) {
//        try (FileWriter fw = new FileWriter(fileName)) {
//            fw.write("Information...");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    //third version multicatch
//    public static void writeParsedDataToFile(String fileName) {
//        try (FileWriter fw = new FileWriter(fileName)) {
//            fw.write("Information...");
//            parseTextForLetters("", "");
//        } catch (IOException | ParsingException e) {
//            System.out.println("oups");
////            e.printStackTrace();
//        }
//    }


    public static void parseTextForLetters(String text, String letters) throws ParsingException {
        if (text == null) {
            throw new ParsingException("parsing text is null", text);
        } else {
            System.out.println(text.contains(letters));
        }
    }

}

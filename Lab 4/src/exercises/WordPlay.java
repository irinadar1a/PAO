package exercises;

public class WordPlay {
    public static void main(String[] args) {

        //exercise 1
        String fruit = "bananA";
        System.out.println(fruit.replace("a", "e"));
        System.out.println(fruit.toLowerCase().replace("a", "e"));
        System.out.println(fruit.toUpperCase().replace("I", "e").toLowerCase());

        //exercise 2
        String[] fruits = {"apple", "banana", "appricot", "strawberry", "pineapple"};

        //a
        int startingWithA = getStartWith(fruits, "a");
        System.out.println(" There are " + startingWithA + " fruits that start with a.");

        //b
        int endsWithA = getEndWith(fruits, "e");
        System.out.println(" There are " + endsWithA + " fruits that end with e.");

        //c
        String[] pps = textsThatContain(fruits, "pp");
        for (String s : pps) {
            System.out.println(s + " contains pp");
        }

        //exercise 3
        String reversePalindrome = reverseCharacters("Cojoc");
        System.out.println(reversePalindrome);

        reversePalindrome = reverseCharacters("Dot saw I was Tod");
        System.out.println(reversePalindrome);

        //exercise 4
        String pineappleText = "I love pineapples.";
        System.out.println(removeText(pineappleText, "pineapple"));

        //exercise 5
        String incompleteString = "coage";
        String addedString = "tt";
        int index = 2;
        String completeString = incompleteString.substring(0, index).concat(addedString).concat(incompleteString.substring(index));
        System.out.println(completeString);

        //exercise 6
        String fullPath = "/home/user/index.home.html";
        System.out.println(filename(fullPath, ".", "/"));
        System.out.println(extension(fullPath, "."));
        System.out.println(path(fullPath, "/"));

        //exercise 7
        String javaPhraze = "Java is a very used programming language and it is named after the Java cofee that is being cultivated on the island of Java";
        int i = countOccurrencesOf(javaPhraze, "Java");
        System.out.println("Java occurence " + i);

        //exercise 8 a + b + c + d
        String matchesPattern = ".((\\d\\d)*)(.*)(\\d*)";
        String regexExample = "a918765kjdksjku8876";
        System.out.println(regexExample.matches(matchesPattern));

        //exercise 9
        String replacePattern = "\\s";
        String replaceString = "We don't need white spaces";
        System.out.println(replaceString.replaceAll(replacePattern, ","));

        //exercise 10
        String splitPattern = "\\s";
        String splitString = "This is just another phrase";
        String[] split = splitString.split(splitPattern);
        for (String s : split) {
            System.out.println(s);
        }
    }

    private static int getStartWith(String[] textArray, String startingText) {
        int count = 0;
        for (String s : textArray) {
            if (s.startsWith(startingText)) {
                count++;
            }
        }

        return count;
    }

    private static int getEndWith(String[] textArray, String endingText) {
        int count = 0;
        for (String s : textArray) {
            if (s.endsWith(endingText)) {
                count++;
            }
        }

        return count;
    }

    private static String[] textsThatContain(String[] textArray, String containingText) {
        String[] temporaryTextArray = new String[textArray.length];
        int containingTextsIndex = 0;
        for (String s : textArray) {
            if (s.contains(containingText)) {
                temporaryTextArray[containingTextsIndex++] = s;
            }
        }
        String[] containingTextArray = new String[containingTextsIndex];

        for (int i = 0; i < containingTextsIndex; i++) {
            containingTextArray[i] = temporaryTextArray[i];
        }

        return containingTextArray;
    }

    private static String removeText(String text, String textToRemove) {
        int endIndex = text.indexOf(textToRemove);
        return text.substring(0, endIndex) + text.substring(endIndex + textToRemove.length());
    }

    private static String reverseCharacters(String palindrome) {
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        // put original string in an  array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = palindrome.charAt(i);
        }

        // reverse array of chars
        for (int i = 0; i < len; i++) {
            charArray[i] = tempCharArray[len - 1 - i];
        }

        return new String(charArray);
    }

    private static int countOccurrencesOf(String word, String substring) {
        int count = 0;
        int position = 0;
        int index;
        while ((index = word.indexOf(substring, position)) != -1) {
            ++count;
            position = index + substring.length();
        }

        return count;
    }

    private static String extension(String fullPath, String extensionSeparator) {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        return fullPath.substring(dot + 1);
    }

    private static String filename(String fullPath, String extensionSeparator, String pathSeparator) {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(sep + 1, dot);
    }

    private static String path(String fullPath, String pathSeparator) {
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(0, sep + 1);
    }
}

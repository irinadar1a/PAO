package exercises;

public class StringBuilderMethods {

    public static void main(String[] args){
        String palindrome = "Dot saw I was Tod";
        StringBuilder sb = new StringBuilder(palindrome);

        sb.reverse();  // reverse it
        System.out.println(sb);

        StringBuilder phrase = new StringBuilder("Rome wasn't built ");
        phrase.append("in 3 days");
        System.out.println(phrase);

        StringBuilder wrongWord = new StringBuilder("potttato");
        wrongWord.delete(2,4);
        System.out.println(wrongWord);

        wrongWord.insert(3, "t");
        System.out.println(wrongWord);
        wrongWord.deleteCharAt(2);
        System.out.println(wrongWord);

    }
}

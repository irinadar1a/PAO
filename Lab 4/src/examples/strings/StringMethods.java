package examples.strings;

public class StringMethods {

    public static void main(String[] args){

        String name = "Irina";

        //length
        int nameLength = name.length();
        System.out.println(nameLength);

        //charat
        char c = name.charAt(2);
        System.out.println(c);
        //palindrome example

        //concat
        String surname = "Ciobotea";
        System.out.println(name.concat(surname));
        System.out.println(name);

        //equals
        String name2 = "Irina";
        System.out.println(name.equals(name2));
        String name3 = "irina";
        System.out.println(name.equals(name3));
        System.out.println(name.equalsIgnoreCase(name3));

        //replace, lowercase
        System.out.println(name.replace("i", "e"));
        System.out.println(name.toLowerCase().replace("i", "e"));
        System.out.println(name.toUpperCase().replace("I", "e").toLowerCase());

        //isEmpty
        String emptyString = "";
        System.out.println(emptyString.isEmpty());

        //trim
        String trim = "   are mere   ".trim();
        System.out.println("ana " + trim);

    }
}

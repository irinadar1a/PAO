package examples.strings;

public class StringAndNumbers {

    public static void main(String[] args){
        String integerStringValue = "3";
        Integer integerValue = Integer.valueOf(integerStringValue);
        System.out.println(integerValue);
        int intValue = integerValue.intValue();
        System.out.println(intValue);

        String doubleStringValue = "3.3";
        Double doubleWrapValue = Double.valueOf(doubleStringValue);
        System.out.println(doubleWrapValue);

        //unformatted conversion
        double doubleValue = doubleWrapValue.floatValue();
        System.out.println(doubleValue);

        double multiplication = 2 * doubleValue;
        System.out.println(multiplication);
    }
}

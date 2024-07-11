package StringReversal;//Using built in reverse() method of the StringBuilder class:
//String class does not have reverse() method, we need to convert the input string to StringBuilder,
// which is achieved by using the append method of StringBuilder.
// After that, print out the characters of the reversed string by scanning from the first till the last index.

public class StringReverse3StringBuilderAppendAndReverseMethod {
    public static void main(String[] args)
    {
        String string = "Strings of Strings";                          //string is immutable

        StringBuilder stringFromBuilder = new StringBuilder();

        // append a string into StringBuilder input1
        stringFromBuilder.append(string);

        // reverse StringBuilder input1
        stringFromBuilder.reverse();

        // print reversed String
        System.out.println(stringFromBuilder);
    }
}

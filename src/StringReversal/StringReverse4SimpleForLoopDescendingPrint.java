package StringReversal;//Converting String to character array: The user input the string to be reversed.

//Method:
//1. First, convert String to character array by using the built in Java String class method toCharArray().
//2. Then, scan the string from end  to start, and print the character one by one.
public class StringReverse4SimpleForLoopDescendingPrint {
    public static void main(String[] args)
    {
        String string = "Strings of Strings";                          //string is immutable

        // convert String to character array
        // by using toCharArray
        char[] charArray = string.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--)
            System.out.print(charArray[i]);
    }
}

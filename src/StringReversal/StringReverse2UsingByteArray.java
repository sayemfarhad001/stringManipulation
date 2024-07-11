package StringReversal;//Converting String into Bytes: getBytes() method is used to convert the input string into bytes[].

//PSEUDOCODE
//1. Create a temporary byte[]  of length equal to the length of the input string.
//2. Store the bytes (which we get by using getBytes() method) in reverse order into the temporary byte[] .
//3. Create a new String abject using byte[] to store result.

public class StringReverse2UsingByteArray {
    public static void main(String[] args)
    {
        String string = "Strings of Strings";                      //string is immutable

        // getBytes() method to convert string
        // into bytes[].
        byte[] stringAsByteArray = string.getBytes();

        byte[] resultString = new byte[stringAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < stringAsByteArray.length; i++)
            resultString[i] = stringAsByteArray[stringAsByteArray.length - i - 1];

        System.out.println(new String(resultString));
    }
}

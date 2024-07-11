package StringReversal;//Using StringBuffer:
//String class does not have reverse() method, we need to convert the input string to StringBuffer,
// which is achieved by using the reverse method of StringBuffer.

public class StringReverse7StringBufferReverseMethod {
    public static void main(String[] args) {
        String string = "Stings of Strings";

        // conversion from String object to StringBuffer
        StringBuffer stringFromBuffer = new StringBuffer(string);
        // To reverse the string
        stringFromBuffer.reverse();
        System.out.println(stringFromBuffer);
    }
}

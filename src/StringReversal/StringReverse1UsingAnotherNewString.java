package StringReversal;

//USING STRING - charAt() && nstr variable && for loop
public class StringReverse1UsingAnotherNewString {
    public static void main (String[] args) {

        String string = "Strings of Strings", newString="";                //string is immutable
        char c;

        System.out.println("Original word: " + string);

        for (int i=0; i<string.length(); i++)
        {
            c = string.charAt(i);             //extracts each character
            newString = c + newString;               //adds each character in front of the existing string
        }

        System.out.println("Reversed word: "+ newString);
    }
}

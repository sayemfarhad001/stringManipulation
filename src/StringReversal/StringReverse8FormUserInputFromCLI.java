package StringReversal;//Reversing String by taking input from user-

//OUTPUT WILL BE GENERATED WHEN YOU GIVE INPUT

import java.util.Scanner;

public class StringReverse8FormUserInputFromCLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //INPUT STRING IN CLI
        String string = scanner.nextLine();
        char[] charArray = string.toCharArray();

        String reverseString = "";

        for(int i = string.length() - 1; i >= 0; i--)
        {
            reverseString = reverseString + string.charAt(i);
        }

        System.out.println(reverseString);

    }
}

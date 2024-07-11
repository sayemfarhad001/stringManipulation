package StringReversal;//Using Stack:
//The idea of stack is that we will be accessing only top element of a stack so it includes 2 steps as follows:
//1. push all the characters in stack.
//2. pop all the characters from stack and append to temp string.


//Time and Space Complexity = O(N)


import java.util.*;

public class StringReverse9UsingStackForPushWhilePop {
    public static void main(String[] args) {
        String string = "Strings of Strings";

        //initializing a stack of type char
        Stack<Character> charStack = new Stack<>();

        for(char c : string.toCharArray())
        {
            //pushing all the characters
            charStack.push(c);
        }

        String newString = "";

        while(!charStack.isEmpty())
        {
            //popping all the chars and appending to temp
            newString += charStack.pop();
        }

        System.out.println("Reversed string : "+ newString);
    }
}

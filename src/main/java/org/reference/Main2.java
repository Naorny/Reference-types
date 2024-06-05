package org.reference;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // A string of words separated by spaces is entered.
        // Find the longest word and display it on the screen.
        // The case when there may be several longest words is not handled.

        System.out.print("Enter the string with spaces: ");
        String[] words = scan.nextLine().split(" ");
        System.out.println("The longest word is: " + words[findLongestWord(words)]);
    }

    public static int findLongestWord(String[] words) {
        int maxLong = words[0].length();
        int index = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLong) {
                maxLong = words[i].length();
                index = i;
            }
        }

        return index;
    }
}


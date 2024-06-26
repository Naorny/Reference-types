package org.reference;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // A string is given. Output the first, last and middle (if any) characters.
        // Write a program that outputs the part of the string up to
        // and including the first point encountered.
        // Also provide for outputting the number of spaces.

        System.out.print("Enter the string: ");
        String str1 = scan.nextLine();
        int length = str1.length();
        System.out.println("The first character: " + str1.charAt(0));
        System.out.println("The last character: " + str1.charAt(length - 1));
        if(length != 2){
            System.out.print("The middle characters are: ");
            int i;
            for(i = 1; i < (length - 1); i++)
               System.out.print(str1.charAt(i));
            if (i == (length - 1))
               System.out.print("\n");
        }else{
            System.out.println("There are no middle characters");
        }
        int spaceCount = 0;
        for (char c : str1.toCharArray()) {
            if (c == ' '){
                spaceCount++;
            }
        }
        System.out.println("The number of spaces = " + spaceCount);

        String str2;
        str2 = str1.split("\\.")[0];

            System.out.println("The string up to dot with the dot: " + str2 + ".");
    }
}
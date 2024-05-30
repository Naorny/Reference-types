package org.reference;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Find a specified substring in a string and replace it with a new substring.
        // The user enters the string, its substring to replace and the new substring.

        System.out.print("Enter the string: ");
        String str1 = scan.nextLine();
        System.out.print("Enter a specified substring: ");
        String str2 = scan.nextLine();
        System.out.print("Enter a new substring: ");
        String str3 = scan.nextLine();

        if(str1.contains(str2)){
        String new_str = str1.replaceAll(str2, str3);
            System.out.print("New string: " + new_str);
        }else{
            System.out.print("There is not such string");
        }
    }
}

package com.example;

import java.util.Scanner;

public class TextProcessor {

    public String inputToUpperCase(String input) {
        return input.toUpperCase();
    }

    public String inputToLowerCase(String input) {
        return input.toLowerCase();
    }

    public String reverseInput(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println(new TextProcessor().inputToUpperCase(input));
        System.out.println(new TextProcessor().inputToLowerCase(input));
        System.out.println(new TextProcessor().reverseInput(input));
    }
}

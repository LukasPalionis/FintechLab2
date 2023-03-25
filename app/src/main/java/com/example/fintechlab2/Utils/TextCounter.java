package com.example.fintechlab2.Utils;

public class TextCounter {
    public static int getCharsCount(String input){
        return input.length();
    }

    public static int countWords(String str) {
        int wordCount = 0;

        boolean word = false;
        int endOfLine = str.length() - 1;

        for (int i = 0; i < str.length(); i++) {
            // if the current character is a letter, set word to true
            if (Character.isLetter(str.charAt(i)) && i != endOfLine) {
                word = true;
            }
            // if the current character is not a letter, set word to false and increment word count
            else if (!Character.isLetter(str.charAt(i)) && word) {
                wordCount++;
                word = false;
            }
            // special case for last character in string
            else if (Character.isLetter(str.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }

}

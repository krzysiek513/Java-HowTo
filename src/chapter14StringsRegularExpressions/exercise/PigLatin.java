package chapter14StringsRegularExpressions.exercise;

import java.util.Scanner;

public class PigLatin {

    private static String printPigLatinWord(String endWord){

        StringBuilder buffer = new StringBuilder(endWord);
        char[] charArray = new char[buffer.length() + 2];

        buffer.getChars(0, buffer.length(), charArray, 0);

        char tmp = charArray[0];
        charArray[0] = charArray[charArray.length - 1];
        charArray[charArray.length - 1] = tmp;

        buffer = new StringBuilder(String.valueOf(charArray));
        buffer.append("ay");

        return buffer.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("wpisz angielskie slowa");

        String engWord = input.nextLine();

        String [] tokens = engWord.split(" ");

        for (String token : tokens) {
            String latinSentence = printPigLatinWord(token);
            System.out.print(token + " ");
        }
   }
}
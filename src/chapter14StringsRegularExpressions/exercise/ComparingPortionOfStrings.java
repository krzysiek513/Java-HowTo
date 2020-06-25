package chapter14StringsRegularExpressions.exercise;

import java.util.Scanner;

public class ComparingPortionOfStrings {
    public static void main(String[] args) {
        int pierwszaIndex;
        int drugaIndex;
        int numerOfChar;
        String pierwszeZdanie;
        String drugieZdanie;
        String wynik;
        Scanner input = new Scanner(System.in);

        System.out.println("napisz pierwsze zdanie");
        pierwszeZdanie = new String(input.nextLine());

        System.out.println("napisz drugie zdanie");
        drugieZdanie = new String(input.nextLine());

        System.out.println("od jakiego nr pierwszej liczby zacząć?");
        pierwszaIndex = input.nextInt();

        System.out.println("od jakiego nr drugiej liczby zacząć?");
        drugaIndex = input.nextInt();

        System.out.println("ile liczb wziąć pod uwage?");
        numerOfChar = input.nextInt();

        if(pierwszeZdanie.toLowerCase().regionMatches(pierwszaIndex, drugieZdanie.toLowerCase(), drugaIndex, numerOfChar))
            wynik = new String("sa takie same");
        else
            wynik = "są inne";
        System.out.printf("zaczynasz w pierwszym zdaniu od: %d, drugim od: %d, a porównujesz %d liczb," +
                        " wynik porównania : %s", pierwszaIndex, drugaIndex, numerOfChar, wynik);
    }
}

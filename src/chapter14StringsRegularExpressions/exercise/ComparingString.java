package chapter14StringsRegularExpressions.exercise;

public class ComparingString {


    public static void main(String[] args) {

        String  a = new String("a");
        String b = new String("b");

        System.out.printf("compare a and a = %s, compare a and b = %s, compare b and a = %s", a.compareTo(a), a.compareTo(b), b.compareTo(a));
    }
}

package chapter7ArrayArratLists;

public class MultiArray {
    public static void main(String[] args) {

        int [][] a = {};
        int total = 0;
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                total += a[row][column];
            }
        }
    }
}

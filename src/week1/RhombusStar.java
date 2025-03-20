package src.week1;
import java.util.Scanner;

public class RhombusStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 1) { //홀수 인가?
            printCol(n);
        } else {
            System.out.println("Error : Invalid even number");
        }
    }

    private static void printCol(int size) {
        for (int i = 0; i < size; i++) {
            printRow(i, size);
        }
        for (int i = size - 2; i > -1; i--) {
            printRow(i, size);
        }
    }

    private static void printRow(int i, int size) {
        int maxLineCharactersAmount = size * 2;
        int star1 = size - i, star2 = size + i;
        for (int j = 0; j < maxLineCharactersAmount; j++) {
            if (j == star1 || j == star2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

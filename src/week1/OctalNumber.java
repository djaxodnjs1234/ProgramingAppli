package src.week1;
import java.util.Scanner;

public class OctalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        toDecial(str);
    }


    private static void toDecial(String str) {
        int strLen = str.length();
        int sum = 0;

        for (int i = 0; i < strLen; i++) {
            int intNumber = str.charAt(i) - '0'; // 아스키코드를 정수로 변환하여 쉽게 값 비교
            if (intNumber >= 0 && intNumber <= 7) { // 각 자리숫자가 8진수라면?
                for (int j = 0; j < strLen - i - 1; j++) {
                    intNumber *= 8; // 각 자리수 곱셈
                }
                sum += intNumber;
            } else {
                System.out.println("Error: Invalid octal number");
                return;
            }
        }
        System.out.println(sum);
    }
}


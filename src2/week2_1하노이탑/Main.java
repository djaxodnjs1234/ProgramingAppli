package src2.week2_1하노이탑;
import java.util.Scanner;
/*
	N : 원판의 개수
	start : 출발지
	mid : 옮기기 위해 이동해야 장소
	to : 목적지
*/

public class Main {
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hanoi(3,'A', 'B', 'C');
        System.out.println(sb.toString());
    }
    private static void Hanoi(int N,  char start, char mid, char to) {
        // 이동할 원반의 수가 1개라면?
        if (N == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }

        // A -> C로 옮긴다고 가정할 떄,
        // STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
        Hanoi(N - 1, start, to, mid);

        // STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
        sb.append(start +" "+ to + "\n");

        // STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
        Hanoi(N - 1, mid, start, to);
    }
}

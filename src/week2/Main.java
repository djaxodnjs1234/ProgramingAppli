package src.week2;

import java.util.*;

/* 합집합 교집합 차집합을 함수로 구현하는 과제
1 2 3 4 5 -1
4 5 6 7 -1
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> membersA = new ArrayList<>();
        ArrayList<Integer> membersB = new ArrayList<>();

        try {
            while (true) {
                int number = sc.nextInt();
                if (number == -1) {break;} // -1 입력시 종료
                else if (number > 0) {membersA.add(number);} // 양수만 입력받기
            }
            while (true) {
                int number = sc.nextInt();
                if (number == -1) {break;}
                else if (number > 0) {membersB.add(number);}
            }
        } catch (Exception e) {System.out.println("잘못된 입력");}
        sc.close();
        sorted(membersA);
        sorted(membersB);
        addSet(membersA, membersB);
        intersectionSet(membersA, membersB);
        removeSet(membersA, membersB);
    }
    // 합집합 출력
    public static void addSet(ArrayList<Integer> A, ArrayList<Integer> B){
        ArrayList<Integer> addlist = new ArrayList<>(A);
        addlist.addAll(B); // 중복된게 포함되어 있음

        // 집합 자료형의 특징 : 중복혀용x, 순서x
        HashSet<Integer> hash1 = new HashSet<Integer>(addlist);
        // HashSet을 ArrayList로 변환하기
        ArrayList<Integer> addlist1 = new ArrayList<>(hash1);
        sorted(addlist1);
        System.out.println("합집합 : < " + addlist1 + " >"); // 중복 제거
    }
    // 교집합 출력
    public static void intersectionSet(ArrayList<Integer> A, ArrayList<Integer> B){
        ArrayList<Integer> intersetionA = new ArrayList<>(A);
        intersetionA.retainAll(B);
        System.out.println("교집합 : < " + intersetionA + " >");
    }
    // 차집합 출력
    public static void removeSet(ArrayList<Integer> A, ArrayList<Integer> B){
        ArrayList<Integer> removeA = new ArrayList<>(A);
        removeA.removeAll(B);
        System.out.println("차집합 : < "+ removeA + " >");
    }
    public static void sorted(ArrayList<Integer> arraylist){
        Collections.sort(arraylist);
    }
}
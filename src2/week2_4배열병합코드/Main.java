package src2.week2_4배열병합코드;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1, arr2, result;

        arr1 = readArrayList(sc, 5);
        arr2 = readArrayList(sc, 5);
        result = mergeArrayList(arr1, arr2, 10);
        printResult(result, 10);
    }
    public static ArrayList<Integer> readArrayList(Scanner sc, int size){
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("정수 5개를 오름차순으로 입력하세요 : ");
        try {
            for (int i = 0; i < size; i++) {
                arr.add(sc.nextInt());
            }
            for (int i = 0; i < size - 1; i++) {
                if (arr.get(i) > arr.get(i + 1)) {
                    System.out.println("오름차순으로 입력되지 않았습니다. 다시 입력하세요.");
                    return readArrayList(sc, size );
                }
            }
        }catch (Exception e){
            System.out.println("입력오류 발생" + e);
        }
        return arr;
    }
    public static ArrayList<Integer> mergeArrayList(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int size){
        ArrayList<Integer> result = new ArrayList<>();
        int arr1index = 0;
        int arr2index = 0;
        // 리스트의 모든값은 결과값으로 넘겼다면 out
        while(arr1index < arr1.size() && arr2index < arr2.size()) {
            // arr2값이 더 크면
            if (arr1.get(arr1index) < arr2.get(arr2index)) {
                result.add(arr1.get(arr1index++));
            } else { // arr1값이 더 크거나 같으면
                result.add(arr2.get(arr2index++));
            }
        } // 아직 남은 값이 있다면
        while (arr1index < arr1.size()) {
            result.add(arr1.get(arr1index++));
        }
        while (arr2index < arr2.size()) {
            result.add(arr2.get(arr2index++));
        }
        return result;
    }
    public static void printResult(ArrayList<Integer> result, int size){
        for(int i=0; i<size; i++){
            System.out.print(result.get(i)+" ");
        }
    }
}

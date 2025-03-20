package src2.week2_3행열회전코드;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrix srcMat = new Matrix();
        System.out.println("최초 행렬");
        srcMat.print();

        System.out.println("오른쪽 90도 회전 행렬");
        Matrix rightMatrix = srcMat.rightRotate();
        rightMatrix.print();

        System.out.println("왼쪽 90도 회전 행렬");
        Matrix leftMatrix = srcMat.leftRotate();
        leftMatrix.print();

        System.out.println("전치 행렬");
        Matrix transposeMatrix = srcMat.transposeMatrix();
        transposeMatrix.print();
    }
}

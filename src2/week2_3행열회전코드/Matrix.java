package src2.week2_3행열회전코드;
import java.util.Random;
public class Matrix {
    private int[][] matrix;

    // 생성자: 랜덤 4x4 행렬 생성
    public Matrix(){
        this.matrix = new int[4][4];
        fillRandom();
    }

    // 행렬에 1~999 랜덤값 채움
    private void fillRandom() {
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = rand.nextInt(1, 999) ;
            }
        }
    }

    // 오른쪽 90도 회전 (시계 방향)
    public Matrix rightRotate() {
        Matrix rightRotated = new Matrix();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                rightRotated.matrix[j][3 - i] = this.matrix[i][j];
            }
        }
        return rightRotated;
    }

    // 왼쪽 90도 회전 ( 반시계 방향)
    public Matrix leftRotate(){
        Matrix leftRotated = new Matrix();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                leftRotated.matrix[3 - j][i] = this.matrix[i][j];
            }
        }
        return leftRotated;
    }

    public Matrix transposeMatrix(){
        Matrix transposedMatrix = new Matrix();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transposedMatrix.matrix[j][i] = this.matrix[i][j];
            }
        }
        return transposedMatrix;
    }
    public void print(){
        for(int i=0; i<4; i++){
            System.out.print("|");
            for(int j=0; j<4; j++){
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println(" |");
        }
        System.out.println();
    }
}


























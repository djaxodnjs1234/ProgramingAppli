package week1;

import java.util.Scanner;

public class RhombusStar {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==1){ //홀수 인가?
            for(int i=0; i<n; i++){ //삼각형 윗부분
                for(int k=n-i-1; k>0; k--){System.out.print(" ");} // " "부분
                System.out.print("*"); // "*"부분
                if(i==0){
                    System.out.println("");
                    continue; // 첫번째줄 예외처리
                }
                for(int k=0; k<2*i-1; k++){System.out.print(" ");} // " "부분
                System.out.println("*"); // "*"부분

            }

            for(int i=0; i<n-1; i++){ //삼각형 아랫부분
                for(int k=0; k<i+1; k++){System.out.print(" ");} // " "부분
                System.out.print("*"); // "*"부분
                if(i==n-2){
                    System.out.println("");
                    continue; // 마지막줄 예외처리
                }
                for(int k=0; k< 2*n - 2*i - 5; k++){System.out.print(" ");} // " "부분
                System.out.println("*"); // "*"부분
            }
        }
        else{
            System.out.println("Error : Invalid even number");
        }
    }
}

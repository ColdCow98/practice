package com.ohgiraffers.leechanwoo;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /* 길이가 5인 String 배열을 선언하고
         * "딸기", "바나나", "복숭아", "키위", "사과" 로 초기화를 하고
         * 스캐너로 0부터 4까지의 정수를 입력 받아
         * 해당 정수의 인덱스에 있는 과일을 출력하세요
         *
         * 단, 배열의 인덱스 범위를 벗어나는 경우 "준비된 과일이 없습니다." 를 출력하세요
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 2
         *
         * -- 출력 예시 --
         * 복숭아
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 준비된 과일이 없습니다.
         * */
        System.out.println(printFruit());

    }

    public static String printFruit() {
        /*
        String[] sarr = new String[5];
        sarr[0] = "딸기";
        sarr[1] = "바나나";
        sarr[2] = "복숭아";
        sarr[3] = "키위";
        sarr[4] = "사과";
        // 이런 방법을 아래의 한 줄로 표현가능.
         */
        String[] fruits = new String[]{"딸기", "바나나", "복숭아", "키위", "사과"};
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("0에서 4 사이의 숫자를 입력하세요: ");
            num = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            if (num < 0 || num > 4) {
                System.out.println("준비된 과일이 없습니다.");
            } else {
                break;
            }
        }

        String result = new String();
        for (int i = 0; i <= num; i++) {
            result = fruits[i];
        }
        return result;
    }
}
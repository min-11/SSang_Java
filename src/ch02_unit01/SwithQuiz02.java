package ch02_unit01;

import java.util.Scanner;

public class SwithQuiz02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int y, m;



//
//        System.out.println("년도를 입력하세요 : ");
//        y = sc.nextInt();
//
//        System.out.println("월을 입력하세요 : ");
//        m = sc.nextInt();

        // 첫번째 방법
//
//        switch (m) { // jdk 12이상부터는 case에 여러개의 값이 올 수 있음 // 정식 출시는 jdk 14부터
//            // break생략가능
//            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31일까지 입니다.");
//
//            case 4, 6, 9, 11 -> System.out.println("30일까지 입니다.");
//
//            case 2 -> {  // 2월은 윤년을 고려해야함
//                if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
//                    System.out.println("29일까지 입니다.");
//                } else {
//                    System.out.println("28일까지 입니다.");
//                }
//            }
//
//        }



        // 두번째 방법
//        int day = 0;
//        day = switch (m) { // jdk 12이상부터는 case에 여러개의 값이 올 수 있음
//            // break생략가능
//            case 1, 3, 5, 7, 8, 10, 12 -> 31;
//            case 4, 6, 9, 11 -> 30;
//            default -> {
//                if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
//                    yield 29;
//                } else {
//                    yield 28;
//                }
//            }
//        };





        // 점수 입력받아 평점 계산
        // 90~100 4.0 , 80~89 3.0, 70~79 2.0, 60~69 1.0, 0~59 0.0

        System.out.print("점수 입력 : ");
        int score = sc.nextInt();

        switch (score/10){
            case 10, 9 -> {
                String title = score/10 == 10 && score%10 >= 1 ? "입력 에러" : "4.0";
                System.out.println(title);
            }
            case 8 -> System.out.println("3.0");
            case 7 -> System.out.println("2.0");
            case 6 -> System.out.println("1.0");
            case 5,4,3,2,1,0 -> System.out.println("0.0");
            default -> System.out.println("입력 에러");
        }



        sc.close();



    }


}


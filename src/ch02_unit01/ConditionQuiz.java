package ch02_unit01;

import java.util.Scanner;

public class ConditionQuiz {

    public static void main(String[] args) {


        // 1
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("두 수를 입력하세요.");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = 0;
//
//
//        if (num1 > num2) {
//            num3 = num1 - num2;
//        } else if (num1 < num2) {
//            num3 =  num2 - num1;
//        } else {
//
//        }
//
//
//        System.out.println("첫 수 : "+ num1);
//        System.out.println("두번째 수 : "+ num2);
//        System.out.println("두 수의 차: " + num3);
//
//
//        sc.close();
//


        // 2

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("년도 입력 : ");
//        int year = sc.nextInt();
//
//        if(year%4 == 0 && year%100 !=0 || year% 400 == 0){
//            System.out.println(year + "년은 윤년입니다.");
//        }


        // 3

//
//        System.out.print("문자 하나 입력 : ");
//    char a = scanner.next().charAt(0);
//    if ((int)a > 96 && (int)a < 123) {
//        a = (char) (a - 32);
//        System.out.println(a);
//    } else if ((int)a > 64 && (int)a < 91) {
//        a = (char) (a + 32);
//        System.out.println(a);
//    } else if ((int)a > 47 && (int)a < 58) {
//        System.out.println("입력한 숫자 : "+ a);
//    } else {
//        System.out.println("특수문자입니다.");
//    }


        Scanner sc = new Scanner(System.in);

        // 4
//        System.out.print("점수 입력 : ");
//        int a = scanner.nextInt();
//
//        if (a <= 100 && a >= 95){
//            System.out.println("4.5");
//        } else if (a >= 90) {
//            System.out.println("점수 : "+ a);
//            System.out.println("4.0");
//        } else if (a >= 85) {
//            System.out.println("점수 : "+ a);
//            System.out.println("3.5");
//        } else if (a >= 80) {
//            System.out.println("점수 : "+ a);
//            System.out.println("3.0");
//        } else if (a >= 75) {
//            System.out.println("점수 : "+ a);
//            System.out.println("2.5");
//        } else if (a >= 70) {
//            System.out.println("점수 : "+ a);
//            System.out.println("2.0");
//        } else if (a >= 65) {
//            System.out.println("점수 : "+ a);
//            System.out.println("1.5");
//        } else if (a >= 60) {
//            System.out.println("점수 : "+ a);
//            System.out.println("1.0");
//        } else if (a >= 0) {
//            System.out.println("점수 : "+ a);
//            System.out.println("0.0");
//        }else {
//            System.out.println("점수 : "+ a);
//            System.out.println("입력오류");
//        }

        // 5
//        System.out.print("시간 입력 :");
//        int time = sc.nextInt();
//
//        int money = 10000;
//        int salary = 0;
//
//        DecimalFormat df = new DecimalFormat("#,###");
//
//        if (time > 8){
//            salary = money * 8;
//            time = time - 8;
//            salary = salary + (int)(money*1.5 * time);
//
//            System.out.printf("급여 : %d" + salary);
//        }


        // 6

//        System.out.print("두수 입력:");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.print("연산자 입력:");
//        char c = sc.next().charAt(0);
//
//        if (c == '+') {
//            System.out.println(a + " " + c + " " + b + " " + (a + b));
//        } else if (c == '-') {
//            System.out.println(a + " " + c + " " + b + " " + (a - b));
//
//        } else if (c == '*') {
//            System.out.println(a + " " + c + " " + b + " " + (a * b));
//
//        } else if (c == '/') {
//            System.out.println(a + " " + c + " " + b + " " + (a / b));
//
//        } else {
//            System.out.println("연산자 오류");
//        }


        //7
//        System.out.print("이름 입력 :");
//        String name = sc.next();
//        System.out.print("세과목 점수 입력 :");
//        int kor = sc.nextInt();
//        int eng = sc.nextInt();
//        int math = sc.nextInt();
//        int sum = kor + eng + math;
//
//
//        if (sum / 3 >= 60) {
//            if (kor >= 40 && eng >= 40 && math >= 40) {
//                System.out.println(name + "합격");
//            } else {
//                System.out.println("과락");
//            }
//        } else {
//            System.out.println(name + "불합격");
//        }


        // 8
        System.out.print("학번 : ");
        String id = sc.next();

        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("중간고사 점수 : ");
        int mid = sc.nextInt();
        System.out.print("기말고사 점수 : ");
        int fin = sc.nextInt();
        System.out.print("결석횟수 : ");
        int abs = sc.nextInt();
        System.out.print("레포트 점수 : ");
        int rep = sc.nextInt();

        String grade;
        if (abs < 2) {
            abs = 100;
        } else if (abs < 4) {
            abs = 80;
        } else if (abs < 6) {
            abs = 60;
        } else {
            abs = 0;
        }


        int sum = (int) (mid * 0.4) + (int) (fin * 0.4) + (int) (abs * 0.1) + (int) (rep * 0.1);

        if (sum >= 90 && sum <= 100) {
            grade = "A";
        } else if (sum >= 80) {
            grade = "B";
        } else if (sum >= 70) {
            grade = "C";

        } else if (sum >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }


        System.out.println("학번 : " + id);
        System.out.println("이름 : " + name);
        System.out.println("중간고사 점수 : " + (int) (mid * 0.4));
        System.out.println("기말고사 점수 : " + (int) (fin * 0.4));
        System.out.println("결석횟수 : " + (int) (abs * 0.1));
        System.out.println("레포트 점수 : " + (int) (rep * 0.1));
        System.out.println("총점 : " + sum);
        System.out.println("학점 : " + grade);

        sc.close();


    }


}

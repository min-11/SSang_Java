package ch02_unit01;

import java.util.Scanner;

public class SwitchCaseWord {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("값 입력 : ");
//        int num = sc.nextInt();
//
//        switch (num/10) {
//            case 10:
//            case 9:
//                System.out.println("수");
//                break;
//            case 8:
//                System.out.println("우");
//                break;
//            case 7:
//                System.out.println("미");
//                break;
//            case 6:
//                System.out.println("양");
//                break;
//            default:
//                System.out.println("가");
//                break;
//        }


//        System.out.print("두수 입력 : ");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//
//        System.out.print("연산자 입력 : ");
//        String op = sc.next();
//
//        switch (op){
//            case "+":
//                System.out.println(num1 + num2);
//                break;
//            case "-":
//                System.out.println(num1 - num2);
//                break;
//            case "*":
//                System.out.println(num1 * num2);
//                break;
//            case "/":
//                System.out.println(num1 / num2);
//                break;
//            default:
//                System.out.println("연산자를 잘못 입력하셨습니다.");
//                break;
//        }


//        System.out.print("연도 입력 : ");
//        int year = sc.nextInt();
//        System.out.print("월 입력 : ");
//        int month = sc.nextInt();
//
//        switch (month){
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.println(year + "년 "+ month + "월은 31일까지 있습니다.");
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println(year + "년 "+ month + "월은 30일까지 있습니다.");
//                break;
//            case 2:
//                if(year%4 == 0 && year%100 !=0 || year% 400 == 0){
//                    System.out.println(year + "년 "+ month + "월은 29일까지 있습니다.");
//                } else {
//                    System.out.println( year + "년 "+ month + "월은 28일까지 있습니다.");
//                }
//                break;
//            default:
//                System.out.println("월을 잘못 입력하셨습니다.");
//                break;
//        }


        sc.close();

    }



}

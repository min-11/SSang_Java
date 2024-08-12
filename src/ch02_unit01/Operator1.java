package ch02_unit01;

import java.util.Date;
import java.util.Scanner;

import static java.lang.Math.abs;

// 연산자
public class Operator1 {
    public static void main(String[] args) {

//        boolean a = 10>3 ? true : false;
//
//        System.out.println(a);


        // 초입력해 시 분 초로 변환하는 프로그램
//        Scanner sc = new Scanner(System.in);
//        System.out.print("초 입력:");
//        int second = sc.nextInt();
//        System.out.println(second + "초는 " + second/3600 + "시간 " + second%3600/60 + "분 " + second%60 + "초 입니다.");
//        sc.close();

        Date date = new Date();

        // 금액을 입력해 입력받은 급액을 50000원권에서 1원권까지의 화폐매수를 출력하는 프로그램
//        Scanner sc1 = new Scanner(System.in);
//        System.out.print("금액 입력:");
//        int money = sc1.nextInt();
//        System.out.println("50000원권: " + money/50000 + "매");
//        money %= 50000;
//        System.out.println("10000원권: " + money/10000 + "매");
//        money %= 10000;
//        System.out.println("5000원권: " + money/5000 + "매");
//        money %= 5000;
//        System.out.println("1000원권: " + money/1000 + "매");
//        money %= 1000;
//        System.out.println("500원: " + money/500 + "개");
//        money %= 500;
//        System.out.println("100원: " + money/100 + "개");
//        money %= 100;
//        System.out.println("50원: " + money/50 + "개");
//        money %= 50;
//        System.out.println("10원: " + money/10 + "개");
//        money %= 10;
//        System.out.println("5원: " + money/5 + "개");
//        money %= 5;
//        System.out.println("1원: " + money + "개");
//        sc1.close();
        // 금액을 입력해 입력받은 급액을 50000원권에서 1원권까지의 화폐매수를 출력하는 프로그램
//        Scanner sc1 = new Scanner(System.in);
//        System.out.print("금액 입력:");
//        int money = sc1.nextInt();
//        int[] number = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
//
//        for (int i = 0; i < number.length; i++) {
//            System.out.println(number[i] + "원권: " + money / number[i] + "매");
//            money %= number[i];
//        }
//        sc1.close();

//        double a = 123.4563;
//        System.out.printf("%.2f\n", a);
//        a = (int) (a * 100) / 100.0;
//        System.out.println(a);

        Scanner sc = new Scanner(System.in);
//        System.out.print("주행거리 입력:");
//        int street = 467;//sc.nextInt();
//        System.out.print("시속 입력:");
//        int speed = 110;//sc.nextInt();
//
//        // 소수점을 살려서 분과 초를 계산하기위해
//        double time = (double)street/speed;
//
//        int m = (int) (time * 60%60);
//        double s = (time * 3600)%60;
//        s = (int) (s*100)/100.0;
//        System.out.println((street/speed)+"시간"+m+"분"+s+"초");

//        System.out.print("반지름 입력:");
//        int c = sc.nextInt();
//
//        System.out.println("원의 넓이: " + (int)(c * c * Math.PI));
//        System.out.println("원의 둘레: " + (int)(c * 2 * Math.PI ));


        // 삼항연산자
        // 절대값 구하기

//        System.out.print("정수 입력:");
//        int a = sc.nextInt();
//
//        int b = a > 0 ? a : -a;
//        System.out.println("절대값: " + b);
//        System.out.println(abs(a));

        // 홀/짝 파악
//        System.out.print("홀짝 입력:");
//        int number = sc.nextInt();
//        System.out.println(number%2 == 0 ?  "짝" : "홀");

        // 정수 2개 입력받아 2개의 수 사이의 정수 개수 구하기
        // 2~5 입력시 2 3 4 5 4개

//        int a,b;
//        System.out.print("정수 2개 입력:");
//        a = sc.nextInt();
//        b = sc.nextInt();
//
//        int count = a > b ? a - b + 1 : b - a + 1;
//        System.out.println("두 수 사이의 정수 개수: " + count);
//
//
//        sc.close();





    }


}

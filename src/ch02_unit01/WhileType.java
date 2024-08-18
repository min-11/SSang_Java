package ch02_unit01;

import java.util.Scanner;

public class WhileType {

    public static void main(String[] args) {

        char c = 'A';


        // refactoringMethod(c);

        // 1~100까지의 합과 짝수합
        //hundredMethod(n, s);

        // 1~100까지 홀수합
        //oddNumberMethod(n, s);


        // 1~100 곱하기
        //hundredMethod_x(n, s);

        Scanner sc = new Scanner(System.in);

        // 입력한 값까지 홀수한번 전체한번 더하기
        //method1(sc);

        // 구구단 입력
        guguDanInsertMethod(sc);

        // 1~100까지 합을 출력하되 숫자가 10의 배수가 될때마다 합출력
        tenMultipleSumMethod();


        sc.close();

    }

    private static void tenMultipleSumMethod() {
        int s,n;
        n=s=0;
        while (n<100){
            n++;
            s+=n;
            if(n%10==0){
                System.out.println("1~"+n+"까지의 합 : "+s);
            }
        }
    }

    private static void guguDanInsertMethod(Scanner sc) {
        System.out.print("구구단 입력 : ");
        int dan = sc.nextInt();

        int x = 1;
        while (x < 10) {
            System.out.println(dan + " * " + x + " = " + dan * x);
            x++;
        }

    }

    private static void method1(Scanner sc) {
        System.out.print("값 입력 : ");
        int num = sc.nextInt();
        int x = 0;
        int sum, a;
        sum = a = 0;

        while (++x <= num) {
            sum += x;
            int as = x % 2 == 1 ? x : 0;
            a += as;
        }
        System.out.println(sum);
        System.out.println(a);

    }

    private static void hundredMethod_x() {
        int n = 0;
        int s = 1;
        while (++n <= 10) {
            s *= n;
        }
        System.out.println("결과 : " + s);
    }

    private static void oddNumberMethod() {
        int n = 0;
        int s = 1;
        while (n < 100) {
            s += n;
            n += 2;
        }
        System.out.print("결과 : " + s);
    }

    private static void hundredMethod() {

        int s, n;
        s = n = 0;
        // 1~100까지 짝수합
//        while (n<100){
//            n+=2;
//            s+=n;
//        }
//        System.out.print("결과 : "+ s);

        while (n < 100) {
            n++;
            s += n;
        }
        System.out.println("결과 : " + s);
    }


    private static void refactoringMethod(char c) {
//        while (++a < 10) {
//            //a++;
//            System.out.println("a = " + a);
//        }

        int a = 0;
        while (c <= 'Z') {
            a++;
//            String st = a%7 == 0 ? "\n" : " ";
//            System.out.print(c + st);
            System.out.print(c + (a % 7 == 0 ? "\n" : " "));

            c++;
        }
        System.out.println();

    }


}

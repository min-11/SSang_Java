package ch02_unit01;

import java.util.Scanner;

public class WhileQuiz {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // 1번
        //firstMethod(sc);

        // 2번
        //second();

        // 3번
        //third();

        // 4번
        //four();


        // 5번
         //five();


        // 6번
        //six(sc);


        // 7번
        //seven();

        // 8번
        //eight();


        // 9번
        // nine();

        // 10번
        ten();


        sc.close();
    }

    private static void firstMethod(Scanner sc) {
        int a, sum, sum1, sum2;
        sum = sum1 = sum2 = 0;
        a = 0;
        int s1 = 0;

        System.out.print("값을 입력하세요 : ");
        int num1 = sc.nextInt();
        while (++a <= num1) {
            sum += a;
            sum1 = ((a % 2) == 0) ? (sum1 += a) : sum1;
            sum2 = ((a % 2) == 1) ? (sum2 += a) : sum2;


        }
        System.out.println("1~" + num1 + "까지의 합 : " + sum);
        System.out.println("1~" + num1 + "까지의 짝수합 : " + sum1);
        System.out.println("1~" + num1 + "까지의 홀수합 : " + sum2);
    }

    private static void second() {
        int a, sum;
        a = sum = 0;

        while (++a <= 10) {
            if (a % 2 == 0) {
                sum -= a;
            } else {
                sum += a;
            }
        }
        System.out.println("1~10까지의 합 : " + sum);
    }

    private static void third() {
        char c = 'A';
        int a = 0;
        while (c <= 'Z') {
            a++;
            System.out.print((a % 5 == 0 ? c + "\n" : c + " "));
            c++;
        }
    }

    private static void four() {
        int a,sum, check;
        a = sum = check = 0;

        while (++a <= 100) {
            if (a % 3 == 0 || a % 5 == 0) {
                sum += a;
                check++;
            }
        }
        System.out.println("1~100까지 3또는 5의 배수의 합 : " + sum);
        System.out.println("1~100까지 3또는 5의 평균: " + sum / check);
    }

    private static void five() {
        int a, sum;
        a = sum = 0;

        while (sum <= 100) {
            a++;
            sum+=a;
        }
        System.out.println("최소의 n :" + a);
        System.out.println("합 : " + sum);
    }

    private static void six(Scanner sc) {
        int sum = 0;
        System.out.print("두 정수 입력:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        int store = a;
        while (a <= b) {
            sum += a;
            a++;
        }
        System.out.println(store + "부터" + b + "사이의 합: " + sum);
    }

    private static void seven() {
        int x = 100;
        int y = 0;
        int num = 0;
        while (x >= y) {
            num++;
            x += 2;
            y += 5;

        }

        System.out.println("x : " + x);
        System.out.println("y : " + y);
        System.out.println("걸린시간 : " + num + "초");
    }

    private static void eight() {
        int a = 0;
        int sum = 1;
        int sum2 = 0;
        while (a < 20) {
            sum += a;
            sum2 += sum;
            a++;
        }
        System.out.println("결과 : " + sum2);
    }

    private static void nine() {
        int a = 1, b = 1;
        int sum = 0;

        while (a <= 21) {
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("결과 : " + sum);
    }

    private static void ten() {
        int x = 1;
        while (x < 10) {
            int y = 2;
            while (y < 10) {
                System.out.print(y + " * " + x + " = " + x * y + "\t");
                y++;
            }
            System.out.println();
            x++;
        }
        System.out.println();

//        for (int a=1; a < 10 ; a++){
//            for (int b = 2; b < 10 ; b++){
//                System.out.print(b + " * " + a + " = " + b * a + "\t");
//            }
//            System.out.println();
//        }


    }





}

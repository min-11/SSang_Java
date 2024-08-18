package loop;

import java.util.Scanner;

public class LoopCaseQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //1
        //first(sc);

        //2
        //two();

        // 3
        //third();

        // 4
        //four();


        // 5
        // five(); 내가 한거
        // five2(); 강사님이 하신거


        // 6

        // six2(); 강사님이 하신거

        // 7
        //seven();
        // seven2(); // 3번 사용


        sc.close();
    }

    private static void seven2() {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 2; k <= 5; k++) {
                    if (i == 2){
                        System.out.print(k+4 + " * " + j + " = " + (j * (k+4)) + "\t");
                    }else {
                        System.out.print(k + " * " + j + " = " + (j * k) + "\t");
                    }

                }
                System.out.println();
            }
            System.out.println();
        }
    }

    private static void six2() {
        int s;
        for (int i =4 ; i<=1000;i++){
            s=0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    s += j;
                }
            }
            if (s == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void five2() {
        boolean b;
        int cnt = 0;
        for (int i = 2; i <= 100; i++) {
            b = false;
            for (int f = 2; f < i; f++) {
                if (i % f == 0) {
                    b = true;
                    break;
                }
            }
            if (!b) {
                System.out.printf("%5d",i);
                cnt++;
                if (cnt % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n\n소수의 개수 : " + cnt);
    }

    private static void five() {
        int b = 0;
        for (int i = 2; i <= 100; i++) {
            int a = 0;
            for (int f = 1; f <= i; f++) {
                if (i % f == 0) {
                    a++;
                }
            }
            if (a == 2) {
                b++;
                System.out.print(i + (b % 10 == 0 ? "\n" : "\t"));
            }
        }
        System.out.println();
        System.out.println("소수의 개수 : " + b);
    }

    private static void seven() {
        int num = 1;
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
            }
            System.out.println();

        }
        System.out.println();

        for (int i = 1; i <= 9; i++) {
            for (int j = 6; j <= 9; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
            }
            System.out.println();
        }
    }

    private static void third() {
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    if (a + b + c == 25) {
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }

    private static void first(Scanner sc) {
        int diff = 0;
        int min = 0;
        int result = 0;
        System.out.print("5개의 정수 입력 : ");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            diff = num > 7 ? num - 7 : 7 - num;
            if (i == 0 || min > diff) {
                min = diff;
                result = num;
            }

        }
        System.out.println(result);
    }

    private static void two() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print(((3 * i) + (6 * j) == 27 ? "[" + i + "," + j + "]\n" : ""));
            }
        }
    }

    private static void four() {
        int sum = 1;
        // System.out.print(sum);
        for (int i = 2; i <= 10; i++) {

//            if (i % 2 == 0) {
//                sum -= i;
//                System.out.print(" - " + i);
//            } else {
//                sum += i;
//                System.out.print(" + " + i);
//            }

            if (i % 2 == 1) {
                sum += i;
                System.out.print(i + " - ");
            } else {
                sum -= i;
                System.out.print(i + (i == 10 ? "=" : " + "));
            }

        }
        System.out.println(sum);
    }


}

package loop;

import java.util.Scanner;

public class LoopCase {

    public static void main(String[] args) {

//        int n, s;
//        s = 0;
//        for (n = 1; n <= 10; n++) {
//            s+=n;
//            System.out.println("n = " + n + " sum = " + s);
//        }
//
//        System.out.println("결과 = " + s);
//
//        for(n=1,s=0;n<=10;s+=n,n++);
//        System.out.println("결과 = " + s);
//

        Scanner sc = new Scanner(System.in);

        // 1~100까지 수중 3의 배수를 한줄에 10출력
        // 마지막에 3의배수의 합과 평균 출

        int sum = 0;
        int count = 0;
       /* for(int i = 1; i <=100 ; i++){
            if (i % 3 == 0){
                System.out.printf((i%10 == 0 ? "%d\n" : "%d\t"), i);
                sum+=i;
                count++;
            }
        }
        System.out.printf("\n합계 : %d\n", sum);
        System.out.printf("\n평균 : %.2f\n", (double)(sum/count));*/


//        for (int i = 3; i <=100 ; i+=3){ // if문을 사용하지 않은 코드 간결화
//            count++;
//            System.out.printf((count%10 == 0 ? "%d\n" : "%d\t"), i);
//            sum+=i;
//        }
//        System.out.printf("\n합계 : %d\n", sum);
//        System.out.printf("\n평균 : %.2f\n", (double)(sum/count));


        // 1

        //  first(sc, sum);

        // 2
        //gugu(sc);

        // 3
        //third(sc);

        //4
        //four();

        // 5
        //five(sc);


        // 6
        //six(sc);

        // 7
        sum = 1;
        //seven(sc, sum);

        // 8
        eight();


        // 9
        sum = 0;
        //nine(sum);

        sc.close();


    }

    private static void eight() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print((i+j == 9 ? "["+i +",\t"+j+"]\n" :""));
            }
        }
    }

    private static void nine(int sum) {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 != 0) {
                sum += i;
            } else {
                sum += i;
                System.out.println(i - 9 + "\t~\t" + i +"\t"+ "까지 합 : " + sum);
                sum = 0;
            }
        }
    }

    private static void seven(Scanner sc, int sum) {
        System.out.print("두개의 정수 입력 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                cnt++;
            }
        }
        System.out.println("합계 : " + sum);
        System.out.printf("평균 : %.2f", (double) sum / cnt);
    }

    private static void six(Scanner sc) {
        int storage = 0;
        System.out.print("10개 입력 : ");
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            storage = storage >= a || storage == 0 ? a : storage;
        }
        System.out.println("최소값 : " + storage);
    }


    private static void five(Scanner sc) {
        int max = 0;
        System.out.print("10개 입력 : ");
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            max = max <= a || max == 0 ? a : max;
        }
        System.out.println("최대값 : " + max);

    }

    private static void four() {
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%d * %d = %d\t", j, i, i * j);
            }
            System.out.println();
        }
    }

    private static void third(Scanner sc) {
        System.out.print("10개의 정수 입력 : ");
        int sum1, sum2;
        sum1 = sum2 = 0;
        for (int a = 0; a < 10; a++) {
            int b = sc.nextInt();
            sum1 = b % 2 == 0 ? ++sum1 : sum1;
            sum2 = b % 2 == 1 ? ++sum2 : sum2;
        }
        System.out.println("홀수의 개수 : " + sum2);
        System.out.println("짝수의 개수 : " + sum1);
    }

    private static void gugu(Scanner sc) {
        int a;
        do {
            System.out.print("구구단 입력 : ");
            a = sc.nextInt();
        } while (a < 2 || a > 9);
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", a, i, a * i);
        }
    }

    private static void first(Scanner sc, int sum) {
        int a;
        do {
            System.out.print("정수 입력 : ");
            a = sc.nextInt();
        } while (a < 1 || a > 1000);

        for (int i = 1; i <= a; i++) {
            sum += i;
        }

        System.out.println("결과 : " + sum);
    }


}
